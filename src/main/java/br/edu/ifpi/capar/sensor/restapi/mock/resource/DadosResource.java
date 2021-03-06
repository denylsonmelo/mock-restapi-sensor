package br.edu.ifpi.capar.sensor.restapi.mock.resource;

import br.edu.ifpi.capar.sensor.restapi.mock.modelo.Dado;
import static br.edu.ifpi.capar.sensor.restapi.mock.utils.CorsUtils.AC_ALLOW_METHODS;
import static br.edu.ifpi.capar.sensor.restapi.mock.utils.CorsUtils.AC_ALLOW_ORIGIN;
import static br.edu.ifpi.capar.sensor.restapi.mock.utils.CorsUtils.OPTIONS;
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
                .header(AC_ALLOW_ORIGIN, "*")
                .header(AC_ALLOW_METHODS, "GET")
                .allow(OPTIONS).build();
    }
}
