package br.com.estudo;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("contato")
@Produces(MediaType.APPLICATION_JSON)
@Consumes (MediaType.APPLICATION_JSON)
public class ContatoResource {
    
    private static Agenda agenda = new Agenda();

    @GET
    public Response listarTodos(){
        List<Contato> lista = agenda.listarContato();
        return Response.ok(lista).build();
    }

    @POST 
    public Response adicionarContato(Contato c){
        agenda.adicionarContato(c);
        return Response.status(Response.Status.CREATED).entity(c).build();
    }

    @GET 
    @Path("nome")
    public Response buscarPorNome(@PathParam("nome") String nome){
        List<Contato> lista = agenda.buscarContatoPorNome(nome);
        if(lista.isEmpty()){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(lista).build();
    }

    


}
