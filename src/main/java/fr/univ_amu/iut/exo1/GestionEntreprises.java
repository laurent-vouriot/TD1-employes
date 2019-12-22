package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Employe emp1 = new Employe( 1,1000,"Vouriot","Laurent",3,LocalDate.of(2000, Month.FEBRUARY,16),LocalDate.of(2014,Month.DECEMBER,1));
        Employe emp2 = new Employe(2,1001,"Weber","Philemon",2,LocalDate.of(2000,Month.JULY,15),LocalDate.of(2005,Month.JANUARY,1));

        emp1.setBase(15);// 15 euro de l'heure
        emp1.setnbHeures(1607); // 1607 heures/an

        emp2.setBase(14);
        emp2.setnbHeures(1500);

        Entreprise ent1 = new Entreprise("maBoiteInfo");
        ent1.embaucher(emp1);
        ent1.embaucher(emp2);
        System.out.println(ent1.toString());
        ent1.licencier(emp1);
        System.out.println("\naprès licenciement" + ent1.toString());

    }//main
}
/*
    Exo 1 Question 3 : elle n'est pas suffisante car le calcul  du salaire est identique pour tous les employés, pour changer la formule  du calcule du salaire net il faut modifier la methdde salaireNet()
 */