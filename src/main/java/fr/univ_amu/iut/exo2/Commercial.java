package fr.univ_amu.iut.exo2;


import java.time.LocalDate;

/**
 * @author Laurent Vouriot
 * @class Commercial extends Employe
 * @brief classe fille de employé, un commercial
 */
public class Commercial  extends Employe{

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
        System.out.println("salaire brut Commercial");
       return this.getBase() + this.chiffreAffaires * this.tauxCommission + 100;
    }//salaireBrut()

}//Commerical
