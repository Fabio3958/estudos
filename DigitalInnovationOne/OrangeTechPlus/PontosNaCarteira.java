package DigitalInnovationOne.OrangeTechPlus;


//  A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um sistema de câmeras que
//  iria verificar se os carros estão acima de 80km/h. Porém, eles queriam também anotar a placa dos
//  carros no banco de dados para que, a partir de 3 multas, os motoristas perdessem pontos
//  diretamente na carteira de habilitação. Para isso, contrataram você para realizar esse
//  programa, logo que você fez um trabalho tão bom para a cidade A.Lembrando que toda vez
//  que um carro é pego pela câmera e está acima da velocidade permitida automaticamente já é
//  contabilizado uma multa para ele.

import java.util.Scanner;

public class PontosNaCarteira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int velocidade = scanner.nextInt();
        int multas = scanner.nextInt();

        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        int limite = 80;
        if (velocidade > limite)
            multas++;

        // TODO: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
        int limiteMultas = 3;
        if (multas >= limiteMultas)
            System.out.println(multas + " multas. Levou pontos na carteira");
        else
            System.out.println(multas + " multas. Não levou pontos na carteira");

    }

}
