/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tg.univlome.epl.pd2;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import java.time.LocalDate;
import java.util.List;
import tg.univlome.epl.boutique2.entites.Categorie;
import tg.univlome.epl.boutique2.entites.Produit;

/**
 *
 * @author EKLOU Dodji
 */
public class Pd2 {
    
    private static final String URL = "http://localhost:8080/boutique2/rs";
    
    public static void main(String[] args) {
        Categorie categorie1 =  new Categorie(1," fruits"," fruits avec noyau");
        Categorie categorie2 =  new Categorie(2," fruits sans noyau"," fruits sans noyau");
        
        Produit produit1 = new Produit(1, "Mangue", 200,LocalDate.of(2024, 12, 30), categorie1);
        Produit produit2 = new Produit(2, "papaye", 4501,LocalDate.of(2024, 12, 30), categorie2);
        Produit produit3 = new Produit(3, "banane", 500,LocalDate.of(2024, 12, 30), categorie2);
        
        ProduitClient produitClient = ProduitClient.getInstance();
        produitClient.ajouter(produit1);
        produitClient.ajouter(produit2);
        produitClient.ajouter(produit3);
        List<Produit> liste = produitClient.lister();
        for (Produit produit : liste) {
            System.out.println(produit);
        }
    }
}
