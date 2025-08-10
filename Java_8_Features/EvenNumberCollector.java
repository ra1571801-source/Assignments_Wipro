import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberCollector {
     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 10, 13, 16);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}
