package fr.univ_amu.iut.exo3;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Laurent Vouriot
 * @class Entreprise
 * @brief classe de l'entreprise
 */
public class Entreprise {

    private String              nom;
    /*
    On  utilise une priority Queue qui tri les ses elements en fonction d'un element de comparaison qu'on lui passe en paramètrea
     */
    private Collection<Employe> listeEmp = new PriorityQueue<>(new MyComparator());

    public Entreprise(String nom)    {this.setNom(nom);}

    public void setNom(String nom)   {this.nom = nom;}

    public void embaucher(Employe e) {this.listeEmp.add(e);}

    public void licencier(Employe e) {this.listeEmp.remove(e);}

    public String toString() {
        String str = "nom de l'entrprise : " + this.nom + "\nliste des employés : ";
        for (Employe e : this.listeEmp) {
            str +="\n" +  e.toString()
                    + "salaire brut : " + e.salaireBrut() + "\n"
                    + "salaire net : " + e.salaireNet() + "\n";
        }
        return str;
    }//toString()

    void distribuerBonus(int bonus) {
            for (Employe e : listeEmp) {
                if (bonus <= 0)
                    break;
                else if (ChronoUnit.MONTHS.between(e.getDateEmbauche(),LocalDate.now()) * 10 > bonus) {
                    e.setBonus(bonus);
                    bonus -= ChronoUnit.MONTHS.between(e.getDateEmbauche(), LocalDate.now()) * 10;
                }
                else
                    e.setBonus(ChronoUnit.MONTHS.between(e.getDateEmbauche(),LocalDate.now()) * 10);
                bonus -= ChronoUnit.MONTHS.between(e.getDateEmbauche(),LocalDate.now()) * 10;
            }
    }//distribuerBonus()
}
