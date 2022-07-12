package CodeWars;

public class SumArrays {

    public static double sum(double[] numbers) {

        double sum = 0;

        for (double number : numbers) {

            sum += number;

        }


        if (sum == 0) {
            return 0.0;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new double[] {1, 2, 3}));
    }


}
