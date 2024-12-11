/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbancaire;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class HistoriqueTransaction {
    private int numeroT;
    private LocalDate date;
    
    public void HistoriqueTransaction (int numeroT, LocalDate date){
        this.numeroT = numeroT;
        this.date = date;
    }
    
    public void HistoriqueTransaction (){
    }
    
    public int getNumeroT(){
        return numeroT;
    }
    
    public void setNumeroT(int numeroT){
        this.numeroT = numeroT;
    }
    
    public LocalDate getDate(){
        return date;
    }
    
    public void setDate(LocalDate date){
        this.date = date;
    }
    
    
}
