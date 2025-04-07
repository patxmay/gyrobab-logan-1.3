/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;

import java.util.Date;

/**
 *
 * @author Utilisateur
 */
public class Usager extends Utilisateur{
    private int AgeUsager;
    private static int AgeTotalUsager;
    private static int nombreTotalUsager;
    private Identite Identite;
    
    //constructeur--------------------------------------------------------------
    public Usager(String nomUtilisateur, String prenomUtilisateur, String mailUtilisateur, String mdpUtilisateur,
                        Identite Identite,int AgeUsager){
        super(nomUtilisateur,prenomUtilisateur,mailUtilisateur,mdpUtilisateur);
        
        this.AgeUsager=AgeUsager;
        this.Identite=Identite;
        Usager.AgeTotalUsager+=AgeUsager;
        Usager.nombreTotalUsager+=nombreTotalUsager;
    }
    //getters et setters--------------------------------------------------------
    public int getAgeUsager() {
        return AgeUsager;
    }

    public void setAgeUsager(int ageUsager) {
        AgeTotalUsager -= AgeUsager;
        AgeUsager = ageUsager;
        AgeTotalUsager += ageUsager;
    }

    public static int getAgeTotalUsager() {
        return AgeTotalUsager;
    }

    public static int getNombreTotalUsager() {
        return nombreTotalUsager;
}
    
    public Identite getIdentite() {
        return Identite;
    }

    public void setIdentite(Identite identite) {
        Identite = identite;
    }
    
    @Override
    public String toString() {
        return "Usager{" +
                "AgeUsager=" + AgeUsager +
                ", Identite=" + Identite +
                '}';
    }
    // à améliorer (faire en sorte que ca ramene a l'entier le plus proche)
    public int calculerAgeMoyenUsager(){
        return Usager.AgeTotalUsager/Usager.nombreTotalUsager;
    }
    public void creerCompte(){
        //à coder\\
    }

}
