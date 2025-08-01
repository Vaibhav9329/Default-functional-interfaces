import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> num
                = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        Predicate to filter even number
        Predicate<Integer> isEven =
                no -> no%2==0;

//        Function to square a number
        Function<Integer, Integer> squareFunction
                = no -> no*no;

//        Consumer to print each squared number
        Consumer<Integer> printSqNumber
                 = System.out::println;

//        Supplier to count total squared number
        Supplier<Integer> countSupplier
                =() -> 0;

//        Apply stream operations
        int totalSquaredNumbers = num.stream()
                .filter(isEven)  // filter even number
                .map(squareFunction)  //Map each number to its square
                .peek(printSqNumber)  // print each squared number
                .reduce(countSupplier.get(), (count, nm) -> count+1);  //count total squared number

        System.out.println(
                "Total squared numbers: "+ totalSquaredNumbers
        );

    }
}
