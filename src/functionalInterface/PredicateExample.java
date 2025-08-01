package functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
//    predicate function :- represents a predicate (boolean-valued function) of One argument.
//      This is a functional interface whose functional method is test(Object).

    public static void main(String[] args) {
        Predicate<String> isNullOrEmpty =
                str -> str == null || str.isEmpty();
        System.out.println("is null or empty: " + isNullOrEmpty.test(null));

        System.out.println("is null or empty: " + isNullOrEmpty.test(""));

        System.out.println("is null or empty: " + isNullOrEmpty.test("hello"));
    }
}
