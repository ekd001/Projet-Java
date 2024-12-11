/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entites.Produit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class ProduitService {
    private static volatile ProduitService produitService;
    private static volatile List<Produit> liste;
    
    private ProduitService(){
        liste = new ArrayList<>();
    }
    
    public static ProduitService getInstance(){
        ProduitService instance = produitService;
        if(instance == null){
            synchronized(ProduitService.class){
                instance = produitService;
                if(instance == null){
                    instance = produitService = new ProduitService();
                }
            }
        }
        return instance;
    }
    
    public void ajouter(Produit p){
        try{
            liste.add(p);
        }catch(Exception e){
            System.out.println("e "+ "Le produit n'est pas ajouté");
        }
    }
    
    public void modifier(Produit p){
    
    }
    
    public Produit trouver(int id){
        try{
            for(Produit p:liste){
                if(p.getId() == id){
                    return p;
                }
            }
        }catch(Exception e){
            System.out.println(e + "Le produit n'a pas été trouver");
        }
        return null;
    }
    
    public void supprimer(Produit p){
        try{
            liste.remove(p);
        }catch(Exception e){
            System.out.println(e+" Le produit n'a pas été supprimée");
        }
    }
    
    public int compter(){
        return liste.size();
    }
    
    public List<Produit> lister(){
        if(liste.isEmpty()){
            return null;
        }
        return liste;
    }
}
