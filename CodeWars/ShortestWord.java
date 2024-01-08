package CodeWars;

import java.util.Objects;

public class ShortestWord {

    //Simple, given a string of words, return the length of the shortest word(s).
    //String will never be empty
    //you do not need to account for different data types.

    public static int findShort(String s) {
        if (Objects.equals(s, "")){
            return 0;
        }else {
            String[] arr = s.split(" ");
            int shortest = arr[0].length();
            for (String string : arr) {
                if (string.length() < shortest) {
                    shortest = string.length();
                }
            }
            return shortest;
        }
    }

    public static void main(String[] args) {
        System.out.println(findShort("Testando um dois três"));
    }

}
