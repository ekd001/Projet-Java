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
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import tg.univlome.epl.boutique2.entites.ProduitAchete;
import tg.univlome.epl.boutique2.service.ProduitAcheteService;



/**
 *
 * @author EKLOU Dodji
 */
@Path("produitAchete")
public class ProduitAcheteResource {
    private final ProduitAcheteService service = ProduitAcheteService.getInstance();
    
    
    @Path("ajouter")
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response ajouter(ProduitAchete pa){
        this.service.ajouter(pa);  
        return Response.ok()
                .entity(pa)
                .build();
    }
    
    @Path("modifier")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @PUT
    public Response modifier(ProduitAchete pa){
        this.service.modifier(pa);
        return Response.ok()
                .entity(pa)
                .build();
    }
    
  
    @Path("supprimer/{idAchat}/{idProduit}")
    @DELETE
    public Response supprimer(@PathParam("idAchat") int idAchat, @PathParam("idProduit") int idProduit){   
            this.service.supprimer(idAchat, idProduit);
            return Response.ok()
                    .encoding("le produit achete est supprimer")
                    .build();
    }
    
    @Path("trouver/{idAchat}/{idProduit}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ProduitAchete trouver(@PathParam("idAchat") int idAchat, @PathParam("idProduit") int idProduit){
        return this.service.trouver(idAchat, idProduit);
    }
    
    
    @Path("lister")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<ProduitAchete> lister(){
        return this.service.lister();
    }
    
    
    @Path("compter")
    @GET
    public int compter(){
        return this.service.compter();
    }
}
