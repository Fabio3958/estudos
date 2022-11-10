package DigitalInnovationOne.Collections.Set;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 6.2, 0d, 3.2, 7d, 9d)); // não repete elemento
        System.out.println(notas + "\n");


        System.out.println("Confira se a nota 5 está no conjunto");
        System.out.println(notas.contains(5d) + "\n");

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));
        System.out.println(Collections.min(notas) + "\n");

        System.out.println("Exiba a soma de todos os elementos");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma + "\n");

        System.out.println("Exiba a média das notas");
        System.out.println(soma / notas.size() + "\n");

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas + "\n");

        System.out.println("exiba as notas na ordem que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(2d);
        notas2.add(6.4);
        notas2.add(8.8);
        notas2.add(9.5);
        notas2.add(1d);
        System.out.println(notas2 + "\n");

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2); //Treeset retorna a ordem natural
        System.out.println(notas3 + "\n");

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println(notas.isEmpty());
        System.out.println(notas + "\n");
    }

}
