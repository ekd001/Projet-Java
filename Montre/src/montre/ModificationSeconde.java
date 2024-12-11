/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montre;

/**
 *
 * @author EKLOU Dodji
 */
public class ModificationSeconde implements Etat{
    private Montre montre;
    
    public ModificationSeconde(Montre montre){
        this.montre = montre;
    }

    @Override
    public void appuyer2xButon1() {
        
    }

    @Override
    public void appuyerButon1() {
        this.montre.setEtat(new Affichage(this.montre));
    }

    @Override
    public void appuyerButon2() {
        this.montre.setSeconde(this.montre.getSeconde() + 1);
        this.montre.getMontreUI().updateTempsSeconde();
    }
}
