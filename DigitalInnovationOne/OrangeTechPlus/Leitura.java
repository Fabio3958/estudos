package DigitalInnovationOne.OrangeTechPlus;

import java.util.Scanner;

public class Leitura {


//    Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela,
//    de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia.
//    Como você está aprendendo Java, você disponibilizou-se para ajudá-la com esse desenvolvimento.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

        System.out.println(paginas / paginasLidas + " dias");

    }

}
