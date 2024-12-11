/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author EKLOU Dodji
 */
public class Pokemon {
    protected String nom;
    protected int hp;
    protected int atk;
    private String type = "normale";
    
    public Pokemon(String nom, int hp, int atk){
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getHp(){
        return this.hp;
    }
    
    public int getAtk(){
        return this.atk;
    }
    
    public void setHp(int hp){
        this.hp =hp; 
    }
    
    public boolean isDead(){
        return this.hp == 0;
    }
    
    public void Attaquer(Pokemon p){
        p.hp = p.hp - this.atk;
    }
    
    public void Attaquer(PokemonEau p){
        p.hp = p.hp - this.atk;
    }
    
    public void Attaquer(PokemonFeu p){
        p.hp = p.hp - this.atk;
    }
    
    public void Attaquer(PokemonPlante p){
        p.hp = p.hp - this.atk;
    }
    
   
    public void Afficher(){
        
        System.out.println("Nom:"+this.nom);
        System.out.println("Type:"+this.type);
        System.out.println("HP:"+this.hp);
        System.out.println("PK:"+this.atk);
        System.out.println("");
    }
}
