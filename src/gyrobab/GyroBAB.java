/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyrobab;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author lgaray
 */
public class GyroBAB {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        ArrayList <Saison> Saisons= new ArrayList();
        

        Saisons.add(new Saison("Basse Saison",new GregorianCalendar(15,11,0,0,0),new GregorianCalendar(31,3,0,0,0)));
        Saisons.add(new Saison("Moyenne Saison Printemps",new GregorianCalendar(1,4,0,0,0),new GregorianCalendar(31,5,0,0,0)));
        Saisons.add(new Saison("Moyenne Saison Automne",new GregorianCalendar(1,10,0,0,0),new GregorianCalendar(14,11,0,0,0)));
        Saisons.add(new Saison("Haute Saison",new GregorianCalendar(1,6,0,0,0),new GregorianCalendar(30,9,0,0,0)));
        
        ArrayList <MarqueGyropode> Marques= new ArrayList();
        
        Marques.add(new MarqueGyropode("SEGWAY","https://www.segwayfrance.com/","segway.france@hotmail.com","0568937152","0598758631"));
        Marques.add(new MarqueGyropode("BLUEWHEEL","https://www.bluewheel.de/","bluewheel.deutch@gmail.com","30 8765 4321","170 765 4321"));
        Marques.add(new MarqueGyropode("InMotion","https://www.inmotion-france.fr/","inmotion.fr@gmail.com","0568942317","0565908645"));
        
        ArrayList <String> ListeSpecificite = new ArrayList();
        
        
        
        ArrayList <GyroGuidon> GyroGuidon= new ArrayList();
        
        GyroGuidon.add(new GyroGuidon("SEGWAY W2 SE",55.0,20.0,"25 - 30 km","10-12 h","(73V - 11,4 Ah)*2",1500.0,ListeSpecificite,"20%",117.0,"AT21x7-10 à 0,28 bar","63 x 84 cm",new Date(2022-1900,10,20,0,0,0),Marques.get(0),"113 - 133 cm"));
        GyroGuidon.add(new GyroGuidon("SEGWAY I2 LAPI",48.0,20.0,"40 - 55 km","10-12 h","(73V - 11,4 Ah)*2",1400.0,ListeSpecificite,"41%",117.0,"100/65-14 à 1,05 bar","64 x 48 cm",new Date(2022-1900,04,12,0,0,0),Marques.get(0),"117 - 130 cm"));
        
        ArrayList <String> ListeSpecificite2 = new ArrayList();
        
        ListeSpecificite2.add(new String("Pneus antidérapant"));
        ListeSpecificite2.add(new String("Eclairage LED"));
        ListeSpecificite2.add(new String("Application de contrôle intelligente"));
        ListeSpecificite2.add(new String("Bluetooth, haut-parleur"));
        ListeSpecificite2.add(new String("Garantie 2 ans"));
        
        ArrayList <GyroPlateau> GyroPlateau= new ArrayList();
        
        GyroPlateau.add(new GyroPlateau("BLUEWHEEL HX310S",20.0,15.0,"15 - 20 km","2-3 h","(36V - 4400 mAh) Certifié Samsung",800.0,ListeSpecificite2,"20%",105.0,"6,5 pouces","30 x 48 cm",new Date(2016-1900,06,17,0,0,0),Marques.get(1),"BlueStand",false,"BlueSpin","BlueWhell 380"));
        
        ArrayList <String> ListeSpecificite3 = new ArrayList();
        
        ListeSpecificite3.add(new String("Noir"));
        ListeSpecificite3.add(new String("Pneu Gonflable"));
        
        ArrayList <MonoRoue> MonoRoue= new ArrayList();
        
        MonoRoue.add(new MonoRoue("InMotion V10",20.6,40.0,"jusqu'à 55 km","environ 6h","Lithium-ion (8.8Ah / 72V / 650Wh)",1800.0,ListeSpecificite3,"30°",120.0,"16 pouces (40,64 cm) x 2,5 pouces","52,85 x 62,35 x 15,85 cm",new Date(2017-1900,07,23,0,0,0),Marques.get(2),"Baguage","FixeIT","WillStop"));
        
        ArrayList <Tarif> Tarifs= new ArrayList();
        
        /*
        Tarifs.add(new Tarif(16.0,Saisons.get(0),GyroGuidon));
        Tarifs.add(new Tarif(11.0,Saisons.get(0),GyroPlateau));
        Tarifs.add(new Tarif(9.0,Saisons.get(0),MonoRoue));
        Tarifs.add(new Tarif(19.0,Saisons.get(1),GyroGuidon));
        Tarifs.add(new Tarif(14.0,Saisons.get(1),GyroPlateau));
        Tarifs.add(new Tarif(11.0,Saisons.get(1),MonoRoue));
        Tarifs.add(new Tarif(33.0,Saisons.get(2),GyroGuidon));
        Tarifs.add(new Tarif(23.0,Saisons.get(2),GyroPlateau));
        Tarifs.add(new Tarif(19.0,Saisons.get(2),MonoRoue));
        **/
        
    }


    
}
