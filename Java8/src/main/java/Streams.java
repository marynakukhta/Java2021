import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 0, 0, - 4, -1, 5, 6, 7, 8};
        Supplier<IntStream> intStream = () -> IntStream.of(intArray);
        System.out.println("Min element:" + intStream.get().min().orElse(0) + "\n" +
                "Average: " + intStream.get().average().orElse(0) + "\n" +
                "Equal 0: " + intStream.get().filter(x -> x==0).count() + "\n" +
                "More then 0: " + intStream.get().filter(x -> x>0).count() + "\n" +
                "Multiply on 5 ");
        intStream.get().map(x -> x*5).forEach(System.out::println);
    }
}
