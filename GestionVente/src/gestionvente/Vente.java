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
public class Vente {
    private List<LigneVente> ligneVente = new ArrayList<>();
    private Client cl;
    public void addLigneVente(LigneVente lv){
        this.ligneVente.add(lv);
    }
    
    public void setClient(Client cl){
        this.cl = cl;
    }
    
    public List getLigneVente(){
        return this.ligneVente;
    }
}
