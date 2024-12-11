/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Confirmation;


import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class ConfirmationClass implements Confirmation{
    private final Request<ConfirmationClass> request;
    private final String label;
    private final String objective;
    
    public ConfirmationClass(Request<ConfirmationClass> req,String objective,String label){
        this.request = req;
        this.label = label;
        this.objective = objective;
    }
    
    @Override
    public void message(){
        System.out.println("Confirmer "+this.label+" : \n");
        System.out.println("1.Confirmer avec code secret\n");
        System.out.println("2.Annuler\n");
        System.out.println("Entrer votre choix : ");
        var choix = this.request.getScanner().nextInt();
        switch(choix){
            case 1:
                System.out.println("Entrer le code secret : ");
                var code = this.request.getScanner().nextInt();
                System.out.println(this.objective+" passé(e) avec succès");
                this.request.close();
            case 2:
                System.out.println(this.objective+" annulé");
                this.request.close();
        }
    }
}
