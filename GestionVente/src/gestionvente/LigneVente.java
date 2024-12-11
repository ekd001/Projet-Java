/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvente;

/**
 *
 * @author EKLOU Dodji
 */
public class LigneVente {
    private int quantite;
    private ElementKit eltkit;
    private int remise;
    private Vente vente;
    public LigneVente(int quantite,ElementKit eltkit,int remise){
        this.quantite = quantite;
        this.eltkit = eltkit;
        if(remise <= 10){
            this.remise = remise;
        }else{
            this.remise = 0;
        }   
    }
    
    public double getPrixVente(){
        double prix = (this.eltkit.getPrix()*this.quantite) - (this.eltkit.getPrix()*this.remise/100);
        try{
             this.updateQuantite((ArticleSimple) this.getElementKit().getArticle(),this.eltkit.getQuantite());
        }catch(Exception e){
            this.updateQuantite((Kit) this.getElementKit().getArticle());
        }
       
        
       
        return prix;
    }
    public int getQuantite(){
        return this.quantite;
    }
    public void setVente(Vente v){
        this.vente = vente;
    }
    public int getRemise(){
        return this.remise;
    }
    
    public ElementKit getElementKit(){
        return this.eltkit;
    }
    public void updateQuantite(ArticleSimple a, int q){
        a.setQuantite(a.getQuantite() - this.quantite*q);
    }
    
    public void updateQuantite(Kit k ){
        for(ElementKit e:k.getElementKit()){
            ArticleSimple a = (ArticleSimple) e.getArticle();
            a.setQuantite(a.getQuantite() - this.quantite*e.getQuantite());
        }
    }
}
