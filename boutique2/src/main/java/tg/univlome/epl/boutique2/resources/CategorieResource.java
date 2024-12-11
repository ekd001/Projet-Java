/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import tg.univlome.epl.boutique2.entites.Categorie;
import tg.univlome.epl.boutique2.entites.Produit;
import tg.univlome.epl.boutique2.service.CategorieService;


/**
 *
 * @author EKLOU Dodji
 */
@Path("categorie")
public class CategorieResource {
    private final CategorieService service = CategorieService.getInstance();
    
    
    @Path("ajouter")
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response ajouter(Categorie c){
        this.service.ajouter(c);
        return Response.ok()
                       .entity(c)
                       .build();
    }
    
    @Path("modifier")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @PUT
    public Response modifier(Categorie c){
        Categorie categorie = this.service.modifier(c);
        return Response.ok()
                        .entity(categorie)
                        .build();
    }
    
  
    @Path("supprimer/{id}")
    @DELETE
    public void supprimer(@PathParam("id") int id){
        this.service.supprimer(id);
        
    }
    
    @Path("trouver/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Categorie trouver(@PathParam("id") int id){
        return this.service.trouver(id);
    }
    
    
    @Path("lister")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Categorie> lister(){
        return this.service.lister();
    }
    
    
    @Path("compter")
    @GET
    public int compter(){
        return this.service.compter();
    }
    
}
