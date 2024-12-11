/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbancaire;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Client {
    private int id;
    private String noms;
    private String prenoms;
    private LocalDate dateDeNaissance;
    private String adresse;
    private int contact;
    private String email;
    
    public void Client (int id,String noms,String prenoms,LocalDate dateDeNaissance,String adresse,int contact,String email){
        this.id = id;
        this.noms = noms;
        this.prenoms = prenoms;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.contact = contact;
        this.email = email;
    }
    
    public void Client (){
    }
   // Ascesseurs de Id
    public int getId(){
        return id;
    }
    //Ascesseurs de 
    public void setId(int id){
        this.id = id;
    }
    //Ascesseurs de noms
    public String getNoms(){
        return noms;
    }
    
    public void setNoms(String noms){
        this.noms = noms;
    }
     //Ascesseurs de prenom
    public String getPrenoms(){
        return prenoms;
    }
    
    public void setPrenoms(String Prenoms){
        this.prenoms = prenoms;
    }
     //Ascesseurs de dateDeNaissance
    public LocalDate getDateDeNaissance(){
        return dateDeNaissance;
    }
    
    public void setDateDeNaissance(LocalDate dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }
    //Ascesseurs de adresse
    public String getAdresse(){
        return adresse;
    }
    
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
     //Ascesseurs de contact
    public int getContact(){
        return contact;
    }
    
    public void setContact(int contact){
        this.contact = contact;
    }
    //Ascesseurs de email
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void faireDepot(){
    
    }
    
    public void faireRetrait(){
    
    }
    
    public HistoriqueTransaction demandeReleve(){
        return null;
    }
}
