/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionvente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class BoutiqueTest {
    
    /**
     * @param args the command line arguments
     */
    public static void afficherStock(List<ArticleSimple> listArticle){
        System.out.println("STOCK D'ARTICLE\n");
        for(ArticleSimple a: listArticle){
            System.out.printf("Reference     : %s\n",a.getReference());
            System.out.printf("Libelle       : %s\n",a.getLibelle());
            System.out.printf("Quantite      : %d\n",a.getQuantite());
            System.out.printf("Prix Unitaire : %.2f\n",a.getPrix_unitaire());
            System.out.printf("Categorie     : %s\n",a.getCategorie());
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        //le stock
        List<ArticleSimple> stock = new ArrayList<>();
        //Les categories
        Categorie catElectronique = new Categorie("ELE","electronique");
        Categorie catSacs = new Categorie("BAG","sacs");
        
        //Les elements kits
        ElementKit kitHeadphone= new ElementKit(1);
        ElementKit kitLaptop = new ElementKit(2);
        ElementKit kitCharger = new ElementKit(2);
        ElementKit kitBags = new ElementKit(2);
        ElementKit kitOrdinateur = new ElementKit(3);
        
        //Créer les articles et les ajoutés dans le stock
        ArticleSimple laptop = new ArticleSimple("ELE01","laptop",catElectronique,8,300000,kitLaptop);
        catElectronique.addArticle(laptop);
        stock.add(laptop);
        
        ArticleSimple charger = new ArticleSimple("ELE02","chargeur",catElectronique,9,15000,kitCharger);
        catElectronique.addArticle(charger);
        stock.add(charger);
        
        ArticleSimple bags = new ArticleSimple("BAG023","sacs",catSacs,10,3000,kitBags);
        catSacs.addArticle(laptop);
        stock.add(bags);
        
        ArticleSimple headPhone = new ArticleSimple("ELE05","Casque audio",catElectronique,5,5000,kitHeadphone);
        catElectronique.addArticle(headPhone);
        stock.add(headPhone);
        
        //Afficher le stock
        afficherStock(stock);
        
        //Associée article et kit
        kitLaptop.setArticle(laptop);
        kitCharger.setArticle(charger);
        kitBags.setArticle(bags);
        kitHeadphone.setArticle(headPhone);
        
        //Constituer notre kit
        Kit packComputer = new Kit("ELE0123","packOrdinateur",catElectronique,kitOrdinateur);
        packComputer.addElementKit(kitBags);
        packComputer.addElementKit(kitLaptop);
        packComputer.addElementKit(kitCharger);
        kitOrdinateur.setArticle(packComputer);
        
        
        //Le client 
        Client cl = new Client(1,"Komlan","Jean");
        
        //Une des ventes concernant le client jean
        Vente vente = new Vente();
        cl.addVente(vente);
        vente.setClient(cl);
        
        //Les ligne de vente de la vente concernant le client
        LigneVente lv = new LigneVente(2,kitOrdinateur,5);
        LigneVente lv1 = new LigneVente(2,kitHeadphone,2);
        vente.addLigneVente(lv);
        vente.addLigneVente(lv1);
        
        //La facture  du client 
        Facture f = new Facture("145632","02/12/2024",cl,vente);
        f.afficherFacture();
        
        //Afficher à nouveau le stock
        afficherStock(stock);
    }
    
}
