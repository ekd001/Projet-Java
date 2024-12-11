/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuussd;

import Acceuil.Bienvenue;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 *
 * @author EKLOU Dodji
 * @param <T>
 */
public class Request<T> {
    private T etat;
    private final Scanner scanner;
    
    public Request(){
        this.scanner = new Scanner(System.in);
        this.etat = (T) new Bienvenue((Request<Bienvenue>) this);
    }

    public T getEtat() {
        return etat;
    }

    public void setEtat(T etat) {
        this.etat = etat;
    }
    
    public Scanner getScanner(){
        return this.scanner; 
    }
    
    public void send(){
        try{
            var method = this.etat.getClass().getMethod("message");
            method.invoke(this.etat);
        }catch(IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e){
            throw new IllegalStateException("L'etat n'implemente pas la méthode message",e);
        }
    }
    
    public <U> void changeState(U newState) {
        this.setEtat((T) newState);
    }
    
    public  void close(){
        System.exit(0);
    }
}
