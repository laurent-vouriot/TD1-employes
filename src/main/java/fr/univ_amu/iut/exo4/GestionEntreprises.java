package fr.univ_amu.iut.exo4;


import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.PriorityQueue;


/**
 * TD1 EX0 4 SERIALISATION
 */
public class GestionEntreprises {


    public static void main(String[] args) {

        PriorityQueue<Employe> PriorityQueueEmp = new PriorityQueue<>(new MyComparator());

        Employe emp1 = new Employe(2, 1001, "Weber", "Philemon", 2, LocalDate.of(2000, Month.JULY, 15), LocalDate.of(2019, Month.JANUARY, 1));
        Employe emp2 = new Employe(3, 1002, "Tortora", "Stefano", 1, LocalDate.of(2000, Month.AUGUST, 12), LocalDate.of(2015, Month.DECEMBER, 1));
        Employe emp3 = new Employe(4, 1003, "Merotto", "Lino", 4, LocalDate.of(2001, Month.NOVEMBER, 9), LocalDate.of(2006, Month.DECEMBER, 1));
        Employe emp4 = new Employe(5, 1004, "Vallas", "Jérôme", 2, LocalDate.of(2000, Month.MARCH, 13), LocalDate.of(2017, Month.DECEMBER, 1));

        PriorityQueueEmp.add(emp1);
        PriorityQueueEmp.add(emp2);
        PriorityQueueEmp.add(emp3);
        PriorityQueueEmp.add(emp4);

        try {

            /**
             * Serialisation des employés
             */
            FileOutputStream   fos = new FileOutputStream("/home/laurent/IdeaProjects/TD1-employes/employés.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Employe e : PriorityQueueEmp) {
                oos.writeObject(e);
                System.out.println(e.getNom() + " serialisé ");

            }
            oos.close();
            System.out.println("fin sérialisation \n");

            /**
             * Déserialisation
             */
            FileInputStream   ifs = new FileInputStream("/home/laurent/IdeaProjects/TD1-employes/employés.txt");
            ObjectInputStream ofs = new ObjectInputStream(ifs);

            while(true) {
                Employe e = (Employe) ofs.readObject();
                System.out.println(e.getNom() + " désérialisé");

            }

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }catch (ClassNotFoundException cnf) {
            cnf.getCause();
        }
    }



}