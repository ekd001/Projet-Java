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
public class Client {
    private int id;
    private String noms;
    private String prenoms;
    private List<Vente> vente = new ArrayList<>();
    
    public Client(int id, String noms, String prenoms){
        this.id = id;
        this.noms = noms;
        this.prenoms = prenoms;
    }
    
    public void addVente(Vente v){
        this.vente.add(v);
    }
    
    public Vente getVente(){
        return this.vente.get(0);
    }
    public int getId(){
        return this.id;
    }
    public String getNom(){
        return this.noms;
    }
    public String getPrenom(){
        return this.prenoms;
    }
}
