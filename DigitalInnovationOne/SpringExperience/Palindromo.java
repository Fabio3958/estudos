package DigitalInnovationOne.SpringExperience;

public class Palindromo {

    public static boolean isPalindrome(String str){

        char[] strChar = str.toCharArray();
        String reverse = "";

        for (int i = strChar.length-1; i >= 0; i--) reverse += strChar[i];

        return reverse.equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("RADAR"));
    }

}
