package CodeWars;

public class ReverseString {

    static String reverseStr(String str){

        StringBuilder nStr = new StringBuilder();
        char ch;

        for (int i = 0; i < str.length(); i++){

            ch = str.charAt(i);
            nStr.insert(0, ch);

        }
        return nStr.toString();

    }

    public static void main(String[] args) {

        System.out.println(reverseStr("Geek"));

    }

}
