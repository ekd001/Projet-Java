/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entites.Achat;
import java.util.ArrayList;
import java.util.List;

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
    
    public static AchatService getInstance(){
        AchatService instance = achatService;
        
        if(instance == null){
            synchronized(AchatService.class){
                instance = achatService;
                if(instance == null){
                    instance = achatService = new AchatService();
                }
            }
        }
        return instance;
    }
    
    public void ajouter(Achat a){
        try{
            liste.add(a);
        }catch(Exception e){
            System.out.println(e+" L'achat n'a pas été ajouté");
        }
    }
    
    public void modifier(Achat a){
        
    }
    
    public Achat trouver(int id){
        try{
            for(Achat a : liste){
                if(a.getId() == id){
                    return a;
                }
            }
        }catch(Exception e){
            System.out.println(e + " L'achat n'a pas été trouvé");
        }
        return null;
    }
    
    public void supprimer(Achat a){
        try{
            liste.remove(a);
        }catch(Exception e){
            System.out.println(e+" L'achat n'a pas été supprimé");
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
