package CodeWars;

public class NoSpace {

    static String removeSpace(String x){

        x = x.replaceAll(" ", "");

        return  x;
    }

    public static void main(String[] args) {

        String string = "Teste Teste teste Teste";

        System.out.println(removeSpace(string));

    }

}
