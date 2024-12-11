/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.entites;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
@XmlRootElement
public class Produit implements Serializable{
    private long id;
    private String libelle;
    private double prixUnitaire;
    private LocalDate datePeremtion;
    private List<ProduitAchete> listProduitAchete;
    private Categorie categorie;
    
    
    public Produit() {

    }
    
    public Produit(long id,String libelle, double pUnitaire){
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = pUnitaire;
    }
    
    public Produit(long id,String libelle, double pUnitaire, Categorie categorie){
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = pUnitaire;
        this.categorie = categorie;
    }

    
    public Produit(long id,String libelle, double pUnitaire, LocalDate datePeremtion, Categorie categorie){
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = pUnitaire;
        this.datePeremtion = datePeremtion;
        this.categorie = categorie;
    }
    
    
    public long getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public LocalDate getDatePeremtion() {
        return datePeremtion;
    }

    public List<ProduitAchete> getListProduitAchete() {
        return listProduitAchete;
    }

    public Categorie getCategorie() {
        return categorie;
    }
    
    

    public void setId(long id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setDatePeremtion(LocalDate datePeremtion) {
        this.datePeremtion = datePeremtion;
    }

    public void setListProduitAchete(List<ProduitAchete> listProduitAchete) {
        this.listProduitAchete = listProduitAchete;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    
    
    public boolean estPerime(){
        return this.datePeremtion.isBefore(LocalDate.now());
    }
    
    public boolean estPerime(LocalDate dateReference){
        return this.datePeremtion.isBefore(dateReference);
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 13 * hash + (int)(this.id ^ (this.id >>> 32));
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
        final Produit other = (Produit) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", prixUnitaire=" + prixUnitaire + ", datePeremtion=" + datePeremtion + ", listProduitAchete=" + listProduitAchete + ", categorie=" + categorie + '}';
    }
    
    
}
