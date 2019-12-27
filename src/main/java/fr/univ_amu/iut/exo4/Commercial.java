package fr.univ_amu.iut.exo4;


import java.time.LocalDate;

/**
 * @author Laurent Vouriot
 * @class Commercial extends Employe
 * @brief classe fille de employé, un commercial
 */
public abstract class  Commercial  extends Employe {

    private double chiffreAffaires;
    private double tauxCommission;
    public Commercial(int numEmp, int numSecu, String nom, String prenom, int echelon, LocalDate dateNais, LocalDate dateEmbauche) {
        super(numEmp, numSecu, nom, prenom, echelon, dateNais, dateEmbauche);
    }//Commercial()

    public void negocierTransaction() {
        System.out.println("beep boop je suis  un  commercial et je negocie des transactions...");
    }//negocierTransaction

    public void setChiffreAffaires(double chiffreAffaires) {this.chiffreAffaires = chiffreAffaires;}
    public void setTauxCommission (double tauxCommission)  {this.tauxCommission = tauxCommission;}

    @Override
    public double salaireBrut() {

       return this.getBase() + this.chiffreAffaires * this.tauxCommission + 100;

    }//salaireBrut()

    public double getChiffreAffaires() {return chiffreAffaires;}
    public double getTauxCommission()  {return tauxCommission;}
}//Commerical
