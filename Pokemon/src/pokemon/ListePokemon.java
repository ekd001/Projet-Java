/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EKLOU Dodji
 */
public class ListePokemon {
    private List<Pokemon> listeP = new ArrayList<>();
    private List<PokemonFeu> listePF = new ArrayList<>();
    private List<PokemonPlante> listePP = new ArrayList<>();
    private List<PokemonEau> listePE = new ArrayList<>();
    
    
    public void addPokemonNormale(Pokemon p){
        this.listeP.add(p);
    }
    
    public void addPokemonFeu(PokemonFeu p){
        this.listePF.add(p);
    }
    
    public void addPokemonPlante(PokemonPlante p){
        this.listePP.add(p);
    }
    
    public void addPokemonEau(PokemonEau p){
        this.listePE.add(p);
    }
    
    public void addPokemon(Pokemon p){
        if(p instanceof PokemonFeu){
            this.addPokemonFeu((PokemonFeu) p);
        }else if(p instanceof PokemonPlante){
            this.addPokemonPlante((PokemonPlante) p);
        }
    }
    
    public void createPokemon(String nom,String type, int pVie, int pAttaque){
        if(type.toUpperCase().equals("FEU")){
            PokemonFeu r = new PokemonFeu(nom,pVie,pAttaque);
            this.listePF.add(r);
        }else if(type.toUpperCase().equals("EAU")){
            PokemonEau r = new PokemonEau(nom,pVie,pAttaque);
            this.listePE.add(r);
        }else if(type.toUpperCase().equals("PLANTE")){
            PokemonPlante r = new PokemonPlante(nom,pVie,pAttaque);
            this.listePP.add(r);
        }else if(type.toUpperCase().equals("NORMALE")){
            Pokemon r = new Pokemon(nom,pVie,pAttaque);
            this.listeP.add(r);
        }
    }
    
    public Pokemon getPkNormale(String nom){
        for(Pokemon p:this.listeP){
            if(p.getNom().equals(nom)){
                return p;
            }
        }
        return null;
    }
    
    public PokemonFeu getPkFeu(String nom){
        for(PokemonFeu p:this.listePF){
            if(p.getNom().equals(nom)){
                return p;
            }
        }
        return null;
    }
    
    public PokemonEau getPkEau(String nom){
        for(PokemonEau p:this.listePE){
            if(p.getNom().equals(nom)){
                return p;
            }
        }
        return null;
    }
    
    public PokemonPlante getPkPlante(String nom){
        for(PokemonPlante p:this.listePP){
            if(p.getNom().equals(nom)){
                return p;
            }
        }
        return null;
    }
    
    public  void afficherPok(String nom){
        if(this.getPkFeu(nom) != null){
            this.getPkFeu(nom).Afficher();
        }else if(this.getPkPlante(nom )!= null){
            this.getPkPlante(nom).Afficher();
        }else if(this.getPkEau(nom )!= null){
            this.getPkEau(nom).Afficher();
        }else{
            this.getPkNormale(nom).Afficher();
        }
    }
    
    
    
    
    public void afficherList(){
        for(Pokemon p:this.listeP){
            p.Afficher();
        }
        
        for(PokemonFeu p:this.listePF){
            p.Afficher();
        }
        
        for(PokemonPlante p:this.listePP){
            p.Afficher();
        }
        
        for(PokemonEau p:this.listePE){
            p.Afficher();
        }
    }
    
    public void combat(String nom, String nom1){
        
        if(this.getPkFeu(nom) != null){
            PokemonFeu p1 = this.getPkFeu(nom);
            if(this.getPkPlante(nom1) != null){
                PokemonPlante p2 = this.getPkPlante(nom1);
                p1.Attaquer(p2);
            }else if(this.getPkEau(nom1) != null){
                PokemonEau p2 = this.getPkEau(nom1);
                p1.Attaquer(p2);
            }else{
                Pokemon p2 = this.getPkNormale(nom1);
                p1.Attaquer(p2);
            }
        }
        
        if(this.getPkEau(nom) != null){
            PokemonEau p1 = this.getPkEau(nom);
            if(this.getPkFeu(nom1) != null){
                PokemonFeu p2 = this.getPkFeu(nom1);
                p1.Attaquer(p2);
            }else if(this.getPkPlante(nom1) != null){
                PokemonPlante p2 = this.getPkPlante(nom1);
                p1.Attaquer(p2);
            }else{
                Pokemon p2 = this.getPkNormale(nom1);
                p1.Attaquer(p2);
            }
        }
        
        if(this.getPkPlante(nom) != null){
            PokemonPlante p1 = this.getPkPlante(nom);
            if(this.getPkFeu(nom1) != null){
                PokemonFeu p2 = this.getPkFeu(nom1);
                p1.Attaquer(p2);
            }else if(this.getPkEau(nom1) != null){
                PokemonEau p2 = this.getPkEau(nom1);
                p1.Attaquer(p2);
            }else{
                Pokemon p2 = this.getPkNormale(nom1);
                p1.Attaquer(p2);
            }
        }
        
        if(this.getPkNormale(nom) != null){
            Pokemon p1 = this.getPkNormale(nom);
            if(this.getPkFeu(nom1) != null){
                PokemonFeu p2 = this.getPkFeu(nom1);
                p1.Attaquer(p2);
            }else if(this.getPkEau(nom1) != null){
                PokemonEau p2 = this.getPkEau(nom1);
                p1.Attaquer(p2);
            }else{
                PokemonPlante p2 = this.getPkPlante(nom1);
                p1.Attaquer(p2);
            }
        }
    }
}
