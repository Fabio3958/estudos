package DigitalInnovationOne.Collections.Set.LinguagemFavoritaExanmple;

import java.util.Comparator;

public class CompareToCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {

        int anoCriacao = Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return o1.getNome().compareTo(o2.getNome());
    }
}
