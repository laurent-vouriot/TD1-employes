package fr.univ_amu.iut.exo2;

import java.time.LocalDate;


/**
 * @author Laurent Vouriot
 * @class Ordinaire extends Employe
 * @brief classe fille Employe, un employé ordinaire effectue des tâches ordinaires
 */
public class Ordinaire extends Employe {

    public Ordinaire(int numEmp, int numSecu, String nom, String prenom, int echelon, LocalDate dateNais, LocalDate dateEmbauche) {
        super(numEmp, numSecu, nom, prenom, echelon, dateNais, dateEmbauche);
    }//ordinaire()

    public void effectuerDeTacheOrdinaire() {
        System.out.println("beep boop je suis un employé  ordinaire qui effectue des tâches ordinaires...\n");
    }//effectuerTacheOrdinaire()

    @Override
    public double salaireBrut() {
        return super.salaireBrut() + this.getEchelon() * 100;
    }
}//Employe
