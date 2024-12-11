/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import tg.univlome.epl.boutique2.entites.Achat;

/**
 *
 * @author EKLOU Dodji
 */
public class AchatService {
    private static volatile AchatService achatService;
    private static List<Achat> liste;
    
    private AchatService(){
        liste = new ArrayList<>();
    }
    
    public synchronized static AchatService getInstance(){
        AchatService instance = achatService;
        if(instance == null){
            instance = achatService = new AchatService();
        }
        return instance;
    }
    
    public void ajouter(Achat a){
        if(!(liste.contains(a))){
            liste.add(a);
        }else{
            throw new IllegalStateException("L'achat existe dans la liste");
        }
        
    }
    
    public void modifier(Achat a){
        Achat achat = this.trouver((int) a.getId());
        if(achat != null){
            achat.setProduitAchete(a.getProduitAchete());
        }else{
            throw new NoSuchElementException("L'achat n'existe pas dans la liste");
        }
    }
    
    public Achat trouver(int id){
        try{
            for(Achat a:liste){
                if(a.getId() == id){
                    return a;
                }
            }
        }catch(Exception e){
            throw new NoSuchElementException("L'achat n'existe pas dans la liste");
        }
        return null;
    }
    
    public void supprimer(int id){
        Achat a = this.trouver(id);
        if(a != null){
            liste.remove(a);
        }else{
            throw new NoSuchElementException("Le produit n'existe pas dans la liste");
        }
    }
    
    public int compter(){
       return liste.size();
    }
    
    public List<Achat> lister(){
        if(liste.isEmpty()){
            return null;
        }
        return liste;
    }
}
