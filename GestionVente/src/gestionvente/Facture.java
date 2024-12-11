/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class Facture {
    private String reference;
    private String date;
    private Client cl;
    private List<LigneVente> v = new ArrayList<>();
    
    public Facture(String reference, String date, Client cl,Vente v){
        this.reference = reference;
        this.date = date;
        this.cl = cl;
        this.v = v.getLigneVente();
    }
    

    public void afficherFacture(){
        double total = 0;
        System.out.println("\t\t\t\t\tFACTURE\n");
        System.out.printf("Client N°%d\t\t\t\t\t\t\t\tFacture N°%s\n",cl.getId(),this.reference);
        System.out.printf("Nom     : %s\t\t\t\t\t\t\tDate : %s\n",cl.getNom(),this.date);
        System.out.printf("Prenoms : %s\n",cl.getPrenom());
        System.out.println("\n");
        System.out.printf("REFERENCE\t\t\tLIBELLE\t\t\tQUANTITE\t\t\tPRIX\n");
        for(LigneVente lv : this.v){
            total += lv.getElementKit().getPrix();
            System.out.printf("%s\t\t\t%s\t\t\t%d\t\t\t%.2f\n",lv.getElementKit().getArticle().getReference(),
                    lv.getElementKit().getArticle().getLibelle(),lv.getQuantite(),lv.getPrixVente());
        }
        System.out.printf("\t\t\t\t\t\t\t\t\tTotal : %.2f\n",total);
        System.out.println("\n");
    }
}

