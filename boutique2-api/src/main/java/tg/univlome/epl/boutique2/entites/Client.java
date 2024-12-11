/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.entites;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
@XmlRootElement
public class Client extends Personne{
    private List<Achat> listAchat;
    
    public Client(){}
    
    public Client(long id, String nom, String prenom){
        super(id, nom, prenom);
    }


    public List<Achat> getListAchat() {
        return listAchat;
    }

    public void setListAchat(List<Achat> listAchat) {
        this.listAchat = listAchat;
    }
    
    
    
}
