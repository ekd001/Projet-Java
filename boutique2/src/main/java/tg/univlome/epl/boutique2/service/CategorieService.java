/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import tg.univlome.epl.boutique2.entites.Categorie;

/**
 *
 * @author EKLOU Dodji
 */

public class CategorieService {
    private static volatile CategorieService categorieService;
    private static volatile List<Categorie> liste;
    
    private CategorieService(){
        liste = new ArrayList<>();
    }
    
    public synchronized static CategorieService getInstance(){
        CategorieService instance = categorieService;
        if(instance == null){
            instance = categorieService = new CategorieService();
        }
        return instance;
    }
    
    public void ajouter(Categorie c){
        if(!(liste.contains(c))){
            liste.add(c);
        }else{
            throw new IllegalStateException("la categorie existe dans la liste");
        }
    }
    
    public Categorie modifier(Categorie c){
        Categorie cat = this.trouver(c.getId());
        if(cat != null){
            cat.setLibelle(c.getLibelle());
            cat.setDescription(c.getDescription());
            return cat;
        }else{
            throw new NoSuchElementException("la categorie n'existe pas dans la liste");
        }
    }
    
    public Categorie trouver(int id){
        try{
            for(Categorie c:liste){
                if(c.getId() == id){
                    return c;
                }
            }
        }catch(Exception e){
             throw new NoSuchElementException("la categorie n'existe pas dans la liste");
        }
        return null;
    }
    
    public void supprimer(int id){
         Categorie cat = this.trouver(id);
        if(cat != null){
            liste.remove(cat);
        }else{
            throw new NoSuchElementException("la categorie n'existe pas dans la liste");
        }
    }
    
    public int compter(){
        return liste.size();
    }
    
    public List<Categorie> lister(){
        if(liste.isEmpty()){
            return null;
        }
        return liste;
    }
    
    
}
