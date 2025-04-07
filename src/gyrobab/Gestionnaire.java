/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyrobab;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class Gestionnaire extends Utilisateur {
    private String typeEmploi;
    private Date dateEmbauche;
    private Date dateFinContrat;
    
    //constructeur--------------------------------------------------------------
    public Gestionnaire(String nomUtilisateur, String prenomUtilisateur, String mailUtilisateur, String mdpUtilisateur,
                        String typeEmploi,Date dateEmbauche,Date dateFinContrat){
        super(nomUtilisateur,prenomUtilisateur,mailUtilisateur,mdpUtilisateur);
        
        this.typeEmploi=typeEmploi;
        this.dateEmbauche=dateEmbauche;
        this.dateFinContrat=dateFinContrat;
    }
    //getters et setters--------------------------------------------------------
    public String getTypeEmploi() {
        return typeEmploi;
    }
    public void setTypeEmploi(String typeEmploi) {
        this.typeEmploi = typeEmploi;
    }
    //--------------------------------------------------------------------------
    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    //--------------------------------------------------------------------------
    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }
    //--------------------------------------------------------------------------
    public void maintenirGyropode(Gyropode gyropode){
        gyropode.mettreEnMaintenance();
    }

    /*public String creerCompte(String nomUtilisateur,String mdpUtilisateur,String prenomUtilisateur){
        
    }*/
    
    
    
    public Saison ajouterSaison(String saisonAct,GregorianCalendar dateDebutS,GregorianCalendar dateFinS){
        Saison nouvelleSaison=new Saison(saisonAct,dateDebutS,dateFinS);
        return nouvelleSaison;
    }
    public void modifierSaison(Saison saison){
        
	Scanner sc = new Scanner(System.in);

	System.out.println("Quel attribut voulez-vous modifier ? (tapez le chiffre correspondant)");
	System.out.println("1. Saison Actuelle");
	System.out.println("2. Date de début de saison");
	System.out.println("3. Date de fin de saison");

	int choix = sc.nextInt();
	sc.nextLine(); // pour consommer le retour à la ligne

	switch (choix) {
    	case 1:
        	System.out.println("Entrez la nouvelle saison : ");
        	String nouvelleS = sc.nextLine();
        	saison.setSaisonActuelle(nouvelleS);
        	break;
    	case 2:
        	System.out.println("Entrez la nouvelle date de début de saison : ");
        	String nouvelleDateDebutStr = sc.nextLine();
        	Date nouvelleDateDebut = parseDate(nouvelleDateDebutStr);
        	saison.setDateDebutSaison(nouvelleDateDebut);
        	break;
    	case 3:
        	System.out.println("Entrez la nouvelle date de début de saison : ");
        	String nouvelleDateFinStr = sc.nextLine();
        	Date nouvelleDateFin = parseDate(nouvelleDateFinStr);
        	saison.setDateFinSaison(nouvelleDateFin);
        	break;
    	default:
        	System.out.println("Choix invalide !");
        	break;
	}

    }
    private Date parseDate(String dateStr) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	try {
    	return sdf.parse(dateStr);
	} catch (ParseException e) {
    	System.out.println("Format de date invalide !");
    	return null;
	}
}

    public void supprimerSaison(Saison saison){
        //mettre bd\\
        
        
    }
    //Gérer des réservations----------------------------------------------------
       public Louer reserverUnGyropode(double prixF,int nbrLoca,Date dateLoc,String momentJ,Usager Locataire,Gyropode GyropodeLouer){
        Louer location=new Louer(prixF,dateLoc,momentJ,Locataire,GyropodeLouer);
        return location;
        //pouvoir négcoier le tarif\\
    }
    //Actualiser les info du gyropode après location----------------------------
       public void actualiserInfoGyropodeRentrant(Louer location){
           location.getGyropodeLouer().setNbrHeureRoulerGyropode(location.getGyropodeLouer().getNbrHeureRoulerGyropode()+location.getNombreHeureRoulage());
           location.getGyropodeLouer().setNbrKlmGyropode(location.getGyropodeLouer().getNbrKlmGyropode()+location.getNombreKmParcourus());
       }

    
    //Gérer des marques de gyropodes------------------------------------------------------------------------------------------------------------
    
    public MarqueGyropode ajouterMarqueGyropode(String nomMarque, String siteWebMarque, String mailMarque, String telMarque,String telSAVMarque){
         MarqueGyropode MarqueG=new MarqueGyropode(nomMarque,siteWebMarque,mailMarque,telMarque, telSAVMarque);
         return MarqueG;
    }
    
    public void modifierMarqueGyropode(MarqueGyropode marque){
    Scanner sc = new Scanner(System.in);

    System.out.println("Quel attribut voulez-vous modifier ? (tapez le chiffre correspondant)");
    System.out.println("1. Nom de la marque");
    System.out.println("2. Site web de la marque");
    System.out.println("3. Adresse e-mail de la marque");
    System.out.println("4. Numéro de téléphone de la marque");
    System.out.println("5. Numéro de téléphone du service après-vente de la marque");

    int choix = sc.nextInt();
    sc.nextLine(); // pour consommer le retour à la ligne

    switch (choix) {
        case 1:
            System.out.println("Entrez le nouveau nom de la marque : ");
            String nouveauNom = sc.nextLine();
            marque.setNomMarque(nouveauNom);
            break;
        case 2:
            System.out.println("Entrez le nouveau site web de la marque : ");
            String nouveauSiteWeb = sc.nextLine();
            marque.setSiteWebMarque(nouveauSiteWeb);
            break;
        case 3:
            System.out.println("Entrez le nouvel e-mail de la marque : ");
            String nouvelEmail = sc.nextLine();
            marque.setMailMarque(nouvelEmail);
            break;
        case 4:
            System.out.println("Entrez le nouveau numéro de téléphone de la marque : ");
            String nouveauNumeroTel = sc.nextLine();
            marque.setTelMarque(nouveauNumeroTel);
            break;
        case 5:
            System.out.println("Entrez le nouveau numéro de téléphone du service après-vente de la marque : ");
            String nouveauNumeroSAV = sc.nextLine();
            marque.setTelSAVMarque(nouveauNumeroSAV);
            break;
        default:
            System.out.println("Choix invalide !");
            break;
        }
    }

    
    public void supprimerMarqueGyropode(MarqueGyropode MarqueG){
        //BD\\
    }
    //Gérer les modèles de gyropodes--------------------------------------------
    public void modifierModeleGyropode(){
        //à coder
    } 
    
    //Gérer les tarifications--------------------------------------------------- 
    public Tarif ajouterTarification(ModeleGyropode modeleG,Saison saisonT,double prix){
        Tarif NvTarif=new Tarif(modeleG, saisonT, prix);
        return NvTarif;
    }
    
    public void modifierTarif(Tarif tarif) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel attribut du tarif voulez-vous modifier ? (tapez le chiffre correspondant)");
        System.out.println("1. Saison");
        System.out.println("2. Modèle de gyropode");
        System.out.println("3. Prix théorique");

        int choix = sc.nextInt();
        sc.nextLine(); // pour consommer le retour à la ligne

        switch (choix) {
            case 1:
                System.out.println("Entrez la nouvelle saison : ");
                this.modifierSaison(tarif.getSaisonT());
                break;
            case 2:
                System.out.println("Entrez le nouveau modèle de gyropode : ");
                this.modifierModeleGyropode();
                break;
            case 3:
                System.out.println("Entrez le nouveau prix théorique : ");
                double nouveauPrixTheorique = sc.nextDouble();
                tarif.setPrixTheorique(nouveauPrixTheorique);
                break;
            default:
                System.out.println("Choix invalide !");
                break;
        }
    }
    public void supprimerTarif(){
        //supprimer de la bd\\
    }

    //Gérer les Usagers---------------------------------------------------------
    
    public Usager ajouterUsager(String nomUtilisateur, String prenomUtilisateur, String mailUtilisateur, String mdpUtilisateur,Identite Identite,int AgeUsage){
        Usager NvUsager=new Usager( nomUtilisateur, prenomUtilisateur,  mailUtilisateur, mdpUtilisateur,Identite,AgeUsage);
        return NvUsager;
    }
    
    public void modifierUsager(Usager usager) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quel attribut de l'usager voulez-vous modifier ? (tapez le chiffre correspondant)");
    System.out.println("1. Nom d'utilisateur");
    System.out.println("2. Prénom d'utilisateur");
    System.out.println("3. Adresse e-mail de l'utilisateur");
    System.out.println("4. Mot de passe de l'utilisateur");
    System.out.println("5. Identité de l'utilisateur");
    System.out.println("6. Âge d'usage de l'utilisateur");

    int choix = sc.nextInt();
    sc.nextLine(); // pour consommer le retour à la ligne

    switch (choix) {
        case 1:
            System.out.println("Entrez le nouveau nom d'utilisateur : ");
            String nouveauNomUtilisateur = sc.nextLine();
            usager.setNomUtilisateur(nouveauNomUtilisateur);
            break;
        case 2:
            System.out.println("Entrez le nouveau prénom d'utilisateur : ");
            String nouveauPrenomUtilisateur = sc.nextLine();
            usager.setPrenomUtilisateur(nouveauPrenomUtilisateur);
            break;
        case 3:
            System.out.println("Entrez la nouvelle adresse e-mail de l'utilisateur : ");
            String nouveauMailUtilisateur = sc.nextLine();
            usager.setMailUtilisateur(nouveauMailUtilisateur);
            break;
        case 4:
            System.out.println("Entrez le nouveau mot de passe de l'utilisateur : ");
            String nouveauMdpUtilisateur = sc.nextLine();
            usager.setMdpUtilisateur(nouveauMdpUtilisateur);
            break;
        case 5:
            // Vous devez implémenter la logique pour modifier l'attribut Identité de l'usager
            break;
        case 6:
            System.out.println("Entrez le nouvel âge d'usage de l'utilisateur : ");
            int nouvelAgeUsage = sc.nextInt();
            usager.setAgeUsager(nouvelAgeUsage);
            break;
        default:
            System.out.println("Choix invalide !");
            break;
        }
    }   
    public void supprimerUsager(){
        //BD\\
    }
    public int CalculerAgeMoyenUsager(){
        return (int) Math.floor(Usager.getAgeTotalUsager()/Usager.getNombreTotalUsager());
    }
    //Gérer des Gyropodes-------------------------------------------------------
    public Gyropode ajouterGyropode(String etatG,String numRefG,String numSerieG,String couleurG,Date dateAchatG,int nbrUtilisationG,double nbrKlmG,double nbrHeureRoulerG,double longitude,double lattitude,int batterieR,double dureeRoulageRestantG,double tempsRestantEstimeG,MonoRoue ModeleG){
        Gyropode NvGyropode=new Gyropode(etatG,numRefG,numSerieG, couleurG, dateAchatG,nbrUtilisationG, nbrKlmG, nbrHeureRoulerG, longitude, lattitude, batterieR, dureeRoulageRestantG, tempsRestantEstimeG, ModeleG);
        return NvGyropode;
    }
    
