package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme myFavoriteMovie = new Filme("Gladiador 2", 1970);
        myFavoriteMovie.rate(9);

        var outroFilme = new Filme("The unberable weight of massive talent", 2022);
        outroFilme.rate(10);

        Serie serie = new Serie("The Last Of Us", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(myFavoriteMovie);
        lista.add(outroFilme);
        lista.add(serie);

//        lista.forEach(item -> System.out.println(item)); - Expressão lambda


        for (Titulo item : lista) {
            System.out.println(item.getName());

            if(item instanceof Filme filme) System.out.println("Classificação: " + filme.getClassificacao());
        }

        List<String> artistas = new LinkedList<>();
        artistas.add("Adam Sandler");
        artistas.add("Paulo");
        artistas.add("Jacqueline");
        System.out.println(artistas);

        // Ordenação de listas
        Collections.sort(artistas);
        System.out.println("Ordenação: " + artistas);

        Collections.sort(lista);
        System.out.println("Lista de filme e serie ordenados alfabeticamente: " + lista);
        lista.sort(Comparator.comparing(Titulo::getReleaseDate));
        System.out.println("Lista de filme e serie ordenados por ano: " + lista);
    }
}
