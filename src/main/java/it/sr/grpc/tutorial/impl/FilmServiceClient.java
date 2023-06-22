package it.sr.grpc.tutorial.impl;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import it.sr.grpc.tutorial.service.FilmServiceGrpc;
import it.sr.grpc.tutorial.service.ProductService;

public class FilmServiceClient {
    private final FilmServiceGrpc.FilmServiceBlockingStub blockingStub;

    public FilmServiceClient(String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = FilmServiceGrpc.newBlockingStub(channel);
    }

    public ProductService.FilmResponse getFilm(String filmId) {
        ProductService.GetFilmRequest request = ProductService.GetFilmRequest.newBuilder()
                .setFilmId(filmId)
                .build();
        return blockingStub.getFilm(request);
    }

    public ProductService.FilmResponse addFilm(String title, String director, int year) {
        ProductService.AddFilmRequest request = ProductService.AddFilmRequest.newBuilder()
                .setTitle(title)
                .setDirector(director)
                .setYear(year)
                .build();
        return blockingStub.addFilm(request);
    }
}
