package br.com.developeracademy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/par-impar")
public class ParImparResource {

    @POST
    @Path("{numero}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response definirNumeroParOuImpar(Integer numero) {
        String mensagem = "";
        if (numero % 2 == 0)
            mensagem = "O número informado é par!";
        else
            mensagem = "O número informado é impar";

        return Response.status(500).entity(mensagem).build();
    }
}
