package CodeWars;

public class SpaceOrShift {

    //Some new cashiers started to work at your restaurant.
    //They are good at taking orders, but they don't know how to capitalize words, or use a space bar!
    //All the orders they create look something like this:
    //"milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"
    //The kitchen staff are threatening to quit, because of how difficult it is to read the orders.
    //Their preference is to get the orders as a nice clean string with spaces and capitals like so:
    //"Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke"
    //The kitchen staff expect the items to be in the same order as they appear in the menu.
    //The menu items are fairly simple, there is no overlap in the names of the items:

    public static String getOrder(String input){

        String[] items = {"burger", "fries", "chicken", "pizza", "sandwich", "onionrings", "milkshake", "coke"};
        if (input.contains(items[1]))
            return items[1];

        return "";
    }

    public static void main(String[] args) {
        System.out.println(getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
    }
}
