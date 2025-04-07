/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;
import java.util.ArrayList;
import java.util.Date;

//A voir si les attributs sont correctent
public class Gyropode {
    private String etatGyropode;
    private String numRefGyropode;
    private String numSerieGyropode;
    private String couleurGyropode;
    private Date dateAchatGyropode;
    private int nbrUtilistationGyropode;
    private static int utilisationTotalGyropode;
    private double nbrKlmGyropode;
    private double nbrHeureRoulerGyropode;
    private  ArrayList<Double> coordonees = new ArrayList<Double>();
    private int batterieRestantGyropode;
    private double dureeRoulageRestantGyropode;
    private double tempsRestantEstimeGyropode;
    private ModeleGyropode ModeleG;
    
    //Constructeurs
    public Gyropode(String etatG,String numRefG,String numSerieG,String couleurG,Date dateAchatG,int nbrUtilisationG,double nbrKlmG,double nbrHeureRoulerG,double longitude,double lattitude,int batterieR,double dureeRoulageRestantG,double tempsRestantEstimeG,MonoRoue ModeleG){
        this.etatGyropode=etatG;
        this.numRefGyropode=numRefG;
        this.numSerieGyropode=numSerieG;
        this.couleurGyropode=couleurG;
        this.dateAchatGyropode=dateAchatG;
        this.nbrUtilistationGyropode=nbrUtilisationG;
        this.nbrKlmGyropode=nbrKlmG;
        this.nbrHeureRoulerGyropode=nbrHeureRoulerG;
        this.coordonees.add(1,longitude);
        this.coordonees.add(0,lattitude);
        this.batterieRestantGyropode=batterieR;
        this.dureeRoulageRestantGyropode=dureeRoulageRestantG;
        this.ModeleG=ModeleG;
        this.tempsRestantEstimeGyropode=tempsRestantEstimeG;
    }
    
    public static void setNombreUtilisationTotal(int nbr){
        Gyropode.utilisationTotalGyropode=nbr;
    }
    public static int getNombreUtilisationTotal(){
        return Gyropode.utilisationTotalGyropode;
    }
    public void setModeleG(MonoRoue ModeleGyro){
        this.ModeleG=ModeleGyro;
    }
    
    public ModeleGyropode getModeleG(){
        return this.ModeleG;
    }
      
    public void setEtatGyropode(String etatG) {
        this.etatGyropode = etatG;
    }
    public String getEtatGyropode() {
        return etatGyropode;
    }
    
    public void setNumRefGyropode(String numRefG) {
        this.numRefGyropode = numRefG;
    }
    public String getNumRefGyropode() {
        return numRefGyropode;
    }
    
    public void setNumSerieGyropode(String numSerieG) {
        this.numSerieGyropode = numSerieG;
    }
    public String getNumSerieGyropode() {
        return numSerieGyropode;
    }
    
    public void setCouleurGyropode(String couleurG) {
        this.couleurGyropode = couleurG;
    }
    public String getCouleurGyropode() {
        return couleurGyropode;
    }
    
    public void setDateAchatGyropode(Date dateAchatG) {
        this.dateAchatGyropode = dateAchatG;
    }
    public Date getDateAchatGyropode() {
        return dateAchatGyropode;
    }
    
    public void setNbrUtilistationGyropode(int nbrUtilistationG) {
        Gyropode.utilisationTotalGyropode-=this.nbrUtilistationGyropode;
        this.nbrUtilistationGyropode = nbrUtilistationG;
        Gyropode.utilisationTotalGyropode+=this.nbrUtilistationGyropode;
        
    }
    public int getNbrUtilistationGyropode() {
        return nbrUtilistationGyropode;
    }
    
    public void setNbrKlmGyropode(double nbrKlmG) {
        this.nbrKlmGyropode = nbrKlmG;
    }
    public double getNbrKlmGyropode() {
        return nbrKlmGyropode;
    }
    
    public void setNbrHeureRoulerGyropode(double nbrHeureRoulerG) {
        this.nbrHeureRoulerGyropode = nbrHeureRoulerG;
    }
    public double getNbrHeureRoulerGyropode() {
        return nbrHeureRoulerGyropode;
    }
    
