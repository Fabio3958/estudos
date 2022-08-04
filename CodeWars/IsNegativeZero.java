package CodeWars;

public class IsNegativeZero {

    // Write a function that returns true if the input number is -0 and false otherwise

    static boolean isNegative(float n){

        return Float.toString(n).contains("-0");
    }

    public static void main(String[] args) {
        System.out.println(isNegative(-0f));
    }

}
