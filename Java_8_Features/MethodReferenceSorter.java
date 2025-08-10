import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abdul", "Akhil", "Balu", "Radha");

        // Sort using method reference
        Collections.sort(names, String::compareToIgnoreCase);

        // Print the sorted list
        names.forEach(System.out::println);
    }
}
