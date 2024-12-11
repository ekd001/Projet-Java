/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author EKLOU Dodji
 */
public class PokemonFeu extends Pokemon{
    private String type = "Feu";
    public PokemonFeu(String nom, int hp, int atk){
        super(nom, hp, atk);
    }
    
   
    
    @Override
    public boolean isDead(){
        return this.hp == 0;
    }
    
    
    
    @Override
    public void Attaquer(Pokemon p){
        if(p.hp < 1)
        {
            p.setHp(0);
            
        }else{
            p.hp = p.hp - this.atk;
            
        }
       
    }
    
    public void Attaquer(PokemonFeu p){
        if(p.hp < 1)
        {
            p.setHp(0);
            
        }else{
            p.hp = p.hp - this.atk;
            
        }
       
    }
    
    public void Attaquer(PokemonEau p){
        if(p.hp < 1){
            p.setHp(0);
        }else{
            p.hp = (int)(p.hp - this.atk*0.5);
            if(p.hp < 1){p.setHp(0);}
        }
    }
    
   
    public void Attaquer(PokemonPlante p){
        if(p.hp < 1){
            p.setHp(0);
        }else{
            p.hp = (int)(p.hp - this.atk*2);
            if(p.hp < 1){p.setHp(0);}
        }
    }
    
    @Override
    public void Afficher(){
        
        System.out.println("Nom:"+this.nom);
        System.out.println("Type:"+this.type);
        System.out.println("HP:"+this.hp);
        System.out.println("PK:"+this.atk);
        System.out.println("");
    }
}
