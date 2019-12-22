package fr.univ_amu.iut.exo2;

import java.time.LocalDate;
import java.time.Month;
import fr.univ_amu.iut.exo2.Ordinaire;


/**
 * @author Laurent Vouriot
 * gestionEntreprise exo 2
 */
public class GestionEntreprises {
    public static void main(String[] args) {
        Commercial   emp1 = new Commercial( 1,1000,"Vouriot","Laurent",3,LocalDate.of(2000, Month.FEBRUARY,16),LocalDate.of(2004,Month.DECEMBER,1));
        Technicien   emp2 = new Technicien(2,1001,"Weber","Philemon",2,LocalDate.of(2000,Month.JULY,15),LocalDate.of(2004,Month.DECEMBER,1));
        Ordinaire    emp3 = new Ordinaire(3,1002,"Tortora","Stefano",1, LocalDate.of(2000,Month.AUGUST,12),LocalDate.of(2004,Month.DECEMBER,1));
        Vendeur      emp4 = new Vendeur(4,1003,"Merotto","Lino",4,LocalDate.of(2001,Month.NOVEMBER,9),LocalDate.of(2004,Month.DECEMBER,1));
        Representant emp5 = new Representant(5,1004,"Vallas","Jérôme",2,LocalDate.of(2000,Month.MARCH,13),LocalDate.of(2004,Month.DECEMBER,1));

        emp1.setBase(15);// 15 euro de l'heure
        emp1.setnbHeures(1607); // 1607 heures/an
        emp1.setChiffreAffaires(10000);
        emp1.setTauxCommission(20);

        emp2.setBase(15);
        emp2.setnbHeures(1607);
        emp2.setNbUnitesProduites(5000);
        emp2.setTauxCommission(10);

        emp3.setBase(15);
        emp3.setnbHeures(1607);

        emp4.setBase(15);
        emp4.setnbHeures(1607);
        emp4.setChiffreAffaires(10000);
        emp4.setTauxCommission(20);

        emp5.setBase(15);
        emp5.setnbHeures(1607);
        emp5.setChiffreAffaires(10000);
        emp5.setTauxCommission(20);

        Entreprise ent1 = new Entreprise("maBoiteInfo");
        ent1.embaucher(emp1);
        ent1.embaucher(emp2);
        ent1.embaucher(emp3);
        ent1.embaucher(emp4);
        ent1.embaucher(emp5);
        System.out.println(ent1.toString());

        emp1.negocierTransaction();
        emp2.fabriquerProduit();
        emp3.effectuerDeTacheOrdinaire();



    }//main
}
