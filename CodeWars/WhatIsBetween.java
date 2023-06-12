package CodeWars;

import java.util.Arrays;

import static java.util.stream.IntStream.rangeClosed;

/*Complete the function that takes two integers (a, b, where a < b)
  and return an array of all integers between the input parameters, including them.*/
public class WhatIsBetween {

    public static int[] between(int a, int b){
        return rangeClosed(a,b).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(10, 21)));
    }

}
