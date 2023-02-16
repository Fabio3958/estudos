package DigitalInnovationOne.OrangeTechPlus;

//  No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas que estavam na posição
//  impar da fila para entrarem no camarote. Ele fez isso em diversos shows e as pessoas foram a loucura para
//  competirem por essas posições. Você resolveu criar um programa para saber, de acordo com o número de pessoas
//  na fila, quantas entrariam no camarote.

import java.util.Scanner;

public class CamaroteDoBlueColdIceCubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoDaFila = scanner.nextInt();
        int pessoasNoCamarote = 0;

        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        for (int i = 0; i <= tamanhoDaFila; i++){
            if (i % 2 != 0){
                pessoasNoCamarote++;
            }
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }

}
