package it.sr.grpc.tutorial;

import it.sr.grpc.tutorial.impl.FilmServiceClient;
import it.sr.grpc.tutorial.service.ProductService;

/**
 * Hello world!
 *
 */
public class FilmClient
{
    public static void main( String[] args )
    {
        FilmServiceClient client = new FilmServiceClient("localhost", 50051);

        // Utilizza il client per ottenere i dettagli di un film
        ProductService.FilmResponse film = client.getFilm("123");
        System.out.println("Dettagli del film: " + film.getTitle() + ", " + film.getDirector() + ", " + film.getYear());

        // Utilizza il client per aggiungere un nuovo film
        ProductService.FilmResponse newFilm = client.addFilm("Titolo del nuovo film", "Regista del nuovo film", 2023);
        System.out.println("Nuovo film aggiunto: " + newFilm.getTitle() + ", " + newFilm.getDirector() + ", " + newFilm.getYear());
    }
}
