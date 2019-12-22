package fr.univ_amu.iut.exo2;

import java.time.LocalDate;


/**
 * @author Laurent Vouriot
 * @class Vendeur extends Commercial
 * @brief classe vendeur, qui est une sorte de commercial
 */
public class Vendeur extends Commercial{
    public Vendeur(int numEmp, int numSecu, String nom, String prenom, int echelon, LocalDate dateNais, LocalDate dateEmbauche) {
        super(numEmp, numSecu, nom, prenom, echelon, dateNais, dateEmbauche);
    }//Vendeur()



    // super appel la classe parent mais laquelle ?

    @Override
    public double salaireBrut() {
        return super.salaireBrut();
    }//salaireBrut()
}//Vendeur

