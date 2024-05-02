package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme myFavoriteMovie = new Filme("Gladiador 2", 1970);

        myFavoriteMovie.setReleaseDate(1970);
        myFavoriteMovie.setRunningTime(180);
        myFavoriteMovie.setIncludedInPlan(false);
        System.out.println("Duração do Filme: " + myFavoriteMovie.getRunningTime());
        myFavoriteMovie.displayTechnicalSheet();
        myFavoriteMovie.rate(8);
        myFavoriteMovie.rate(3);
        myFavoriteMovie.rate(2);
        System.out.println("Rating average: " + myFavoriteMovie.getRatingAverage());

        var outroFilme = new Filme("The unberable weight of massive talent", 2022);

        Serie serie = new Serie("The Last Of Us", 2023);
        serie.displayTechnicalSheet();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar Lost: " + serie.getRunningTime() + " min");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(myFavoriteMovie);
        listaDeFilmes.add(outroFilme);
        System.out.println("Meu filme favorito é: " + myFavoriteMovie.getName());
        System.out.println(listaDeFilmes);
        System.out.println(myFavoriteMovie);
    }
}
