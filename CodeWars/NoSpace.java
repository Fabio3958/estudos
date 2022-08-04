package CodeWars;

public class NoSpace {

    static String removeSpace(String x){

        x = x.replaceAll(" ", "");

        return  x;
    }

    public static void main(String[] args) {

        String string = "LEO É VIADINHO PONTO COM";

        System.out.println(removeSpace(string));

    }

}
