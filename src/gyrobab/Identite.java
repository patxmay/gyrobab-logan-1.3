/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;

/**
 *
 * @author Utilisateur
 */
public class Identite {
    private String typeIdentite;
    private String libelleIdentite;
    
    //constructeur--------------------------------------------------------------
    public Identite(String typeIdentite,String libelleIdentite){
        this.typeIdentite=typeIdentite;
        this.libelleIdentite=libelleIdentite;
    }
    //getters et setters--------------------------------------------------------
    public String getTypeIdentite(){
        return this.typeIdentite;
    }
    public void setTypeIdentite(String typeIdentite){
        this.typeIdentite=typeIdentite;
    }
    //--------------------------------------------------------------------------
    public String getLibelleIdentite(){
        return this.libelleIdentite;
    }
    public void setLibelleIdentite(String libelleIdentite){
        this.libelleIdentite=libelleIdentite;
    }
    //actions-------------------------------------------------------------------
    @Override
    public String toString(){
        return "libelle de la piece d'iddentite : "+this.libelleIdentite
                +"Type de la pièce d'identité : "+this.typeIdentite;
    }
}
