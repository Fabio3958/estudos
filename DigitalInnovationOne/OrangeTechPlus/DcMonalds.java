package DigitalInnovationOne.OrangeTechPlus;

import java.util.Scanner;

//  Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era gostoso.
//  Porém, ficou horrorizado como algumas coisas no aplicativo do cardápio estavam erradas. Então, você se ofereceu
//  para ajudá-los com seus conhecimentos de programação. Ao conversar com o gerente, ele te explicou que a vontade da
//  lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, como no exemplo abaixo:
//
//  Pao
//  Presunto
//  Carne
//  Pao
//
//  Ajude o restaurante a programar isso.

public class DcMonalds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ingredientes = scanner.next();
        String listaIngredientes[] = new String[3];

        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        listaIngredientes = ingredientes.split(";");

        for (String item : listaIngredientes){
            System.out.println(item);
        }
    }

}
