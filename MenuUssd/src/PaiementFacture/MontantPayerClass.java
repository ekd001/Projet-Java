/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaiementFacture;

import Confirmation.ConfirmationClass;
import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class MontantPayerClass implements MontantPayer{
    private final Request<MontantPayerClass> req;
    
    public MontantPayerClass(Request<MontantPayerClass> req){
        this.req = req;
    }
    
    @Override
    public void message(){
        System.out.println("Entrez le montant à payer");
        var montant = this.req.getScanner().nextInt();
        this.req.changeState(new ConfirmationClass((Request<ConfirmationClass>)(Object) req
                ,"Paiement","le montant et le destinataire"));
        this.req.send();
    }
}
