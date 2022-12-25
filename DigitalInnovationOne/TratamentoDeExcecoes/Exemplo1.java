package DigitalInnovationOne.TratamentoDeExcecoes;

import javax.swing.*;

public class Exemplo1 {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador");
        String b = JOptionPane.showInputDialog("Denominador");

        try {

            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida" + e.getMessage());
            //throw new RuntimeException(e);
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Impossível dividir por 0" + e.getMessage());

        }
        finally {

            System.out.println("Chegou no finally");

        }

        System.out.println("Chegou até aqui");
    }

    public static int dividir(int a, int b) { return a / b; }


}
