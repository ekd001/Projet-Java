/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.pd1.resources;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

/**
 *
 * @author EKLOU Dodji
 */
@Path("/hello")
public class HelloResource {
    
    @POST
    public String saluer(@FormParam("n") String nom, @FormParam("p") String prenom, 
            @HeaderParam("Accept") String client){
        return "Bonjour "+ nom + " " + prenom + ", je suis EKLOU Dodji. Client : " + client;
    }
}
