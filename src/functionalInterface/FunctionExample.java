package functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

//      Function :- represents a function that accepts one argument and produces a result.
        Function<Integer, String> intTostring
                = integer -> "Number: "+integer;

        String result
                = intTostring.apply(42);
        System.out.println(result);
    }
}
