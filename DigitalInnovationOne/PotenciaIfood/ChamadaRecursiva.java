package DigitalInnovationOne.PotenciaIfood;

import java.util.Scanner;

// Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.
public class ChamadaRecursiva {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println(somatorio(numero));

    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }

}
