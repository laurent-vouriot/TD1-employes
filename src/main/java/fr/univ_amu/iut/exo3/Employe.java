package fr.univ_amu.iut.exo3;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Laurent
 * @class Employe
 * @brief classe des employés
 */
public class Employe {
    private int       numEmp;
    private int       numSecu;
    private String    nom;
    private String    prenom;
    private int       echelon;
    private LocalDate dateNais;
    private LocalDate dateEmbauche;
    private long      bonus;

    private double base;
    private double nbHeures;


    public Employe(int numEmp, int numSecu, String nom, String prenom, int echelon, LocalDate dateNais, LocalDate dateEmbauche ) {
        this.numEmp         = numEmp;
        this.numSecu        = numSecu;
        this.nom            = nom;
        this.prenom         = prenom;
        this.echelon        = echelon;
        this.dateNais       = dateNais;
        this.dateEmbauche   = dateEmbauche;



    }//Employe()

    public String toString(){
         return  "numéro : "                + this.numEmp       +
                 "\nnuméro sécu : "         + this.numSecu      +
                 "\nnom : "                 + this.nom          +
                 "\nprénom : "              + this.prenom       +
                 "\nechelon : "             + this.echelon      +
                 "\ndate de naissance : "   + this.dateNais     +
                 "\ndate d'embauche : "     + this.dateEmbauche +
                 "\nancienneté : "          + ChronoUnit.MONTHS.between(this.getDateEmbauche(),LocalDate.now()) +
                 "\nBonus : "               + this.bonus   + "\n";
    }//toString()

    public double salaireBrut() {
        return this.base*this.nbHeures + 100 ;
    }

    public double salaireNet() {
        return this.salaireBrut() * 0.8;
    }


    //============= GETTERS ======================================================
    public int getEchelon() {return this.echelon;}
    public double getBase() {return this.base;}

    public int getNumEmp() {
        return numEmp;
    }

    public int getNumSecu() {
        return numSecu;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNais() {
        return dateNais;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public void setBase    (double base)     {this.base     = base;}
    public void setnbHeures(double nbHeures ){this.nbHeures = nbHeures;}

    public void setBonus(long bonus) {this.bonus = bonus;}
}


