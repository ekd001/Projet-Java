/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvente;

/**
 *
 * @author EKLOU Dodji
 */
public class ArticleSimple extends Article{
    private double prix_unitaire;
    private int quantite;
    public ArticleSimple(String reference, String libelle, Categorie categorie,int quantite, double prix_unitaire, ElementKit eltKit){
        super(reference, libelle, categorie, eltKit);
        this.prix_unitaire = prix_unitaire;
        this.quantite = quantite;
    }
    
    public int getQuantite(){
        return this.quantite;
    }
    public void setQuantite(int q){
        this.quantite = q;
    }
    @Override
    public double getPrix_unitaire(){
        return this.prix_unitaire;
    }
    
    public void destocker(){
        
    }
}
