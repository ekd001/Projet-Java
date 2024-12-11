/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class Categorie {
    private String reference;
    private String libelle;
    private List<Article> listArticle = new ArrayList<>();
    
    public Categorie(String reference, String libelle){
        this.reference = reference;
        this.libelle = libelle;
    }
    
    public void addArticle(Article a){
        this.listArticle.add(a);
    }
    public String getLibelle(){
        return this.libelle;
    }
}
