package CodeWars;

import java.util.Arrays;
import java.util.List;

    /*Given an array of ones and zeroes, convert the equivalent binary value to an integer.
    Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.*/
public class Binary {

    public static int convert (List<Integer> binary){

        int number;
        int numberToBinary;
        StringBuilder str = new StringBuilder();


        for (Integer integer : binary) {

            number = integer;
            str.append(number);
        }

        numberToBinary = Integer.parseInt(String.valueOf(str));

        return Integer.parseInt(String.valueOf(numberToBinary), 2);


    }

    public static void main(String[] args) {
        System.out.println(convert(Arrays.asList(1,1,1,1)));
    }

}
