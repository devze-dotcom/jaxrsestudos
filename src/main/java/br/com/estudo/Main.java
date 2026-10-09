package br.com.estudo;

import java.io.IOException;
import java.net.URI;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

    public static final String BASE_URI = "http://localhost:8080/api/";

    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("br.com.estudo");

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println(String.format("Aplicação Jersey iniciada com sucesso em: %s", BASE_URI));
        System.out.println("Endpoint de contatos disponível em: " + BASE_URI + "contato");
        System.out.println("Pressione ENTER para encerrar o servidor...");

        System.in.read();
        server.shutdownNow();
        System.out.println("Servidor encerrado.");
    }
}
