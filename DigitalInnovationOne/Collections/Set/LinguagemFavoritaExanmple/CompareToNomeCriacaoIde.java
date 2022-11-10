package DigitalInnovationOne.Collections.Set.LinguagemFavoritaExanmple;

import java.util.Comparator;

public class CompareToNomeCriacaoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {

        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return  nome;

        int anoCriacao = Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return o1.getIde().compareTo(o2.getIde());

    }
}
