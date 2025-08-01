package functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

//    supplier method :- represents a supplier of results, which does not accept any input but produces a result.
//              Gets  a result.
//              Returns:  a result
//    This is a functional interface whose functional method is get().

        Supplier<Double> randomNumbersupplier =
                () -> Math.random();
        double randomNumber
                = randomNumbersupplier.get();
        System.out.println("random number " + randomNumber);
    }
}
