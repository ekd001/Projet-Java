/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entites.Personne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class PersonneService {
    private static volatile PersonneService personneService;
    private static volatile List<Personne> liste;
    
    private PersonneService(){
        liste = new ArrayList<>();
    }
    
    public static PersonneService getInstance(){
        PersonneService instance = personneService;
        if(instance == null){
            synchronized (PersonneService.class) {
                instance = personneService;
                if(instance == null){
                    instance = personneService = new PersonneService();
                }
            }
        }
        return instance;
    }
    
    
    public void ajouter(Personne p){
        try{
            liste.add(p);
        }catch(Exception e){
            System.out.println(e + " La personne n'a pas pu être ajoutée");
        }
        
    }
    
    public void modifier(Personne p){
        
    }
    
    public Personne trouver(int id){
        try{
            for(Personne p : liste){
                if(p.getId() == id){
                    return p;
                }
            }
        }catch(Exception e){
            System.out.println(e+" La personne n'est pas disponible dans la liste");
        }
        return null;
    }
    
    public void supprimer(Personne p){
        try{
            liste.remove(p);
        }catch(Exception e){
            System.out.println(e+" La personne n'a pas été supprimée");
        }
    }
    
    public int compter(){
        return liste.size();
    }
    
    public List<Personne> lister(){
        if(liste.isEmpty()){
            return null;
        }
        return liste;
    }
}
