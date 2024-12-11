/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransfertArgent;

import Confirmation.ConfirmationClass;
import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class MontantTransfererClass implements MontantTransferer{
    private final Request<MontantTransfererClass> request;

    public MontantTransfererClass(Request<MontantTransfererClass> request) {
        this.request = request;
    }
    
    @Override
    public void message(){
        System.out.println("Entrer le montant à transferer : ");
        var montant = this.request.getScanner().nextInt();
        this.request.changeState(new ConfirmationClass((Request<ConfirmationClass>)(Object) request,
                "Transfert","le montant et le destinataire"));
        this.request.send();
    }
    
}
