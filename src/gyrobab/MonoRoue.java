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
public class MonoRoue extends ModeleGyropode{
    private String sysPoigneeEmport;
    private String sysCalePied;
    private String freinGyroscopique;
    
    //Constructeurs
    
    //-----Gyroguidon avec coffrre lateral et coffre avant.
    
    public MonoRoue(String nomGyropode, double poidGyropode, double vitesseMaxGyropode, String autonomieGyropode,
                          String tempsChargeGyropode, String batterieGyropode, double puissanceMoteurGyropode,
                          ArrayList<String> specificite, String deniveleMaxGyropode, double poidMaxGyropode,
                          String typeRouesGyropode, String dimensionGyropode, Date dateCommercialisationGyropode,MarqueGyropode marqueG,
                    String sysPoigne,String sysCalePied,String freinGyroscopique){
        super(nomGyropode, poidGyropode, vitesseMaxGyropode, autonomieGyropode, tempsChargeGyropode, batterieGyropode,
              puissanceMoteurGyropode, specificite, deniveleMaxGyropode, poidMaxGyropode,
              typeRouesGyropode, dimensionGyropode, dateCommercialisationGyropode,marqueG);
        this.sysPoigneeEmport=sysPoigne;
        this.sysCalePied=sysCalePied;
        this.freinGyroscopique=freinGyroscopique;
    }

    
    //setters et getters 
    public void setSysPoigneeEmport(String poignee){
        this.sysPoigneeEmport=poignee;
    }
    public String getSysPoigneeEmport(){
        return this.sysPoigneeEmport;
    }
    //----------------------------------------------------------
    public void setSysCalePied(String calePied){
        this.sysCalePied=calePied;
    }
    public String getSysCalePied(){
        return this.sysCalePied;
    }    
    //-------------------------------------------------------
    public void setFreinGyroscopique(String freinGyroscopique){
        this.freinGyroscopique=freinGyroscopique;
    }
    public String getFreinGyroscopique(){
        return this.freinGyroscopique;
    }
    
    @Override
    public String toString(){
        return super.toString()+"Systeme de poigne d'emport :" + this.sysPoigneeEmport +" Système de Cale pied "+this.sysCalePied+" frein Gyroscopique "+this.freinGyroscopique; 
    }

}
   

