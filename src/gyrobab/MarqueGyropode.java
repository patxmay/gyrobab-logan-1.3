/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;

public class MarqueGyropode {
    private String nomMarque;
    private String siteWebMarque;
    private String mailMarque;
    private String telMarque;
    private String telSAVMarque;
    
    
    public MarqueGyropode(String nomMarque,
                        String siteWebMarque,
                        String mailMarque,
                        String telMarque,
                        String telSAVMarque){
        this.nomMarque = nomMarque;
        this.siteWebMarque = siteWebMarque;
        this.mailMarque = mailMarque;
        this.telMarque = telMarque;
        this.telSAVMarque = telSAVMarque;
    }
    
    public MarqueGyropode(String nomMarque,
                        String siteWebMarque,
                        String mailMarque){
        this.nomMarque = nomMarque;
        this.siteWebMarque = siteWebMarque;
        this.mailMarque = mailMarque;
    }
    
    public MarqueGyropode(String nomMarque,
                        String siteWebMarque,
                        String mailMarque,
                        String telMarque){
        this.nomMarque = nomMarque;
        this.siteWebMarque = siteWebMarque;
        this.mailMarque = mailMarque;
        this.telMarque = telMarque;
    }
    
    public void setNomMarque(String nomM) {
        this.nomMarque = nomM;
    }
    public String getNomMarque() {
        return nomMarque;
    }
    
    public void setSiteWebMarque(String siteWebM) {
        this.siteWebMarque = siteWebM;
    }
    public String getSiteWebMarque() {
        return siteWebMarque;
    }
    
    public void setMailMarque(String mailM) {
        this.mailMarque = mailM;
    }
    public String getMailMarque() {
        return mailMarque;
    }
    
    public void setTelMarque(String telM) {
        this.telMarque = telM;
    }
    public String getTelMarque() {
        return telMarque;
    }
    
    public void setTelSAVMarque(String telSAVM) {
        this.telSAVMarque = telSAVM;
    }
    public String getTelSAVMarque() {
        return telSAVMarque;
    }

    @Override
    public String toString() {
        return "MarqueGyropode{" + "nomMarque=" + nomMarque + ", siteWebMarque=" + siteWebMarque + ", mailMarque=" + mailMarque + ", telMarque=" + telMarque + ", telSAVMarque=" + telSAVMarque + '}';
    }
    
    
}