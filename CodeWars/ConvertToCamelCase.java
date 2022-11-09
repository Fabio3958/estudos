package CodeWars;

public class ConvertToCamelCase {

    public static String toCamelCase (String str){

        str = str.substring(0, 1).toUpperCase() + str.substring(1);

        while(str.contains("_")){
            str = str.replaceFirst("_[a-z]", String.valueOf(Character.toUpperCase(str.charAt(str.indexOf('_') + 1))));
        }

        return str;
    }

    public static void main(String[] args) {

        System.out.println(toCamelCase("ola_mundo_teste"));

    }

}
