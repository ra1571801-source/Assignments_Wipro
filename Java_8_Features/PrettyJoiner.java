import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrettyJoiner {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Delhi", "Chennai", "Kolkata", "Bengaluru");

        String result = cities.stream()
                              .collect(Collectors.joining(", "));

        System.out.println("Joined cities: " + result);
    }
}
