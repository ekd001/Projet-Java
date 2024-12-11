/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class Achat implements Serializable{
    private long id;
    private LocalDate dateAchat;
    private double remise = 0.;
    private Employe employe;
    private Client client;
    private List<ProduitAchete> produitAchete;

    public Achat() {
        this.produitAchete = new ArrayList<>();
    }
    
    

    public long getId() {
        return id;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public double getRemise() {
        return remise;
    }

    public Employe getEmploye() {
        return employe;
    }

    public Client getClient() {
        return client;
    }

    public List<ProduitAchete> getProduitAchete() {
        return produitAchete;
    }
    
    
    public void setId(long id) {
        this.id = id;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setProduitAchete(List<ProduitAchete> produitAchete) {
        this.produitAchete = produitAchete;
    }
    
   
    
    
    public double getRemiseTotale(){
        double remiseTotal = 0.0;
        for(ProduitAchete pa: this.produitAchete){
            remiseTotal += pa.getRemise();
        }
        return remiseTotal;
    }
    
    public double getTotalPayer(){
        double total = 0.0;
        for(ProduitAchete pa: this.produitAchete){
            total += pa.getPrixUnitaire();
        }
        return total - this.getRemiseTotale();
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 11 * hash + (int)(this.id ^ (this.id  >>> 32));
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Achat other = (Achat) obj;
        return this.id == other.id;
    }
}
