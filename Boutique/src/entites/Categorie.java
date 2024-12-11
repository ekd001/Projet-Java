/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class Categorie implements Serializable{
    private int id;
    private String libelle;
    private String description;
    private List<Produit> produit;

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDescription() {
        return description;
    }

    public List<Produit> getProduit() {
        return produit;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 11 * hash + (int)(this.id ^ (this.id >>> 32));
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
        final Categorie other = (Categorie) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", libelle=" + libelle + ", description=" + description + ", produit=" + produit + '}';
    }
    
    
    
}