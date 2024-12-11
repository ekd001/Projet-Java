/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AchatCredit;

import Confirmation.ConfirmationClass;
import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class AchatCreditClass implements AchatCredit{
    private final Request<AchatCreditClass> req;
    
    public AchatCreditClass(Request<AchatCreditClass> req){
        this.req = req;
    }
    
    @Override
    public void message(){
        System.out.println("Entrer le montant de credit : ");
        var montant = this.req.getScanner().nextInt();
        this.req.changeState(new Confirmation.ConfirmationClass((Request<ConfirmationClass>)(Object) req, 
                "Achat", "le montant"));
        this.req.send();
    }
}
