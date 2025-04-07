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
public class GyroGuidon  extends ModeleGyropode {    
    private String hauteurGuidon;
    private String volumeCoffreLateral;
    private String volumeCoffreAvant;
    private String surfacePorteBagage;
    
    //Constructeurs
    
    //-----Gyroguidon avec coffre lateral et coffre avant.
    public GyroGuidon(String nomGyropode, double poidGyropode, double vitesseMaxGyropode, String autonomieGyropode,
                          String tempsChargeGyropode, String batterieGyropode, double puissanceMoteurGyropode,
                          ArrayList<String> specificite, String deniveleMaxGyropode, double poidMaxGyropode,
                          String typeRouesGyropode, String dimensionGyropode, Date dateCommercialisationGyropode,MarqueGyropode marqueG,String hauteurG,String volumeCoffreL,String volumeCoffreA,String surfacePB){
        super(nomGyropode, poidGyropode, vitesseMaxGyropode, autonomieGyropode, tempsChargeGyropode, batterieGyropode,
              puissanceMoteurGyropode, specificite, deniveleMaxGyropode, poidMaxGyropode,
              typeRouesGyropode, dimensionGyropode, dateCommercialisationGyropode,marqueG);
        this.hauteurGuidon=hauteurG;
        this.volumeCoffreLateral=volumeCoffreL;
        this.volumeCoffreAvant=volumeCoffreA;
        this.surfacePorteBagage=surfacePB;
    }
    //-----Gyroguidon sans coffre lateral ni coffre avant.
    public GyroGuidon(String nomGyropode, double poidGyropode, double vitesseMaxGyropode, String autonomieGyropode,
                          String tempsChargeGyropode, String batterieGyropode, double puissanceMoteurGyropode,
                          ArrayList<String> specificite, String deniveleMaxGyropode, double poidMaxGyropode,
                          String typeRouesGyropode, String dimensionGyropode, Date dateCommercialisationGyropode,MarqueGyropode marqueG,String hauteurG,String surfacePB){
        super(nomGyropode, poidGyropode, vitesseMaxGyropode, autonomieGyropode, tempsChargeGyropode, batterieGyropode,
              puissanceMoteurGyropode, specificite, deniveleMaxGyropode, poidMaxGyropode,
              typeRouesGyropode, dimensionGyropode, dateCommercialisationGyropode,marqueG);
        this.hauteurGuidon=hauteurG;
        this.surfacePorteBagage=surfacePB;
    }
    
    //-----Gyroguidon sans coffre lateral ni coffre avant.
    public GyroGuidon(String nomGyropode, double poidGyropode, double vitesseMaxGyropode, String autonomieGyropode,
                          String tempsChargeGyropode, String batterieGyropode, double puissanceMoteurGyropode,
                          ArrayList<String> specificite, String deniveleMaxGyropode, double poidMaxGyropode,
                          String typeRouesGyropode, String dimensionGyropode, Date dateCommercialisationGyropode,MarqueGyropode marqueG,String hauteurG){
        super(nomGyropode, poidGyropode, vitesseMaxGyropode, autonomieGyropode, tempsChargeGyropode, batterieGyropode,
              puissanceMoteurGyropode, specificite, deniveleMaxGyropode, poidMaxGyropode,
              typeRouesGyropode, dimensionGyropode, dateCommercialisationGyropode,marqueG);
        this.hauteurGuidon=hauteurG;
    }
    
    
    //setters et getters 
    public void setHauteurGuidon(String hauteur){
        this.hauteurGuidon=hauteur;
    }
    public String getHauteurGuidon(){
        return this.hauteurGuidon;
    }
    //----------------------------------------------------------
    public void setVolumeCoffreLateral(String volume){
        this.volumeCoffreLateral=volume;
    }
    public String getVolumeCoffreLateral(){
        return this.volumeCoffreLateral;
    }    
    //-------------------------------------------------------
    public void setVolumeCoffreAvant(String volume){
        this.volumeCoffreAvant=volume;
    }
    public String getVolumeCoffreAvant(){
        return this.volumeCoffreAvant;
    }
    //-------------------------------------------------------
    public void setSurfacePorteBagage(String surface){
        this.surfacePorteBagage=surface;
    }
    public String getSurfacePorteBagage(){
        return this.surfacePorteBagage;
    }
    public String toString(){
        return super.toString()+"Hauteur du guidon : " + this.hauteurGuidon +" volume du coffre avant : "+this.volumeCoffreAvant+" volume du coffre latéral : "+this.volumeCoffreLateral + "Surface du porte bagage " + this.surfacePorteBagage; 
    }
}
