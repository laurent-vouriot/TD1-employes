package fr.univ_amu.iut.exo3;


import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.PriorityQueue;

/**
 * EXO 3 REPARTITION BONUS
 */
public class GestionEntreprises {
   public static void main(String[] args){

        Collection<Employe>  listeOrdre = new PriorityQueue<>(new MyComparator());

        Employe  emp1 = new Employe(2,1001,"Weber","Philemon",2, LocalDate.of(2000, Month.JULY,15),LocalDate.of(2019,Month.JANUARY,1));
        Employe  emp2 = new Employe(3,1002,"Tortora","Stefano",1, LocalDate.of(2000,Month.AUGUST,12),LocalDate.of(2015,Month.DECEMBER,1));
        Employe  emp3 = new Employe(4,1003,"Merotto","Lino",4,LocalDate.of(2001,Month.NOVEMBER,9),LocalDate.of(2006,Month.DECEMBER,1));
        Employe  emp4 = new Employe(5,1004,"Vallas","Jérôme",2,LocalDate.of(2000,Month.MARCH,13),LocalDate.of(2017,Month.DECEMBER,1));

        listeOrdre.add(emp2);
        listeOrdre.add(emp1);
        listeOrdre.add(emp3);
        listeOrdre.add(emp4);

        for(Employe e : listeOrdre) {System.out.println(e.toString());}

        Entreprise ent1 = new Entreprise("maBoiteInfo");
        ent1.embaucher(emp2);
        ent1.embaucher(emp3);
        ent1.embaucher(emp4);
        ent1.embaucher(emp1);

        ent1.distribuerBonus(2000);


        System.out.println(ent1.toString());
    }//main()
}