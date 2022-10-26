package CodeWars;


import java.util.Arrays;

// Return an array, where the first element is the count of positives
// numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
public class CountPositivesSumNegatives {

    public static int[] calculate(int[] input){

        int sum = 0;
        int count = 0;

        for (int i : input) {
                if (i >= 0) {
                    count++;
                } else {
                    sum += i;
                }
            }
        if (input == null || input.length == 0)
            return new int[] {};
        return new int[] {sum, count};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate(new int[]{1, 3, 5, -2, -6, 1, -2})));
    }

}
