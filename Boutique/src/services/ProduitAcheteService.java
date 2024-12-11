/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entites.ProduitAchete;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class ProduitAcheteService {
    private static volatile ProduitAcheteService produitAcheteService;
    private static volatile List<ProduitAchete> liste;
    
    private ProduitAcheteService(){
        liste = new ArrayList<>();
    }
    
    public static ProduitAcheteService getInstance(){
        ProduitAcheteService instance = produitAcheteService;
        if(instance == null){
            synchronized(ProduitAcheteService.class){
                instance = produitAcheteService;
                if(instance == null){
                    instance = produitAcheteService = new ProduitAcheteService();
                }
            }
        }
        
        return instance;
    }
    
    public void ajouter(ProduitAchete pa){
        try{
            liste.add(pa);
        }catch(Exception e){
            System.out.println(e + " La produit acheté n'a pas pu être ajoutée");
        }
        
    }
    
    public void modifier(ProduitAchete pa){
        
    }
    
    public ProduitAchete trouver(int idAchat, int idProduit){
        try{
            for(ProduitAchete pa : liste){
                if((pa.getIdAchat() == idAchat) && (pa.getIdProduit() == idProduit)){
                    return pa;
                }
            }
        }catch(Exception e){
            System.out.println(e+" La produit acheté n'est pas disponible dans la liste");
        }
        return null;
    }
    
    public void supprimer(ProduitAchete pa){
        try{
            liste.remove(pa);
        }catch(Exception e){
            System.out.println(e+" La produit acheté n'a pas été supprimée");
        }
    }
    
    public int compter(){
        return liste.size();
    }
    
    public List<ProduitAchete> lister(){
        if(liste.isEmpty()){
            return null;
        }
        return liste;
    }
}
