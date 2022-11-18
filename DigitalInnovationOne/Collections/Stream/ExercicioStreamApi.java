package DigitalInnovationOne.Collections.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExercicioStreamApi {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("4", "9", "9", "0", "2", "6", "5", "5", "8", "3");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);
        System.out.println();

        System.out.println("Pegue os cinco primeiros números e coloque dentro de um Set");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros");
        numerosAleatorios.stream().map(Integer::parseInt).toList().forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que dois e coloque em uma lista");
        List<Integer> parMaiorQueDois = numerosAleatorios.stream().map(Integer::parseInt).filter(integer -> integer % 2 == 0 && integer > 2).toList();
        System.out.println(parMaiorQueDois);
        System.out.println();

        System.out.println("Mostre a média dos números");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
        System.out.println();

        System.out.println("Remova os valores ímpares");
        List<Integer> numerosAleatoriosList = new java.util.ArrayList<>(numerosAleatorios.stream().map(Integer::parseInt).toList());
        numerosAleatoriosList.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosList);
        System.out.println();

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");
        System.out.println(numerosAleatorios.stream().skip(3).toList());
        System.out.println();

        System.out.println("Mostre o menor número da lista");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);
        System.out.println();

        System.out.println("Mostre o maior número da lista");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
        System.out.println();

        System.out.println("Pegue apenas os números impares e some-os");
        List<Integer> impares = numerosAleatorios.stream().map(Integer::parseInt).filter(integer -> integer % 2 != 0).toList();
        System.out.println(impares.stream().mapToInt(Integer::intValue).sum());
        System.out.println();

        System.out.println("Mostre a lista na ordem numérica");
        System.out.println(numerosAleatorios.stream().sorted().toList());
        System.out.println();

        System.out.println("Agrupe os valores ímpares múltiplos de três e cinco");
        List<Integer> imparesMultiplos = numerosAleatorios.stream().map(Integer::parseInt).toList();
        System.out.println(imparesMultiplos.stream().collect(Collectors.groupingBy(integer -> integer % 2 != 0 && integer % 3 == 0 || integer % 5 == 0)));
    }

}
