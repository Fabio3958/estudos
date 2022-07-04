package DigitalInnovationOne.Arrays;

public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {0, -5, 15, 50, 8, 4};

        for (int i = (vetor.length - 1); i >= 0; i--){

            System.out.print(vetor[i] + " ");

        }
    }

}
