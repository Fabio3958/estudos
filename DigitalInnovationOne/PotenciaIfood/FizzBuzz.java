package DigitalInnovationOne.PotenciaIfood;

import java.util.Scanner;

// Neste desafio, você terá que criar uma função que faça um
// número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (!(number % 3 == 0) && !(number % 5 == 0))
            System.out.println(number);
        else
        if ((number % 3 == 0) && (number % 5 == 0))
            System.out.println("FizzBuzz");
        else
        if (number % 3 == 0)
            System.out.println("Fizz");
        else
        if (number % 5 == 0)
            System.out.println("Buzz");


    }

}
