/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;

/**
 *
 * @author Utilisateur
 */
public abstract class Utilisateur {
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String mailUtilisateur;
    private String mdpUtilisateur;//mettre un hash ?
    private String etat;
    
    //Constructeur--------------------------------------------------------------
    public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String mailUtilisateur, String mdpUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.mailUtilisateur = mailUtilisateur;
        this.mdpUtilisateur = mdpUtilisateur;
    }
    //getters et setters--------------------------------------------------------
    
    //--------------------------------------------------------------------------
     public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }
    //--------------------------------------------------------------------------
    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }
    //--------------------------------------------------------------------------
    public String getMailUtilisateur() {
        return mailUtilisateur;
    }

    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }
    //--------------------------------------------------------------------------
    public String getMdpUtilisateur() {
        return mdpUtilisateur;
    }

    public void setMdpUtilisateur(String mdpUtilisateur) {
        this.mdpUtilisateur = mdpUtilisateur;
    }
    //--------------------------------------------------------------------------
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    //actions-------------------------------------------------------------------
    public boolean seConnecter(String nomU,String mdpU){
        /*
        A voir pour comparer avec les données d'une BD
        **/
        this.etat="Connecté";
        //this.mailUtilisateur=mail en relation avec l'utilisateur
        this.nomUtilisateur=nomU;
        return true;
    }
    public void seDeconnecter(){
        this.etat="Déconnecté";
    }
    //--------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Utilisateur{" +
                "nomUtilisateur='" + nomUtilisateur + '\'' +
                ", prenomUtilisateur='" + prenomUtilisateur + '\'' +
                ", mailUtilisateur='" + mailUtilisateur + '\'' +
                ", mdpUtilisateur='" + mdpUtilisateur + '\'' +
                ",etat = '"+etat+'\''+
                '}';
    }

}

