/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.co.edu.puj;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author javila
 */
@Path("/")
public class Suma {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Suma
     */
    public Suma() {
    }

    @GET
    @Path("/sumar/{uno}/{dos}")
    public int sumar(@PathParam("uno") int uno, @PathParam("dos") int dos) {
        return uno + dos;
    }
    /**
     * Retrieves representation of an instance of suma.co.edu.puj.Suma
     * @return an instance of java.lang.String
     */
    /*@GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    */
    
    /**
     * PUT method for updating or creating an instance of Suma
     * @param content representation for the resource
     */
    /*@PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }*/
}
