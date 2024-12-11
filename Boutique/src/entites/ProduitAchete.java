/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;

/**
 *
 * @author EKLOU Dodji
 */
public class ProduitAchete implements Serializable{
    private double remise;
    private Achat achat;
    private Produit produit;

    public ProduitAchete() {
    }

    public Achat getAchat() {
        return achat;
    }

    public Produit getProduit() {
        return produit;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    public double getPrixUnitaire(){
        return this.produit.getPrixUnitaire();
    }
    
    public long getIdAchat(){
        return  this.achat.getId();
    }
    
    public long getIdProduit(){
        return this.produit.getId();
    }
    
}
