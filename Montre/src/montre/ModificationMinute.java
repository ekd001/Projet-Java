/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montre;

/**
 *
 * @author EKLOU Dodji
 */
public class ModificationMinute implements Etat{
    private Montre montre;
    
    public ModificationMinute(Montre m){
        this.montre = m;
    }

    @Override
    public void appuyer2xButon1() {
        //Rien ne se passe
    }

    @Override
    public void appuyerButon1() {
        this.montre.setEtat(new ModificationSeconde(this.montre));
    }

    @Override
    public void appuyerButon2() {
        this.montre.setMinute(this.montre.getminute()+1);
        this.montre.getMontreUI().updateTempsminute();
    }
    
    
}
