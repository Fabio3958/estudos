package DigitalInnovationOne.Collections.Set.SeriesExample;

import java.util.Comparator;

public class CompareToNome implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getNome().compareTo(s2.getNome());
    }
}
