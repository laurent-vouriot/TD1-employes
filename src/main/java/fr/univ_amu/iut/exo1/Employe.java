package fr.univ_amu.iut.exo1;


import java.time.LocalDate;

/**
 * @author Laurent
 * @class Employe
 * @brief classe des employé
 */
public class Employe {
    private int numEmp;
    private int numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate dateNais;
    private LocalDate dateEmbauche;

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
         return  "numéro : "                + this.numEmp  +
                 "\nnuméro sécu : "         + this.numSecu +
                 "\nnom : "                 + this.nom     +
                 "\nprénom : "              + this.prenom  +
                 "\nechelon : "             + this.echelon +
                 "\ndate de naissance : "   + this.dateNais+
                 "\ndate d'embauche : "     + this.dateEmbauche + "\n";
    }//toString()

    public double salaireBrut() {
        return this.base*this.nbHeures;
    }//salaireBrut()

    public double salaireNet() {
        return this.salaireBrut() * 0.8;
    }//salaireNet()

    public void setBase    (double base)     {this.base     = base;}
    public void setnbHeures(double nbHeures ){this.nbHeures = nbHeures;}
}


