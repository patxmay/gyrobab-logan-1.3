/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyrobab;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lgaray
 */
public class Louer {
    private double prixFacture;
    private int nbrLocation;
    private Date dateLocation;
    private String momentJourneeLocation;
    private long nombreKmParcourus;
    private long nombreHeureRoulage;
    private static double chiffreAffaire;
    private ArrayList<Gyropode> GyropodeLouer;
    private Usager Locataire;
   
     //constructeur si il y'a plusieurs gyropode-----------------------------------
    public Louer(double prixF,int nbrLoca,Date dateLoc,String momentJ,Usager Locataire,ArrayList<Gyropode> GyropodeLouer){
        this.prixFacture=prixF;
        this.nbrLocation=nbrLoca;
        this.dateLocation=dateLoc;
        this.momentJourneeLocation=momentJ;
        this.Locataire=Locataire;
        this.GyropodeLouer=GyropodeLouer;
        
        for(int i=0;i<this.GyropodeLouer.size();i++){
            this.GyropodeLouer.get(i).setNbrUtilistationGyropode(this.GyropodeLouer.get(i).getNbrUtilistationGyropode()+1);
        }
        Gyropode.setNombreUtilisationTotal(Gyropode.getNombreUtilisationTotal()+nbrLoca);
        Louer.chiffreAffaire+=prixF;
    }
     //constructeur si il n'y a qu'un gyropode-----------------------------------
    public Louer(double prixF,Date dateLoc,String momentJ,Usager Locataire,Gyropode GyropodeLouer){
        this.prixFacture=prixF;
        this.dateLocation=dateLoc;
        this.momentJourneeLocation=momentJ;
        this.Locataire=Locataire;
        this.GyropodeLouer.add(GyropodeLouer);
        
        this.GyropodeLouer.get(0).setNbrUtilistationGyropode(this.GyropodeLouer.get(0).getNbrUtilistationGyropode()+1);
        Gyropode.setNombreUtilisationTotal(Gyropode.getNombreUtilisationTotal()+1);
        Louer.chiffreAffaire+=prixF;
    }

    public int getNbrLocation() {
        return nbrLocation;
    }

    public void setNbrLocation(int nbrLocation) {
        this.nbrLocation = nbrLocation;
    }

    public static double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public static void setChiffreAffaire(double chiffreAffaire) {
        Louer.chiffreAffaire = chiffreAffaire;
    }

    public ArrayList<Gyropode> getGyropodeLouer() {
        return GyropodeLouer;
    }

    public void setGyropodeLouer(ArrayList<Gyropode> GyropodeLouer) {
        this.GyropodeLouer = GyropodeLouer;
    }

    public Usager getLocataire() {
        return Locataire;
    }

    public void setLocataire(Usager Locataire) {
        this.Locataire = Locataire;
    }

    public long getNombreKmParcourus() {
        return nombreKmParcourus;
    }

    public void setNombreKmParcourus(long nombreKmParcourus) {
        this.nombreKmParcourus = nombreKmParcourus;
    }

    public long getNombreHeureRoulage() {
        return nombreHeureRoulage;
    }

    public void setNombreHeureRoulage(long nombreHeureRoulage) {
        this.nombreHeureRoulage = nombreHeureRoulage;
    }
    

    

    //getters et setters--------------------------------------------------------
    public double getPrixFacture(){
        return this.prixFacture;
    }
    public void setPrixFacture(double prixFacture){
        Louer.chiffreAffaire-=this.prixFacture;
        this.prixFacture=prixFacture;
        Louer.chiffreAffaire=prixFacture;
        
    }
    //--------------------------------------------------------------------------
    public int getNombreLocation(){
        return this.nbrLocation; 
    }
    public void setNombreLocation(int nbrLoc){
        this.nbrLocation=nbrLoc;
    }
    //--------------------------------------------------------------------------
    public Date getDateLocation(){
        return this.dateLocation;
    }
    public void setDateLocation(Date dateLoc){
        this.dateLocation=dateLoc;
    }
    //--------------------------------------------------------------------------
    public String getMomentJourneeLocation(){
        return this.momentJourneeLocation;
    }
    public void setMomentJourneeLocation(String momentJ){
        this.momentJourneeLocation=momentJ;
    }
    //--------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Louer{" + "prixFacture=" + prixFacture + ", nbrLocation=" + nbrLocation + ", dateLocation=" + dateLocation + ", momentJourneeLocation=" + momentJourneeLocation + ", nombreKmParcourus=" + nombreKmParcourus + ", nombreHeureRoulage=" + nombreHeureRoulage + ", GyropodeLouer=" + GyropodeLouer + ", Locataire=" + Locataire + '}';
    }
   
    
}
