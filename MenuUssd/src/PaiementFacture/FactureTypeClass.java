/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaiementFacture;

import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class FactureTypeClass implements FactureType{
    private final Request<FactureTypeClass> req;
    
    public FactureTypeClass(Request<FactureTypeClass> req){
        this.req = req;
    }
    
    /**
     *
     */
    @Override
    public void message(){
        System.out.println("Choisissez le type de facture : \n");
        System.out.println("1.Electricité\n");
        System.out.println("2.Eau\n");
        System.out.println("3.Telephone\n");
        System.out.println("4.Internet\n");
        System.out.println("Entrer votre choix : ");
        var choix = this.req.getScanner().nextInt();
        this.req.changeState(new NumeroFactureClass((Request<NumeroFactureClass>)(Object) req));
        this.req.send();
    }
}
