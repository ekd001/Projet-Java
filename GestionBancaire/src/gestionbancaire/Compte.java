/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbancaire;

/**
 *
 * @author User
 */
public class Compte {
    private int num;
    private double solde;
    private int codePin;
    
    public void Compte (int num, double solde, int codePin){
        this.num = num;
        this.solde = solde;
        this.codePin = codePin;
    }
    
    public void Compte (){
    }
    // Ascesseurs de num
    public int getNum(){
        return num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    // Ascesseurs de solde
    public double getSolde(){
        return solde;
    }
    
    public void setSolde(double solde){
        this.solde = solde;
    }
    // Ascesseurs de codePin 
    public int getCodePin(){
        return codePin;
    }
    
    public void setCodePin(int codePin){
        this.codePin = codePin;
    }
    
    public void afficher(){
    
    }
}
