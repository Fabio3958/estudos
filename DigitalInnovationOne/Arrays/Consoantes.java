package DigitalInnovationOne.Arrays;

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {

            System.out.println("Input a letter: ");
            String letter = scanner.next();

            if(!(letter.equalsIgnoreCase("a") |
                    letter.equalsIgnoreCase("e") |
                    letter.equalsIgnoreCase("i") |
                    letter.equalsIgnoreCase("o") |
                    letter.equalsIgnoreCase("u"))){

                consoantes[count] = letter;
                quantidadeConsoantes++;
            }
            count++;

        }while(count < consoantes.length);

        for ( String consoante : consoantes) {

            if (consoante != null){
                System.out.print(consoante + " ");
            }

        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }

}
