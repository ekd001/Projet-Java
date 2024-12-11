/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransfertArgent;

import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class NumeroTelephoneClass implements NumeroTelephone{
    private final Request<NumeroTelephoneClass> request;
    
    /**
     *
     * @param request
     */
    public NumeroTelephoneClass(Request<NumeroTelephoneClass> request){
        this.request = request;
    } 
    
    @Override
    public void message(){
        System.out.println("Entrer le numero de telephone du destinataire : ");
        var numero = this.request.getScanner().nextInt();
        this.request.changeState(new MontantTransfererClass((Request<MontantTransfererClass>)(Object) this.request));
        this.request.send();
    }
}
