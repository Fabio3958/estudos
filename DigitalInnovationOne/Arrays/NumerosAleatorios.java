package DigitalInnovationOne.Arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++){

            int number = random.nextInt(100);
            randomNumbers[i] = number;

        }

        System.out.print("Numeros aleatórios: ");
        for (int number: randomNumbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nSucessores: ");
        for (int number: randomNumbers) {
            System.out.print((number + 1) + " ");
        }
    }
}
