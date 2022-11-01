package CodeWars;

// Given a string, detect whether it is a pangram.
// Return True if it is, False if not. Ignore numbers and punctuation.
public class BreakCamelCase {


    public static String camelCase(String input){

        for (int i = 0; i < input.length(); i++){

            // get the character at the position i
            char c = input.charAt(i);

            // if the character is uppercase the string is broke and is added a space
            if (Character.isUpperCase(c)) {
                input = input.substring(0, i) + " " + input.substring(i);
                i++;
            }

        }

        return input;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
    }

}
