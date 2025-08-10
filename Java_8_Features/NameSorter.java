import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Geeth Harsh");
        names.add("Abdul");
        names.add("Radha");
        names.add("Karthik");
        names.add("Balu");
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("Sorted names (Collections.sort + lambda):");
        names.forEach(System.out::println);
    }
}
