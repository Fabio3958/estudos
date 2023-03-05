package CodeWars;

// Make your strings more nerdy: Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l' with 1 e.g. "Fundamentals" --> "Fund4m3nt41s"

import java.util.Arrays;

public class Ch4113ng3 {

    public static String nerdify(String txt){

        txt = txt.replaceAll("(?i)A", "4");
        txt = txt.replaceAll("(?i)E", "3");
        txt = txt.replaceAll("L", "1");

        return txt;

    }

    public static void main(String[] args) {
        System.out.println(nerdify("Los Angeles"));
    }

}
