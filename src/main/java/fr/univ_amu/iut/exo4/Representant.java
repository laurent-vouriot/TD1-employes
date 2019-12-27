package fr.univ_amu.iut.exo4;


import java.time.LocalDate;

/**
 * @author Laurent Vouriot
 * @class Representant extends Commercial
 * @brief classe representant, est une sorte de commercial
 */
public class Representant extends Commercial {
    public Representant(int numEmp, int numSecu, String nom, String prenom, int echelon, LocalDate dateNais, LocalDate dateEmbauche) {
        super(numEmp, numSecu, nom, prenom, echelon, dateNais, dateEmbauche);
    }//Representant()

    @Override
    public double salaireBrut() {
        Ordinaire o = new Ordinaire(this.getNumEmp(),this.getNumSecu(),this.getNom(),this.getPrenom(),this.getEchelon(),this.getDateNais(),this.getDateEmbauche());

        o.setBase(this.getBase());
        o.setnbHeures(this.getNbHeures());

        return o.salaireBrut();
    }
}//Representant

