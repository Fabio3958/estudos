package CodeWars;

import java.util.Arrays;

public class DoubledValue {

    // Given an array of integers, return a new array with each value doubled.

    static int[] map(int[] arr){

        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{2, 4, 5})));
    }
}
