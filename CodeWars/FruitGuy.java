package CodeWars;

import java.util.Arrays;

public class FruitGuy {

    static String[] removeRotten(String[] fruitBasket) {

        for(int i = 0; i < fruitBasket.length; i++)
            fruitBasket[i] = fruitBasket[i].replaceAll("rotten", "").toLowerCase();

        return fruitBasket;
    }

    public static void main(String[] args) {

        String[] basket = {"Apple", "rottenApple", "Banana", "rottenGrape", "Pineapple"};
        System.out.println(Arrays.toString(removeRotten(basket)));

    }
}
