/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class Employe extends Personne{
    private LocalDateTime dateNaissance;
    private List<ProduitAchete> listProduitAchete;

    public Employe() {
    }
    
    
    public LocalDateTime getDateNaissance() {
        return dateNaissance;
    }

    public List<ProduitAchete> getListProduitAchete() {
        return listProduitAchete;
    }

    public void setDateNaissance(LocalDateTime dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setListProduitAchete(List<ProduitAchete> listProduitAchete) {
        this.listProduitAchete = listProduitAchete;
    }
    
    
}
