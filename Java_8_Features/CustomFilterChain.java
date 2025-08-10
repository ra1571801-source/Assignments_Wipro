import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomFilterChain {
     public static void main(String[] args) {
        List<String> names = Arrays.asList("Anita", "Akshay", "Amma", "Ritika", "Ammu", "John");

        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        List<String> filteredNames = names.stream()
                                          .filter(startsWithA.and(endsWithA))
                                          .collect(Collectors.toList());

        System.out.println("Names starting with 'A' and ending with 'a': " + filteredNames);
    }
}
