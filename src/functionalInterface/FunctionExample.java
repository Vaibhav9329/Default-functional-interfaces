package functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

//      Function :- represents a function that accepts one argument and produces a result.
//      This is a functional interface whose functional method is apply(Object).

        Function<Integer, String> intTostring
                = integer -> "Number: "+(integer+integer);

        String result
                = intTostring.apply(42);
        System.out.println(result);
    }
}
