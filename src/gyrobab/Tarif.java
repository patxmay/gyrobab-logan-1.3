/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;

/**
 *
 * @author Utilisateur
 */
public class Tarif {
    private double prixTheorique;
    private Saison SaisonT;
    private ModeleGyropode ModeleG;

    
    //Constructeur-------------------------------------------------------------
    public Tarif(ModeleGyropode modeleG,Saison saisonT,double prix){
        this.ModeleG=modeleG;
        this.SaisonT=saisonT;
        this.prixTheorique=prix;
    }

   //getters et setters---------------------------------------------------------
    public double getPrixTheorique() {
        return this.prixTheorique;
    }

    public void setPrixTheorique(double prixTheorique) {
        this.prixTheorique = prixTheorique;
    }
    //---------------------------------------------------------------------------
    public Saison getSaisonT() {
        return this.SaisonT;
    }

    public void setSaisonT(Saison SaisonT) {
        this.SaisonT = SaisonT;
    }
    //----------------------------------------------------------------------------
    public ModeleGyropode getModeleG() {
        return ModeleG;
    }

    public void setModeleG(ModeleGyropode ModeleG) {
        this.ModeleG = ModeleG;
    }
    //--------------------------------------------------------------------------
    /*
    //---------------------------------------------------------------------------
    coder une méthode de calcul de prix en fonction de la saison et du modéle
    //--------------------------------------------------------------------------
    public String toStringG1() {
        return "Modèle : " + this.ModeleG1 + ", Saison : " + this.SaisonT + ", Prix : " + this.prixTheorique;
    }

    public String toStringG2() {
        return "Modèle : " + this.ModeleG2 + ", Saison : " + this.SaisonT + ", Prix : " + this.prixTheorique;
    }

    public String toStringG3() {
        return "Modèle : " + this.ModeleG3 + ", Saison : " + this.SaisonT + ", Prix : " + this.prixTheorique;
    }
    */



}
