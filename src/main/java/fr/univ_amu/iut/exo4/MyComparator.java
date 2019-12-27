package fr.univ_amu.iut.exo4;




import java.time.temporal.ChronoUnit;
import java.util.Comparator;

/**
 * @author Laurent Vouriot
 * @class MyComparator implements Comparator<Employe>
 * penser au paramètre de généricité de l'interface
 * @Brief implementation d'un comparateur pour trier les employés selon leur ancienneté
 */
public class MyComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return (int) ChronoUnit.MONTHS.between(e2.getDateEmbauche(), e1.getDateEmbauche());
    }//compare()
}//MyComparator
