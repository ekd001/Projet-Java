
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
public class Kit extends Article{
    private List<ElementKit> elementKit = new ArrayList<>(); 
    private int quantite;
    public Kit(String reference, String libelle, Categorie categorie, ElementKit eltKit){
        super(reference, libelle,categorie,eltKit);
    }
    
    public void addElementKit(ElementKit e){
        this.elementKit.add(e);
    }
    
    public List<ElementKit> getElementKit(){
        return this.elementKit;
    }
    
    @Override
    public double getPrix_unitaire(){
        double prix = 0;
        for(ElementKit e :this.elementKit){
            prix = prix + (e.getPrix() - e.getPrix()*5/100);
        }
        return prix;
    }
    
    
}
