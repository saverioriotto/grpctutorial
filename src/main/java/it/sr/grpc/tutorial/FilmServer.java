package it.sr.grpc.tutorial;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import it.sr.grpc.tutorial.impl.FilmServiceImpl;

import java.io.IOException;

public class FilmServer {

    private static final int PORT = 50051;

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(PORT)
                .addService(new FilmServiceImpl())
                .build();

        server.start();
        System.out.println("Server started on port " + PORT);

        server.awaitTermination();
    }
}
