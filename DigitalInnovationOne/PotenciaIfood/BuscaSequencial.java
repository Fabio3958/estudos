package DigitalInnovationOne.PotenciaIfood;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        for (int i = 0; i < elementos.length; i++){

            if (numero == elementos[i]){
                System.out.println("Achei " + elementos[i] + " na posição " + i);
                break;
            }
            // condição para não printar mais de uma vez
            else if (i == elementos.length-1){
                System.out.println("Número " + numero + " não encontrado");
            }

        }

    }

}
