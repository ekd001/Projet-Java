/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acceuil;

import AchatCredit.AchatCreditClass;
import PaiementFacture.FactureTypeClass;
import RetraitArgent.MontantRetirerClass;
import TransfertArgent.NumeroTelephoneClass;
import menuussd.Request;

/**
 *
 * @author EKLOU Dodji
 */
public class Bienvenue implements EtatBienvenue{
    private final Request<Bienvenue> request;

    /**
     *
     * @param request
     */
    public Bienvenue(Request<Bienvenue> request){
        this.request = request;
    }
    
    @Override
    public void message(){
        System.out.println("Menu Principal\n");
        System.out.println("Bienvenue! Choisissez une option : \n");
        System.out.println("1.Transfer d'argent\n");
        System.out.println("2.Retrait d'argent\n");
        System.out.println("3.Achat de credit\n");
        System.out.println("4.Paiement de facteure\n");
        System.out.println("5.Quitter\n");
        System.out.println("Entrer : ");
        var choice = this.request.getScanner().nextInt();
        switch(choice){
            case 1 : 
                this.request.changeState(new NumeroTelephoneClass((Request<NumeroTelephoneClass>)(Object) this.request));
                this.request.send();
                break;
            case 2 :
                this.request.changeState(new MontantRetirerClass((Request<MontantRetirerClass>)(Object) this.request));
                this.request.send();
                break;
            case 3 :
                this.request.changeState(new AchatCreditClass((Request<AchatCreditClass>)(Object) this.request));
                this.request.send();
                break;
            case 4 : 
                this.request.changeState(new FactureTypeClass((Request<FactureTypeClass>)(Object) this.request));
                this.request.send();
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
