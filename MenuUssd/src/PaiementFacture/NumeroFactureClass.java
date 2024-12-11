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
public class NumeroFactureClass implements NumeroFacture{
    private final Request<NumeroFactureClass> req;
    
    public NumeroFactureClass(Request<NumeroFactureClass> req){
        this.req = req;
    }
    
    @Override
    public void message(){
        System.out.println("Entrez le numero de compte ou de facture : ");
        var numero = this.req.getScanner().nextInt();
        this.req.changeState(new MontantPayerClass((Request<MontantPayerClass>)(Object) req));
        this.req.send();
    }
}
