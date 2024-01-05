package CodeWars;

public class CountDivisors {

    static long numberOfDivisors(int n) {

        int i = 1;
        int count = 0;

        while (i <= n){
            if (n % i == 0)
                count++;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(numberOfDivisors(5000));

    }

}
