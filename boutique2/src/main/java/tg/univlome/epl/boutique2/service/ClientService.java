/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import tg.univlome.epl.boutique2.entites.Client;

/**
 *
 * @author EKLOU Dodji
 */
public class ClientService {
    private static volatile ClientService clientService;
    private static volatile List<Client> liste;
    
    private ClientService(){
        liste = new ArrayList<>();
    }
    
    public static ClientService getInstance(){
        ClientService instance = clientService;
        if(instance == null){
            synchronized (ClientService.class) {
                instance = clientService;
                if(instance == null){
                    instance = clientService = new ClientService();
                }
            }
        }
        return instance;
    }
    
    public void ajouter(Client c){
        if(!(liste.contains(c))){
            liste.add(c);
        }else{
            throw new IllegalStateException("Le client existe dans la liste");
        }
        
    }
    
    public void modifier(Client c){
        Client client = this.trouver(c.getId());
        if(client != null){
            client.setNom(c.getNom());
            client.setPrenom(c.getPrenom());
        }else{
            throw new NoSuchElementException("Le client n'existe pas dans la liste");
        }
        
    }
    
    public Client trouver(long id){
        try{
            for(Client c:liste){
                if(c.getId() == id){
                    return c;
                }
            }
        }catch(Exception e){
            throw new NoSuchElementException("Le produit n'existe pas dans la liste");
        }
        return null;
    }
    
    public void supprimer(Integer id){
        Client c = this.trouver(id.longValue());
        if(c != null){
            liste.remove(c);
        }else{
            throw new NoSuchElementException("Le client n'existe pas dans la liste");
        }
    }
    
    public int compter(){
        return liste.size();
    }
    
    public List<Client> lister(){
        if(liste.isEmpty()){
            return null;
        }
        return liste;
    }
}
