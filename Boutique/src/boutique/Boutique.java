/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boutique;

import entites.Client;
import services.PersonneService;

/**
 *
 * @author EKLOU Dodji
 */
public class Boutique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client c = new Client(null);
        c.setId(1);
        PersonneService.getInstance().ajouter(c);
        System.out.println(PersonneService.getInstance().compter());
        PersonneService.getInstance().supprimer(c);
        System.out.println(PersonneService.getInstance().compter());
        
    }
    
}
