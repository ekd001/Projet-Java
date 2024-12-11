/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import tg.univlome.epl.boutique2.entites.Produit;
import tg.univlome.epl.boutique2.service.ProduitService;

/**
 *
 * @author EKLOU Dodji
 */
@Path("produit")
public class ProduitResource {
    
    private final ProduitService service = ProduitService.getInstance();
    
    
    @Path("ajouter")
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response ajouter(Produit p){
        this.service.ajouter(p);
        return Response.ok()
                    .entity(p)
                    .build();
    }
    
    @Path("modifier")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @PUT
    public Response modifier(Produit p){
       this.service.modifier(p);
       return Response.ok()
                    .entity(p)
                    .build();
    }
    
  
    @Path("supprimer/{id}")
    @DELETE
    public Response supprimer(@PathParam("id") int id){
        this.service.supprimer(id);
        return Response.ok()
                    .encoding("Le produit est supprimé")
                    .build();
        
    }
    
    @Path("trouver/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response trouver(@PathParam("id") int id){
        Produit produit = this.service.trouver((long)(id));
        return Response.ok()
                .entity(produit)
                .build();
    }
    
    
    @Path("lister")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response lister(){
        List<Produit> produits =  this.service.lister();
        return Response.ok()
                .entity(new GenericEntity<List<Produit>>(produits) {})
                .build();
        
    }
    
    
    @Path("compter")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response compter(){
        int c = this.service.compter();
        return Response.ok(c)
                .build();
    }

    @Path("perimes")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response perimes(){
        List<Produit> produits = this.service.perimes();
        return Response.ok()
                .entity(new GenericEntity<List<Produit>>(produits) {})
                .build();
    }
}
