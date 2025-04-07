/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;

import java.util.GregorianCalendar;

/**
 *
 * @author Utilisateur
 */
public class Saison {
    private String saisonActuelle;
    private GregorianCalendar dateDebutSaison;
    private GregorianCalendar dateFinSaison;
    
    //constructeur
    public Saison(String saisonAct,GregorianCalendar dateDebut,GregorianCalendar dateFin){
        this.saisonActuelle=saisonAct;
        this.dateDebutSaison=dateDebut;
        this.dateFinSaison=dateFin;
    }
    
    //setters et getters
    public String getSaisonActuelle(){
        return this.saisonActuelle;
    }
    public void setSaisonActuelle(String saisonAct){
        this.saisonActuelle=saisonAct;
    }
    //--------------------------------------------------------------------------
    public GregorianCalendar getDateDebutSaison(){
        return this.dateDebutSaison;
    }
    public void setDateDebutSaison(int jour, int mois, int heure, int min, int sec){
        this.dateDebutSaison = new GregorianCalendar();
        this.dateDebutSaison.set(GregorianCalendar.DATE, jour);
        this.dateDebutSaison.set(GregorianCalendar.MONTH, mois);
        this.dateDebutSaison.set(GregorianCalendar.HOUR, heure);
        this.dateDebutSaison.set(GregorianCalendar.MINUTE, min);
        this.dateDebutSaison.set(GregorianCalendar.SECOND, sec);
    }
     //--------------------------------------------------------------------------
    public GregorianCalendar getDateFinSaison(){
        return this.dateFinSaison;
    }
    public void setDateFinSaison(int jour, int mois, int heure, int min, int sec){
        this.dateFinSaison = new GregorianCalendar();
        this.dateFinSaison.set(GregorianCalendar.DATE, jour);
        this.dateFinSaison.set(GregorianCalendar.MONTH, mois);
        this.dateFinSaison.set(GregorianCalendar.HOUR, heure);
        this.dateFinSaison.set(GregorianCalendar.MINUTE, min);
        this.dateFinSaison.set(GregorianCalendar.SECOND, sec);
    }
    //--------------------------------------------------------------------------
    
    //------------------------
    //Méthode changer saison ?
    //------------------------
    
    public String toString(){
        return "Saison actuelle : "+this.saisonActuelle+" Du : "+this.dateDebutSaison+" au "+this.dateFinSaison;
    }
    


}
