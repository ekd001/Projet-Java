/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.pd2;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import java.util.List;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import tg.univlome.epl.boutique2.entites.Produit;

/**
 *
 * @author EKLOU Dodji
 */
public class ProduitClient {
    private static ProduitClient produitClient;
    private final Client client;
    private static final String URL = "http://localhost:8080/boutique2/rs/produit";
    
    private ProduitClient(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));

        JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
        provider.setMapper(mapper);

       this.client = ClientBuilder.newClient();
       this.client.register(provider);
    }
    
    public static synchronized ProduitClient getInstance(){
        if(produitClient == null){
            return new ProduitClient();
        }
        return produitClient;
    }
    
    public void ajouter(Produit p){
        Response response = client.target(URL)
                .path("ajouter")
                .request()
                .post(Entity.entity(p, MediaType.APPLICATION_JSON));
        if (response.getStatus() != 200) {
            throw new IllegalStateException("Echec de l'ajout du produit");
        } 
    }
    
    public void modifier(Produit p){
        Response response = client.target(URL)
                .path("modifier")
                .request()
                .put(Entity.entity(p, MediaType.APPLICATION_JSON));
        if(response.getStatus() != 200){
            throw new IllegalStateException("Echec de la modification du produit");
        }
    }
    
    public void trouver(int id){
        Response response = client.target(URL)
                .path("trouver/{id}")
                .resolveTemplate("id", id)
                .request()
                .get();
        if(response.getStatus() != 200){
            throw new IllegalStateException("produit non trouvé");
        }
    }
    
    public void supprimer(int id){
        Response response = client.target(URL)
                .path("supprimer/"+id)
                .request()
                .delete();
        if (response.getStatus() != 200) {
            throw new IllegalStateException("Echec de suppression du produit");
        } 
    }
    
    public List<Produit> lister(){
        Response response = client.target(URL)
                .path("lister")
                .request()
                .get();
        if(response.getStatus() == 200){
            List<Produit> p = response.readEntity(new GenericType<List<Produit>>() {});
            return p;
        }else{
            throw new IllegalStateException("Echec de recupération des produits");
        }
    }
    
    public Integer compter(){
        Response response = client.target(URL)
                .path("compter")
                .request()
                .get();
        if (response.getStatus() == 200) {
            Integer nbre = response.readEntity(new GenericType<Integer>() {});
            return nbre;
        } else {
            throw new IllegalStateException("Echec de recupération du nombre de produit");
        }
    }
    
    public List<Produit> perimes(){
        Response response = client.target(URL)
                .path("perimes")
                .request()
                .get();
        if(response.getStatus() == 200){
            List<Produit> p = response.readEntity(new GenericType<List<Produit>>() {});
            return p;
        }else{
            throw new IllegalStateException("Echec de recupération des produits périmés");
        }
    }
}
