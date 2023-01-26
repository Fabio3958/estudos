package DigitalInnovationOne.OrangeTechPlus;

import java.util.Scanner;

public class SalvandoMusicas {

//    Sua irmã está com o computador muito lento e pediu para você formata-lo.
//    Mas ela gostaria muito de que todas as músicas dela fossem salvas e não
//    deletadas com o resto dos arquivos durante a formatação. Todas as músicas
//    estão no formato .mp3. Crie um programa que cada arquivo com esse formato
//    não seja deletado.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String arquivo = scanner.next();
        char[] arquivoChar = arquivo.toCharArray();

        for (int i = 0; i < arquivoChar.length; i++){

            if (!Character.isLetter(arquivoChar[i]) && !Character.isDigit(arquivoChar[i])){
                arquivo = arquivo.substring(i);
            }

        }
         if (arquivo.equals(".mp3"))
             System.out.println("Salvar");
         else
             System.out.println("Deletar");
    }

}
