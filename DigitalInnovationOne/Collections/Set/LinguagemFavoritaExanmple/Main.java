package DigitalInnovationOne.Collections.Set.LinguagemFavoritaExanmple;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagemFavoritaSet = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1996, "IntelliJ"));
            add(new LinguagemFavorita("jython", 1989, "PyCharm"));
            add(new LinguagemFavorita("jo", 2009, "GoLand"));
        }};

        System.out.println("Ordem de inserção");
        for (LinguagemFavorita linguagem : linguagemFavoritaSet)
            System.out.println(linguagem);
        System.out.println();

        System.out.println("Ordem natural - nome");
        Set<LinguagemFavorita> linguagemFavoritaSet1 = new TreeSet<>(new CompareToNome());
        linguagemFavoritaSet1.addAll(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet1)
            System.out.println(linguagem);
        System.out.println();

        System.out.println("Ordem natural - IDE");
        Set<LinguagemFavorita> linguagemFavoritaSet2 = new TreeSet<>(new CompareToIde());
        linguagemFavoritaSet2.addAll(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet2)
            System.out.println(linguagem);
        System.out.println();

        System.out.println("Ordem natural - Ano de criação e nome");
        Set<LinguagemFavorita> linguagemFavoritaSet3 = new TreeSet<>(new CompareToCriacaoNome());
        linguagemFavoritaSet3.addAll(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet3)
            System.out.println(linguagem);
        System.out.println();

        System.out.println("Ordem natural - Nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagemFavoritaSet4 = new TreeSet<>(new CompareToNomeCriacaoIde());
        linguagemFavoritaSet4.addAll(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet4)
            System.out.println(linguagem);
        System.out.println();
    }

}
