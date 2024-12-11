/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montre;

/**
 *
 * @author EKLOU Dodji
 */
public class Affichage implements Etat{
    private Montre montre;
    public Affichage(Montre m){
        this.montre = m;
    }

    @Override
    public void appuyer2xButon1() {
        this.montre.setEtat(new ModificationHeure(this.montre));
    }

    @Override
    public void appuyerButon1() {
        //Rien ne se passe
    }

    @Override
    public void appuyerButon2() {
        //Rien ne se passe
    }
    
    
}
