/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import tg.univlome.epl.boutique2.entites.ProduitAchete;

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
    
    public synchronized static ProduitAcheteService getInstance(){
        ProduitAcheteService instance = produitAcheteService;
        if(instance == null){
           instance = produitAcheteService = new ProduitAcheteService();
        }
        
        return instance;
    }
    
    public void ajouter(ProduitAchete pa){
        if(!(liste.contains(pa))){
            liste.add(pa);
        }else{
            throw new IllegalStateException("Le produit acheté existe dans la liste");
        }
        
    }
    
    public void modifier(ProduitAchete pa){
        ProduitAchete produitA = this.trouver((int)(pa.getIdAchat()), (int)(pa.getIdProduit()));
        if(produitA != null){
            produitA.setRemise(pa.getRemise());
        }else{
            throw new NoSuchElementException("Le produit acheté n'existe pas dans la liste");
        }

    }
    
    public ProduitAchete trouver(int idAchat, int idProduit){
        try{
            for(ProduitAchete pa : liste){
                if((pa.getIdAchat() == idAchat) && (pa.getIdProduit() == idProduit)){
                    return pa;
                }
            }
        }catch(Exception e){
            throw new NoSuchElementException("Le produit acheté n'existe pas dans la liste");
        }
        return null;
    }
    
    public void supprimer(int idAchat, int idProduit){
        ProduitAchete produitA = this.trouver(idAchat, idProduit);
        if(produitA != null){
            liste.remove(produitA);
        }else{
            throw new NoSuchElementException("Le produit acheté n'existe pas dans la liste");
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