public void modifierGyropode(Gyropode gyropode) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quel attribut du gyropode voulez-vous modifier ? (tapez le chiffre correspondant)");
    System.out.println("1. État du gyropode");
    System.out.println("2. Numéro de référence du gyropode");
    System.out.println("3. Numéro de série du gyropode");
    System.out.println("4. Couleur du gyropode");
    System.out.println("5. Date d'achat du gyropode");
    System.out.println("6. Nombre d'utilisations du gyropode");
    System.out.println("7. Nombre de kilomètres parcourus par le gyropode");
    System.out.println("8. Nombre d'heures de roulage du gyropode");
    System.out.println("9. Longitude actuelle du gyropode");
    System.out.println("10. Latitude actuelle du gyropode");
    System.out.println("11. Niveau de batterie restant du gyropode");
    System.out.println("12. Durée de roulage restante du gyropode");
    System.out.println("13. Temps restant estimé du gyropode");
    System.out.println("14. Modèle de monoroue du gyropode");

    int choix = sc.nextInt();
    sc.nextLine(); // pour consommer le retour à la ligne

    switch (choix) {
        case 1:
            System.out.println("Entrez le nouvel état du gyropode : ");
            String nouvelEtatG = sc.nextLine();
            gyropode.setEtatGyropode(nouvelEtatG);
            break;
        case 2:
            System.out.println("Entrez le nouveau numéro de référence du gyropode : ");
            String nouveauNumRefG = sc.nextLine();
            gyropode.setNumRefGyropode(nouveauNumRefG);
            break;
        case 3:
            System.out.println("Entrez le nouveau numéro de série du gyropode : ");
            String nouveauNumSerieG = sc.nextLine();
            gyropode.setNumSerieGyropode(nouveauNumSerieG);
            break;
        case 4:
            System.out.println("Entrez la nouvelle couleur du gyropode : ");
            String nouvelleCouleurG = sc.nextLine();
            gyropode.setCouleurGyropode(nouvelleCouleurG);
            break;
        case 5:
            System.out.println("Entrez la nouvelle date d'achat du gyropode (au format dd/MM/yyyy) : ");
            String nouvelleDateAchatGStr = sc.nextLine();
            Date nouvelleDateAchatG = parseDate(nouvelleDateAchatGStr);
            gyropode.setDateAchatGyropode(nouvelleDateAchatG);
            break;
        case 6:
            System.out.println("Entrez le nouveau nombre d'utilisations du gyropode : ");
            int nouveauNbrUtilisationG = sc.nextInt();
            gyropode.setNbrUtilistationGyropode(nouveauNbrUtilisationG);
            break;
        case 7:
            System.out.println("Entrez le nouveau nombre de kilomètres parcourus par le gyropode : ");
            double nouveauNbrKlmG = sc.nextDouble();
            gyropode.setNbrKlmGyropode(nouveauNbrKlmG);
            break;
        case 8:
            System.out.println("Entrez le nouveau nombre d'heures de roulage du gyropode : ");
            double nouveauNbrHeureRoulerG = sc.nextDouble();
            gyropode.setNbrHeureRoulerGyropode(nouveauNbrHeureRoulerG);
            break;
        case 9:
            System.out.println("Entrez la nouvelle longitude actuelle du gyropode : ");
            double nouvelleLongitude = sc.nextDouble();
            gyropode.setLongitudeGyropode(nouvelleLongitude);
            break;
        case 10:
            System.out.println("Entrez la nouvelle latitude actuelle du gyropode : ");
            double nouvelleLatitude = sc.nextDouble();
            gyropode.setLatitudeGyropode(nouvelleLatitude);
            break;
        case 11:
            System.out.println("Entrez le nouveau niveau de batterie restant du gyropode : ");
            int nouveauNiveauBatterieR = sc.nextInt();
            gyropode.setBatterieRestantGyropode(nouveauNiveauBatterieR);
            break;
        case 12:
            System.out.println("Entrez la nouvelle durée de roulage restante du gyropode : ");
            double nouvelleDureeRoulageRestantG = sc.nextDouble();
            gyropode.setDureeRoulageRestantGyropode(nouvelleDureeRoulageRestantG);
            break;
        case 13:
            System.out.println("Entrez le nouveau temps restant estimé du gyropode : ");
            double nouveauTempsRestantEstimeG = sc.nextDouble();
            gyropode.setTempsRestantEstimeGyropode(nouveauTempsRestantEstimeG);
            break;
        case 14:
            //modifier le modéle
            break;
        default:
            System.out.println("Choix invalide !");
            break;
    }
}
    //Gérer la position du gyropode---------------------------------------------
    public ArrayList<Double> recupererCoordonnesGyropode(Gyropode Gyropode){
       ArrayList<Double> coordonnes=new ArrayList();
       coordonnes.add(Gyropode.geolocaliserLongitude());
       coordonnes.add(Gyropode.geolocaliserLatitude());
       return coordonnes;
       //maps a implémenter
    }
    //Gérer l'état du gyropode--------------------------------------------------
    public void bloquerGyropode(Gyropode Gyropode){
        Gyropode.bloquer();
    }
    public void debloquerGyropode(Gyropode Gyropode){
        Gyropode.remettreEnService();
    }
    public void mettreEnMaintenanceGyropode(Gyropode Gyropode){
        Gyropode.mettreEnMaintenance();
    }
    //Gérer les informations bluetooth------------------------------------------
    public String RecupererInformationsBluetoothGyropode(Gyropode Gyropode){
        return "Batterie Du Gyropode : "+Gyropode.RecupererBluetoothNiveauDeChargeBatterie()+"| Temps de roulage restant : "+Gyropode.RecupererBluetoothDureeRoulageRestanteEstimee()+"| Temps de charge restant : "+Gyropode.RecupererBluetoothDureeChargeRestanteEstimee();
    }
    public long recupererNiveauDeBatterieGyropode(Gyropode Gyropode){
        return Gyropode.RecupererBluetoothNiveauDeChargeBatterie();
    }
    public long recupererTempsRoulageRestantGyropode(Gyropode Gyropode){
        return Gyropode.RecupererBluetoothDureeRoulageRestanteEstimee();
    }
    public long recupererTempsRestantEstimeGyropode(Gyropode Gyropode){
        return Gyropode.RecupererBluetoothDureeChargeRestanteEstimee();
    }
    //récupérer différentes statistiques----------------------------------------
    public int recupererUtilisationTotalGyropode(){
        return Gyropode.getNombreUtilisationTotal();
    }
    
  
    
    
    @Override
    public String toString() {
        return 
                "typeEmploi='" + typeEmploi + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                ", dateFinContrat=" + dateFinContrat +
                '}';
    }

    

}
