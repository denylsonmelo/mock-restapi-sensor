package br.edu.ifpi.capar.sensor.restapi.mock.resource;

import br.edu.ifpi.capar.sensor.restapi.mock.modelo.Dado;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Denylson Melo
 */
@Path("dados")
public class DadosResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String retornarExperimento(){
        Random random = new Random();
        return new Dado(random.nextDouble(), 0, random.nextDouble()).toJson();
    }
}
