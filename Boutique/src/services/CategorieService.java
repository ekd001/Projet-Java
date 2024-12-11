/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entites.Categorie;
import java.util.ArrayList;
import java.util.List;

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
    
    public CategorieService getInstance(){
        CategorieService instance = categorieService;
        if(instance == null){
            synchronized(CategorieService.class){
                instance = categorieService;
                if(instance == null){
                    instance = categorieService = new CategorieService();
                }
            }
        }
        return instance;
    }
    
    public void ajouter(Categorie c){
        try{
            liste.add(c);
        }catch(Exception e){
            System.out.println("e "+ "La categorie n'a pas été ajouté");
        }
    }
    
    public void modifier(Categorie c){
    
    }
    
    public Categorie trouver(int id){
        try{
            for(Categorie c:liste){
                if(c.getId() == id){
                    return c;
                }
            }
        }catch(Exception e){
            System.out.println(e + "La categorie n'a pas été trouver");
        }
        return null;
    }
    
    public void supprimer(Categorie c){
        try{
            liste.remove(c);
        }catch(Exception e){
            System.out.println(e+" La categorie n'a pas été supprimée");
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
