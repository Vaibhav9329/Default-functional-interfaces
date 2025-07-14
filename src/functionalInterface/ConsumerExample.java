package functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
//        consumer method :- represents an operation that accepts a single input argument and returns no result
        Consumer<String> printer =
                message -> System.out.println(message);
        printer.accept("hello world!");
    }
}