    public void setLatitudeGyropode(double latitudeG) {
        this.coordonees.add(0,latitudeG);
    }
    public double getLatitudeGyropode() {
        return this.coordonees.get(0);
    }
    
    public void setLongitudeGyropode(double longitudeG) {
        this.coordonees.add(1,longitudeG);
    }
    public double getLongitudeGyropode() {
        return this.coordonees.get(1);
    }
    
    public void setBatterieRestantGyropode(int batterieRestantG) {
        this.batterieRestantGyropode = batterieRestantG;
    }
    public int getBatterieRestantGyropode() {
        return batterieRestantGyropode;
    }
    
    public void setDureeRoulageRestantGyropode(double dureeRoulageRestantG) {
        this.dureeRoulageRestantGyropode = dureeRoulageRestantG;
    }
    public double getDureeRoulageRestantGyropode() {
        return dureeRoulageRestantGyropode;
    }
    
    public void setTempsRestantEstimeGyropode(double tempsRestantEstimeG) {
        this.tempsRestantEstimeGyropode = tempsRestantEstimeG;
    }
    public double getTempsRestantEstimeGyropode() {
        return tempsRestantEstimeGyropode;
    }
    
    //actions-----------------------------------------------------------------------
    //-------Méthodes liées a l'état du gyropode(mise en maintenance,bloquage,remise en service)  
    public void mettreEnMaintenance(){
        this.etatGyropode="Maintenance";
    }
    public void remettreEnService(){
        this.etatGyropode="Marche";
    }
    public void bloquer(){
        this.etatGyropode="Bloqué";
    }
    
    //-----Méthodes pérmettant de récuperer différentes informations du gyropodepar bluetooth
    public long RecupererBluetoothNiveauDeChargeBatterie() {
    //--------------retourne le niveau de charge (en pourcentage restant) de la batterie du gyropode, récupérée par Bluetooth (simulée)
        return Math.round(Math.random()*100.0);
    }
    public long RecupererBluetoothDureeRoulageRestanteEstimee() {
     //-------------retourne la durée de roulage restante estimée (en nombrede minutes) du gyropode, récupérée par Bluetooth (simulée)
     long BaseChargeBatterie= RecupererBluetoothNiveauDeChargeBatterie() ;
     //System.out.println(BaseChargeBatterie);
     return Math.round(BaseChargeBatterie*((Math.random()+0.9)*2.6)) ;
    }
    
    public long RecupererBluetoothDureeChargeRestanteEstimee() {
     //-------------retourne la durée de roulage restante estimée (en nombrede minutes) du gyropode, récupérée par Bluetooth (simulée)
     long BaseChargeBatterie= RecupererBluetoothNiveauDeChargeBatterie() ;
     //System.out.println(BaseChargeBatterie);
     return Math.round(BaseChargeBatterie*((Math.random()+0.9)*2.6)) ;
    }
    
    public double geolocaliserLatitude(){
    //--------------retourne la latitude détectée du gyropode, dans la zonedu BAB (simulée)
        return Math.random() * 0.048948 + 43.478843;
    }
    public double geolocaliserLongitude(){
    //-------------retourne la longitude détectée du gyropode, dans la zone du BAB (simulée)
        return Math.random() * -0.059698 - 1.463571;
    }
    //-------------------------------------------------------------------------------
    public String toString(){
        return "Etat gyropode : "+this.etatGyropode +
               " Numéro de réference : "+this.numRefGyropode +
               " Numéro de série : "+this.numSerieGyropode+
               " Couleur du gyropode : "+this.couleurGyropode+
               " Date d'achat du gyropode : "+this.dateAchatGyropode+
               " Nombre d'utilisations du gyropode : "+this.nbrUtilistationGyropode+
               " Nombre de kilomètre du gyropode : "+this.nbrKlmGyropode+
               " Nombre d'heure que le gyropode a roulé : "+this.nbrHeureRoulerGyropode+
               " Coordonnées : ("+this.coordonees.get(0)+","+this.coordonees.get(1)+")"+
               " Batterie restante : "+this.batterieRestantGyropode+
               " Durée de route restante : "+this.dureeRoulageRestantGyropode+
               " Temps d'autonomie restante : "+this.tempsRestantEstimeGyropode+
               "Modéle du gyropode {"+this.ModeleG+"}";
    }
    
}

