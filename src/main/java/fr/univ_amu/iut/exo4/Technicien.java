package fr.univ_amu.iut.exo4;


import java.time.LocalDate;

/**
 * @author Laurent Vouriot
 * @class Technicien extends Employe
 * @breif classe fille d'employé, un technicien
 */
public class Technicien extends Employe {

    private int    nbUnitesProduites;
    private double tauxCommission;

    public Technicien(int numEmp, int numSecu, String nom, String prenom, int echelon, LocalDate dateNais, LocalDate dateEmbauche) {
        super(numEmp, numSecu, nom, prenom, echelon, dateNais, dateEmbauche);
    }//Technicien()

    public void fabriquerProduit() {
        System.out.println("beep boop je suis un technicien qui fabrique des produits...");
    }//fabriquerProduit

    public void setNbUnitesProduites(int nbUnitesProduites ) {this.nbUnitesProduites = nbUnitesProduites;}

    public void setTauxCommission(double tauxCommission) {this.tauxCommission = tauxCommission;}

    @Override
    public double salaireBrut() {
        return super.salaireBrut() + this.nbUnitesProduites * this.tauxCommission;
    }//salaireBrut()
}
