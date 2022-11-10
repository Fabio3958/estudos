package DigitalInnovationOne.Collections.Set.SeriesExample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 40));
            add(new Serie("full house", "comédia", 20));
        }};

        for (Serie serie: series) {

            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());

        }
        System.out.println();

        System.out.println("Ordem natural - tempo de episódio");
        Set<Serie> series1 = new TreeSet<>(series);
        for (Serie serie : series1){
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("Ordem natural - nome/ genero/ tempo de episódio");
        Set<Serie> series2 = new TreeSet<>(new CompareToNomeGeneroTempoEpisodio());
        series2.addAll(series);
        for (Serie serie : series2){
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("Ordem natural - gênero");
        Set<Serie> series3 = new TreeSet<>(new CompareToGenero());
        series3.addAll(series);
        for (Serie serie : series3){
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("Ordem natural - nome");
        Set<Serie> series4 = new TreeSet<>(new CompareToNome());
        series4.addAll(series);
        for (Serie serie : series4){
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }

}
