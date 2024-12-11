/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvente;

/**
 *
 * @author EKLOU Dodji
 */
abstract class Article {
    private String reference;
    private String libelle;
    private Categorie categorie;
    private ElementKit elementkit;
    
    public Article(String reference, String libelle, Categorie categorie, ElementKit eltKit){
        this.reference = reference;
        this.libelle = libelle;
        this.categorie = categorie;
        this.elementkit = eltKit;
    }
    
    public abstract double getPrix_unitaire();
    public String getReference(){
        return this.reference;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public String getCategorie(){
        return this.categorie.getLibelle();
    }
    
    
}
