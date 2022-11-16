package DigitalInnovationOne.Collections.Map.ExerciciosPropostos;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);
        System.out.println();

        System.out.println("Substitua a população do estado do RN por 3534165");
        estados.put("RN", 3534165);
        System.out.println(estados);
        System.out.println();

        System.out.println("Confira se o estado PB está no dicionário, caso não, adicione: PB - 4039277");
        if (!estados.containsKey("PB"))
            estados.put("PB", 4039277);
        else
            System.out.println("PB já está no dicionário");
        System.out.println(estados);
        System.out.println();

        System.out.println("Exiba a população de PE");
        System.out.println(estados.get("PE"));
        System.out.println();

        System.out.println("Exiba todos os estados e suas populações na ordem em que foi informada");
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados1);
        System.out.println();

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> estados2 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados2);
        System.out.println();

        System.out.println("Exiba o estado com a menor população e sua quantidade");
        Integer menorPopulacao = Collections.min(estados.values());
        System.out.println(menorPopulacao);

        System.out.println("Exiba o estado com a maior população e sua quantidade");
        Integer maiorPopulacao = Collections.max(estados.values());
        System.out.println(maiorPopulacao);
        System.out.println();

        System.out.println("Exiba a soma da população desses estados");
        Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println();

        System.out.println("Exiba a média da população desses estados");
        System.out.println(soma / estados.size());
        System.out.println();

        System.out.println("Remova os estados com a população menor que 4kk");
        Iterator<Integer> iterator1 = estados.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estados);
        System.out.println();

        System.out.println("Apague o dicionário");
        estados.clear();
        System.out.println("feito");
        System.out.println();

        System.out.println("Confira se o dicionário está vazio");
        System.out.println(estados.isEmpty());
    }

}
