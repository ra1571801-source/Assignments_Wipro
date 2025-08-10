import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ANameFinder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anita", "Ravi", "Radhi", "Geethi", "Asha", "Amma");
        List<String> aNames = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .collect(Collectors.toList());

        // Print result
        System.out.println("Names starting with 'A':");
        aNames.forEach(System.out::println);
    }
}
