package DigitalInnovationOne.Collections.Set;

import java.util.*;

public class ExercicioPropostoArcoIris {

    public static void main(String[] args) {

        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta")) {
        };

        System.out.println("Exiba as cores uma abaixo da outra");
        for (String cor : arcoIris){
            System.out.println(cor);
        }
        System.out.println();

        System.out.println("Exiba a quantidade de cores do arco-iris");
        System.out.println(arcoIris.size());
        System.out.println();

        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris2);
        System.out.println();

        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        Set<String> arcoIris3 = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        List<String> arcoIrisList = new ArrayList<>(arcoIris3);
        Collections.reverse(arcoIrisList);
        System.out.println(arcoIrisList);
        System.out.println();

        System.out.println("Exiba todas as cores que começam com a letra 'v'");
        for (String cor : arcoIris){
            if (cor.startsWith("v"))
                System.out.println(cor);;
        }
        System.out.println();

        System.out.println("Exiba todas as cores que não começam com a letra 'v'");
        for (String cor : arcoIris){
            if (!cor.startsWith("v"))
                System.out.println(cor);
        }
        System.out.println();

        System.out.println("Limpe o conjunto");
        arcoIris.clear();
        System.out.println("Limpo");
        System.out.println();

        System.out.println("Confira se o conjunto está vazio");
        System.out.println(arcoIris.isEmpty());

    }


}
