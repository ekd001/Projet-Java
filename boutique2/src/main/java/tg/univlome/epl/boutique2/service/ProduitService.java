/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;



import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import tg.univlome.epl.boutique2.entites.Produit;

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
    
    public synchronized static ProduitService getInstance(){
        ProduitService instance = produitService;
        if(instance == null){
            instance = produitService = new ProduitService();
        }
        return instance;
    }
    
    public void ajouter(Produit p){
        if(!(liste.contains(p))){
            liste.add(p);
        }else{
            throw new IllegalStateException("Le produit existe dans la liste");
        }
        
    }
    
    public void modifier(Produit p){
        Produit produit = this.trouver(p.getId());
        if(produit != null){
            produit.setLibelle(p.getLibelle());
            produit.setPrixUnitaire(p.getPrixUnitaire());
        }else{
            throw new NoSuchElementException("Le produit n'existe pas dans la liste");
        }
        
    }
    
    public Produit trouver(long id){
        try{
            for(Produit p:liste){
                if(p.getId() == id){
                    return p;
                }
            }
        }catch(Exception e){
            throw new NoSuchElementException("Le produit n'existe pas dans la liste");
        }
        return null;
    }
    
    public void supprimer(Integer id){
        Produit produit = this.trouver(id.longValue());
        if(produit != null){
            liste.remove(produit);
        }else{
            throw new NoSuchElementException("Le produit n'existe pas dans la liste");
        }
    }
    
    public int compter(){
        return liste.size();
    }
    
    public List<Produit> lister(){
        return liste;
    }
    
    public List<Produit> perimes(){
        List<Produit> produitPerimes = new ArrayList<>();
        for(Produit p:liste){
            if(p.estPerime()){
                produitPerimes.add(p);
            }
        }
        return produitPerimes;
    }
}
