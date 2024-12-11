/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import tg.univlome.epl.boutique2.entites.Employe;

/**
 *
 * @author EKLOU Dodji
 */
public class EmployeService {
    private static volatile EmployeService employeService;
    private static volatile List<Employe> liste;
    
    private EmployeService(){
        liste = new ArrayList<>();
    }
    
    public static EmployeService getInstance(){
        EmployeService instance = employeService;
        if(instance == null){
            synchronized (EmployeService.class) {
                instance = employeService;
                if(instance == null){
                    instance = employeService = new EmployeService();
                }
            }
        }
        return instance;
    }
    
    public void ajouter(Employe e){
        if(!(liste.contains(e))){
            liste.add(e);
        }else{
            throw new IllegalStateException("L'employé existe dans la liste");
        }
        
    }
    
    public void modifier(Employe epy){
        Employe e = this.trouver(epy.getId());
        if(e != null){
            e.setNom(epy.getNom());
           e.setPrenom(epy.getPrenom());
        }else{
            throw new NoSuchElementException("L'employé n'existe pas dans la liste");
        }
        
    }
    
    public Employe trouver(long id){
        try{
            for(Employe e:liste){
                if(e.getId() == id){
                    return e;
                }
            }
        }catch(Exception e){
            throw new NoSuchElementException("L'employé n'existe pas dans la liste");
        }
        return null;
    }
    
    public void supprimer(Integer id){
        Employe e = this.trouver(id.longValue());
        if(e != null){
            liste.remove(e);
        }else{
            throw new NoSuchElementException("L'employé n'existe pas dans la liste");
        }
    }
    
    public int compter(){
        return liste.size();
    }
    
    public List<Employe> lister(){
        if(liste.isEmpty()){
            return null;
        }
        return liste;
    }
}
