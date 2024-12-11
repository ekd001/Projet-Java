/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montre;

/**
 *
 * @author EKLOU Dodji
 */
public class ModificationHeure implements Etat{
    private Montre montre;
    
    public ModificationHeure(Montre m){
        this.montre = m;
    }

    @Override
    public void appuyer2xButon1() {
        //Rien ne se passe
    }

    @Override
    public void appuyerButon1() {
        this.montre.setEtat(new ModificationMinute(this.montre));
    }

    @Override
    public void appuyerButon2() {
        this.montre.setHeure(this.montre.getHeure() + 1);
        this.montre.getMontreUI().updateTempsHeure();
    }
    
    
}
