/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetraitArgent;

import Confirmation.ConfirmationClass;
import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class PointRetraitClass implements PointRetrait{
    public Request<PointRetraitClass> request;
    
    public PointRetraitClass(Request<PointRetraitClass> req){
        this.request = req;
    }
    
    public void message(){
        System.out.println("Choisissez le point de retrait : \n");
        System.out.println("1.Agence\n");
        System.out.println("2.Distributeur automatique\n");
        System.out.println("Entrer votre choix : ");
        var choix = this.request.getScanner().nextInt();
        if(choix == 1){
            System.out.println("Agence choisit\n");
        }else if(choix==2){
            System.out.println("Distributeur choisit\n");
        }
        this.request.changeState(new ConfirmationClass((Request<ConfirmationClass>)(Object) request,
        "Retrait","le montant et le point de retrait"));
        this.request.send();
    }
}
