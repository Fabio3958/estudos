package CodeWars;

import java.util.Arrays;

public class RemoveVowels {

    public static String shortcut(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(shortcut("taloco"));
    }

}
