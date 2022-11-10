package DigitalInnovationOne.Collections.Set.LinguagemFavoritaExanmple;

import java.util.Comparator;

public class CompareToNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
