/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetraitArgent;

import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class MontantRetirerClass implements MontantRetirer{
    private final Request<MontantRetirerClass> request;
    
    public MontantRetirerClass(Request<MontantRetirerClass> request){
        this.request = request;
    }
    
    @Override
    public void message(){
        System.out.println("Entrer le montant à retirer : ");
        var montant = this.request.getScanner().nextInt();
        this.request.changeState(new PointRetraitClass((Request<PointRetraitClass>)(Object) request));
        this.request.send();
    }
}
