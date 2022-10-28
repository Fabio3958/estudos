package CodeWars;


// Check to see if a string has the same amount of 'x's and 'o's.
public class ExesAndOhs {

    public static boolean getXO(String str){

        int countO = 0;
        int countX = 0;
        str = str.toLowerCase();
        char[] digits = str.toCharArray();

        for (char digit : digits) {

            if (digit == 'x') countX++;
            if (digit == 'o') countO++;

        }

        return countX == countO;
    }

    public static void main(String[] args) {

        System.out.println(getXO("XXXooo"));

    }

}
