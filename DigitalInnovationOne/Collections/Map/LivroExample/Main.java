package DigitalInnovationOne.Collections.Map.LivroExample;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charlles", new Livro("O Poder do Hábito", 408));
            put("Harari,Yuval Noah", new Livro("21 Lições para o Século XXI", 432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();

        System.out.println();

        System.out.println("Ordem de inserção: ");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charlles", new Livro("O Poder do Hábito", 408));
            put("Harari,Yuval Noah", new Livro("21 Lições para o Século XXI", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();

        System.out.println("Ordem alfabética autores: ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();

        System.out.println("Ordem alfabética livros: ");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new CompareToNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();

        System.out.println("Ordem número de páginas");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new CompareToPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        System.out.println();

    }

}
