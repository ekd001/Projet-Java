/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

import java.util.Scanner;

/**
 *
 * @author EKLOU Dodji
 */
public class PokemonGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creation d'un pokemon normale
        Pokemon p = new Pokemon("pikachu",100,10);
        
        //creation d'un pokemonFeu
        PokemonFeu pf = new PokemonFeu("Arkanin",100,9);
        
        //creation d'un pokemonEau
        PokemonEau pe = new PokemonEau("Marais",100,8);
        
        //creation d'un pokemonPlante
        PokemonPlante pp = new PokemonPlante("Majaspic",100,6);
        
        ListePokemon list = new ListePokemon();
        list.addPokemonNormale(p);
        list.addPokemonFeu(pf);
        list.addPokemonEau(pe);
        list.addPokemonPlante(pp);
        
        boolean lancer0 = true;
        boolean lancer = true;
        Scanner lire = new Scanner(System.in);
        Scanner lire1 = new Scanner(System.in);
        Scanner lire2 = new Scanner(System.in);
        //vie des pokemon
        System.out.println("**********BIENVENUE DANS LE MONDE DES POKEMONS**********");
        System.out.println("");
        
        while(lancer0){
            System.out.println("taper 0 pour arrêter et 1 pour crée un pokemon");
            System.out.print("Entrer :  ");
            int n = lire.nextInt();
            if(n == 0){
                lancer0 = false;
            }else{
                System.out.print("Entrez le type de pokemon : ");
                String type = lire1.nextLine();
                System.out.print("Entrez le nom de pokemon :");
                String nom = lire1.nextLine();
                System.out.print("Entrez le point de vie du pokemon : ");
                int pv =lire.nextInt();
                System.out.print("Entrez le point d'attaque du pokemon : ");
                int pk = lire.nextInt();
                list.createPokemon(nom, type, pv, pk);
            }
        }
        
        //informations sur les pokemon avant les attaques
        System.out.println("PRESENTATION DES POKEMONS");
        System.out.println("-------------------------");
        list.afficherList();
        
        //verifier si un pokemon est mort ou vivant
        
     
        System.out.println("LES COMBATS DES POKEMONES");
        System.out.println("-------------------------");
        while(lancer){
            System.out.print("Saisir le nom du pokemon attaquant : ");
            String nom1 = lire2.nextLine();
            list.afficherPok(nom1);
            System.out.print("Saisir le nom du pokemon à attaquer : ");
            String nom2 = lire2.nextLine();
            list.afficherPok(nom2);
            list.combat(nom1, nom2);
            /*list.getPokemon(nom1).Attaquer(list.getPokemon(nom2));*/
            System.out.println("APRES ATTAQUE");
            System.out.println("--------------");
            System.out.println("");
            list.afficherPok(nom1);           
            list.afficherPok(nom2);
        }
        
     
        
        
        
        
        
       
    }

   
    
}
