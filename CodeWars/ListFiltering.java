package CodeWars;

import java.util.List;

//create a function that takes a list of non-negative
// integers and strings and returns a new list with the strings filtered out.
public class ListFiltering {

    public static List<Object> filter(final List<Object> list){

        return list.stream().filter(element -> element instanceof Integer).toList();

    }

    public static void main(String[] args) {
        System.out.println(filter(List.of(1, 2, "a", "b")));
    }

}
