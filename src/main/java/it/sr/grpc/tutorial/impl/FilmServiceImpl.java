package it.sr.grpc.tutorial.impl;

import io.grpc.stub.StreamObserver;
import it.sr.grpc.tutorial.service.FilmServiceGrpc;
import it.sr.grpc.tutorial.service.ProductService;

public class FilmServiceImpl extends FilmServiceGrpc.FilmServiceImplBase {
    @Override
    public void getFilm(ProductService.GetFilmRequest request, StreamObserver<ProductService.FilmResponse> responseObserver) {
        // Logica per ottenere i dettagli di un film
        // ...
        System.out.println("Get film con id -> "+request.getFilmId());

        ProductService.FilmResponse response = ProductService.FilmResponse.newBuilder()
                .setTitle("Titolo del film "+request.getFilmId())
                .setDirector("Regista del film "+request.getFilmId())
                .setYear(2022)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addFilm(ProductService.AddFilmRequest request, StreamObserver<ProductService.FilmResponse> responseObserver) {
        // Logica per aggiungere un nuovo film all'anagrafica
        // ...

        System.out.println("Add film "+request.getTitle()+" "+request.getDirector()+" "+request.getYear());

        ProductService.FilmResponse response = ProductService.FilmResponse.newBuilder()
                .setTitle(request.getTitle())
                .setDirector(request.getDirector())
                .setYear(request.getYear())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
