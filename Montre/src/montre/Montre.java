/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montre;

/**
 *
 * @author EKLOU Dodji
 */
public class Montre {
    private int heure;
    private int minute;
    private int seconde;
    private Etat etatCourant;
    private MontreUI ui;
    
    public Montre(MontreUI UI){
        this.ui = UI;
        this.heure = 12;
        this.minute = 00;
        this.seconde = 00;
        this.etatCourant = new Affichage(this);
    }
    
    public int getHeure(){
        return this.heure;
    }
    
    public int getminute(){
        return this.minute;
    }
    
    public int getSeconde(){
        return this.seconde;
    }
    
    public Etat getEtat(){
        return this.etatCourant;
    }
    
    public void setHeure(int h){
        this.heure = h;
    }
    
    public void setMinute(int m){
        this.minute = m;
    }
    
     public void setSeconde(int s){
        this.seconde = s;
    }
    
    public void setEtat(Etat etat){
        this.etatCourant = etat;
    }
    
    public MontreUI getMontreUI(){
        return this.ui;
    }
}
