package br.edu.ifpi.capar.sensor.restapi.mock.resource;

import br.edu.ifpi.capar.sensor.restapi.mock.modelo.Dado;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Denylson Melo
 */
@Path("dados")
public class DadosResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retornarExperimento() {
        Random random = new Random();
        return Response.ok()
                .entity(new Dado(random.nextDouble(), 0, random.nextDouble()).toJson())
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET")
                .allow("OPTIONS").build();
    }
}
