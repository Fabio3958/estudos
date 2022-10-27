package CodeWars;


// In this kata, you are asked to square every digit of a number and concatenate them.
public class SquareEveryDigit {

    public static int squareDigits(int n){

        String str = Integer.toString(n);
        char[] digits = str.toCharArray();
        int number;
        String result = "";

        for (char digit : digits) {

            number = Character.getNumericValue(digit);
            result = result.concat(Integer.toString(number * number));

        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {

        System.out.println(squareDigits(9119));

    }
}
