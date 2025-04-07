package gyrobab;

import java.util.ArrayList;
import java.util.Date;

public abstract class ModeleGyropode {
    //attributs-----------------------------------------------------------------
    private String nomGyropode;
    private double poidGyropode;
    private double vitesseMaxGyropode;
    private String autonomieGyropode;
    private String tempsChargeGyropode;
    private String batterieGyropode;
    private double puissanceMoteurGyropode;
    private ArrayList<String> specificite = new ArrayList<String>();
    private String deniveleMaxGyropode;
    private double poidMaxGyropode;
    private String typeRouesGyropode;
    private String dimensionGyropode;
    private Date dateCommercialisationGyropode;
    private MarqueGyropode MarqueG;
    
    //constructeur--------------------------------------------------------------
    public ModeleGyropode(String nomGyropode, double poidGyropode, double vitesseMaxGyropode, String autonomieGyropode,
                          String tempsChargeGyropode, String batterieGyropode, double puissanceMoteurGyropode,
                          ArrayList<String> specificite, String deniveleMaxGyropode, double poidMaxGyropode,
                          String typeRouesGyropode, String dimensionGyropode, Date dateCommercialisationGyropode,MarqueGyropode marqueG) {
        this.nomGyropode = nomGyropode;
        this.poidGyropode = poidGyropode;
        this.vitesseMaxGyropode = vitesseMaxGyropode;
        this.autonomieGyropode = autonomieGyropode;
        this.tempsChargeGyropode = tempsChargeGyropode;
        this.batterieGyropode = batterieGyropode;
        this.puissanceMoteurGyropode = puissanceMoteurGyropode;
        this.specificite = specificite;
        this.deniveleMaxGyropode = deniveleMaxGyropode;
        this.poidMaxGyropode = poidMaxGyropode;
        this.typeRouesGyropode = typeRouesGyropode;
        this.dimensionGyropode = dimensionGyropode;
        this.dateCommercialisationGyropode = dateCommercialisationGyropode;
        this.MarqueG=marqueG;
    }
    
    //getters et setters--------------------------------------------------------
    public void setMarqueGyropode(MarqueGyropode marqueG) {
        this.MarqueG=marqueG;
    }
    
    public MarqueGyropode getMarqueGyropode(){
        return this.MarqueG;
    }
    public void setNomGyropode(String nomGyropode){
        this.nomGyropode=nomGyropode;
    }
    public String getNomGyropode(){
        return this.nomGyropode;
    }
    public double getPoidGyropode() {
        return poidGyropode;
    }

    public void setPoidGyropode(double poidGyropode) {
        this.poidGyropode = poidGyropode;
    }

    //--------------------------------------------------------------------------
    
    public double getVitesseMaxGyropode() {
        return vitesseMaxGyropode;
    }

    public void setVitesseMaxGyropode(double vitesseMaxGyropode) {
        this.vitesseMaxGyropode = vitesseMaxGyropode;
    }

    //---------------------------------------------------------------------------
    
    public String getAutonomieGyropode() {
        return autonomieGyropode;
    }

    public void setAutonomieGyropode(String autonomieGyropode) {
        this.autonomieGyropode = autonomieGyropode;
    }

    //---------------------------------------------------------------------------
    
    public String getTempsChargeGyropode() {
        return tempsChargeGyropode;
    }

    public void setTempsChargeGyropode(String tempsChargeGyropode) {
        this.tempsChargeGyropode = tempsChargeGyropode;
    }

    //--------------------------------------------------------------------------
    
    public String getBatterieGyropode() {
        return batterieGyropode;
    }

    public void setBatterieGyropode(String batterieGyropode) {
        this.batterieGyropode = batterieGyropode;
    }

    //--------------------------------------------------------------------------
    
    public double getPuissanceMoteurGyropode() {
        return puissanceMoteurGyropode;
    }

    public void setPuissanceMoteurGyropode(double puissanceMoteurGyropode) {
        this.puissanceMoteurGyropode = puissanceMoteurGyropode;
    }

    //--------------------------------------------------------------------------
    
    public ArrayList<String> getSpecificite() {
        return specificite;
    }

    public void setSpecificite(ArrayList<String> specificite) {
        this.specificite = specificite;
    }

    //--------------------------------------------------------------------------
    
    public String getDeniveleMaxGyropode() {
        return deniveleMaxGyropode;
    }

    public void setDeniveleMaxGyropode(String deniveleMaxGyropode) {
        this.deniveleMaxGyropode = deniveleMaxGyropode;
    }

    //---------------------------------------------------------------------------
    
    public double getPoidMaxGyropode() {
        return poidMaxGyropode;
    }

    public void setPoidMaxGyropode(double poidsMax){
        this.poidMaxGyropode=poidsMax;
    }
    //--------------------------------------------------------------------------

    public String getTypeRouesGyropode() {
        return typeRouesGyropode;
    }

    public void setTypeRouesGyropode(String typeRouesGyropode) {
        this.typeRouesGyropode = typeRouesGyropode;
    }

    //--------------------------------------------------------------------------

    public String getDimensionGyropode() {
        return dimensionGyropode;
    }

    public void setDimensionGyropode(String dimensionGyropode) {
        this.dimensionGyropode = dimensionGyropode;
    }

    //--------------------------------------------------------------------------

    public Date getDateCommercialisationGyropode() {
        return dateCommercialisationGyropode;
    }

    public void setDateCommercialisationGyropode(Date dateCommercialisationGyropode) {
        this.dateCommercialisationGyropode = dateCommercialisationGyropode;
    }
    
    
    //action----------------------------------------------------------------------

    @Override
    public String toString() {
        return "ModeleGyropode{" 
                + "nomGyropode=" + nomGyropode 
                + ", poidGyropode=" + poidGyropode 
                + ", vitesseMaxGyropode=" + vitesseMaxGyropode 
                + ", autonomieGyropode=" + autonomieGyropode 
                + ", tempsChargeGyropode=" + tempsChargeGyropode 
                + ", batterieGyropode=" + batterieGyropode 
                + ", puissanceMoteurGyropode=" + puissanceMoteurGyropode 
                + ", specificite=" + specificite 
                + ", deniveleMaxGyropode=" + deniveleMaxGyropode 
                + ", poidMaxGyropode=" + poidMaxGyropode 
                + ", typeRouesGyropode=" + typeRouesGyropode 
                + ", dimensionGyropode=" + dimensionGyropode 
                + ", dateCommercialisationGyropode=" + dateCommercialisationGyropode 
                + ", MarqueG=" + MarqueG + '}';
    }

}