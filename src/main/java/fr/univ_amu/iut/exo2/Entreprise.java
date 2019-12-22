package fr.univ_amu.iut.exo2;


import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Laurent Vouriot
 * @class Entreprise
 * @brief classe de l'entreprise
 */
public class Entreprise {
    private String nom;
    private Collection<Employe> listeEmp = new ArrayList<>();

    public Entreprise(String nom)    {this.setNom(nom);}

    public void setNom(String nom)   {this.nom = nom;}

    public void embaucher(Employe e) {this.listeEmp.add(e);}

    public void licencier(Employe e) {this.listeEmp.remove(e);}

    public String toString() {
        String str = "nom de l'entrprise : " + this.nom + "\nliste des employés : ";
        for (Employe e : this.listeEmp) {
            str +="\n" +  e.toString() + "\nsalaire brut : " + e.salaireBrut() + "\n"
                +  "salaire net : " + e.salaireNet();
        }
        return str;
    }//toString()
}
