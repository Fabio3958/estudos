package DigitalInnovationOne.Collections.Set.LinguagemFavoritaExanmple;

import java.util.Comparator;

public class CompareToIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareTo(o2.getIde());
    }
}
