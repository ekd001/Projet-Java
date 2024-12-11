/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvente;

/**
 *
 * @author EKLOU Dodji
 */
public class ElementKit {
    private int quantite;
    private Article article;
    
    public ElementKit(int quantite){
        this.quantite = quantite;
    }
    public double getPrix(){
        return article.getPrix_unitaire()*this.quantite;
    }
    
    public void setQuantite(int q){
        this.quantite = q;
    }
    public int getQuantite(){
        return this.quantite;
    }
    public void setArticle(Kit kit){
        this.article = kit;    
    }
    public void setArticle(ArticleSimple a){
        this.article = a;
    }
    
    public Article getArticle(){
        return this.article;
    }
    
}
