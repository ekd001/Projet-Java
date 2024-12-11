/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class Client extends Personne{
    private List<Achat> listAchat;

    public Client(List<Achat> listAchat) {
        this.listAchat = listAchat;
    }

    public List<Achat> getListAchat() {
        return listAchat;
    }

    public void setListAchat(List<Achat> listAchat) {
        this.listAchat = listAchat;
    }
    
    
    
}
