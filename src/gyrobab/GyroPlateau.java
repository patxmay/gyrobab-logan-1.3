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
public class GyroPlateau extends ModeleGyropode {
    private String sysAutoEquilibrage;
    private boolean sacTransport;
    private String sysTorsion;
    private String typePantins;
    
    //Constructeurs
    
    //-----Gyroguidon avec coffrre lateral et coffre avant.
 public GyroPlateau(String nomGyropode, double poidGyropode, double vitesseMaxGyropode, String autonomieGyropode,
                       String tempsChargeGyropode, String batterieGyropode, double puissanceMoteurGyropode,
                       ArrayList<String> specificite, String deniveleMaxGyropode, double poidMaxGyropode,
                       String typeRouesGyropode, String dimensionGyropode, Date dateCommercialisationGyropode,MarqueGyropode marqueG,
                       String sysAutoEquilibrage, boolean sacTransport, String sysTorsion, String typePantins) {
     
     
        super(nomGyropode, poidGyropode, vitesseMaxGyropode, autonomieGyropode, tempsChargeGyropode, batterieGyropode,
              puissanceMoteurGyropode, specificite, deniveleMaxGyropode, poidMaxGyropode,
              typeRouesGyropode, dimensionGyropode, dateCommercialisationGyropode,marqueG);
        
        this.sysAutoEquilibrage = sysAutoEquilibrage;
        this.sacTransport = sacTransport;
        this.sysTorsion = sysTorsion;
        this.typePantins = typePantins;
        
 }

    
    //setters et getters 
    public void setSysAutoEquilibrage(String autoEquilibrage){
        this.sysAutoEquilibrage=autoEquilibrage;
    }
    public String getSysAutoEquilibrage(){
        return this.sysAutoEquilibrage;
    }
    //----------------------------------------------------------
    public void setSacTransport(boolean sacTransport){
        this.sacTransport=sacTransport;
    }
    public boolean getSacTransport(){
        return this.sacTransport;
    }    
    //-------------------------------------------------------
    public void setSysTorsion(String sysTorsion){
        this.sysTorsion=sysTorsion;
    }
    public String getSysTorsion(){
        return this.sysTorsion;
    }
    //-------------------------------------------------------
    public void setTypePantins(String typeP){
        this.typePantins=typeP;
    }
    public String getTypePantins(){
        return this.typePantins;
    }
        @Override
    public String toString(){
        return super.toString()+"Systeme de poigne d'auto équilibrage :" + this.sysAutoEquilibrage +" Sac de transport présent ? : "+this.sacTransport+" Système de torsions : "+this.sysTorsion + "Type de pantins " + this.typePantins; 
    }
}
  

