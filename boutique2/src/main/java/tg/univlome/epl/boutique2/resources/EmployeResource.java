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
import tg.univlome.epl.boutique2.entites.Employe;
import tg.univlome.epl.boutique2.service.EmployeService;


/**
 *
 * @author EKLOU Dodji
 */
@Path("employe")
public class EmployeResource {
    
    private final EmployeService service = EmployeService.getInstance();
    
    @Path("ajouter")
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response ajouter(Employe epy){
        this.service.ajouter(epy);
        return Response.ok()
                 .entity(epy)
                 .build();
    }
    
    @Path("modifier")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @PUT
    public Response modifier(Employe epy){
       this.service.modifier(epy);
        return Response.ok()
                 .entity(epy)
                 .build();
    }
    
  
    @Path("supprimer/{id}")
    @DELETE
    public Response supprimer(@PathParam("id") int id){
        this.service.supprimer(id);
         return Response.ok()
                 .encoding("employer supprimer")
                 .build();
    }
    
    @Path("trouver/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Employe trouver(@PathParam("id") int id){
        return this.service.trouver((long)(id));
    }
    
    
    @Path("lister")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Employe> lister(){
        return this.service.lister();
    }
    
    
    @Path("compter")
    @GET
    public int compter(){
        return this.service.compter();
    }

}
