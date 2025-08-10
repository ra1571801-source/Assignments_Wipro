import java.util.Optional;

public class SafeDivider {
    public static Optional<Double> divide(double numerator, double denominator) {
        if (denominator == 0) {
            return Optional.empty(); // division by 0 not allowed
        }
        return Optional.of(numerator / denominator);
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 0;

        Optional<Double> result = divide(a, b);

        // Check if value is present
        if (result.isPresent()) {
            System.out.println("Result: " + result.get());
        } else {
            System.out.println("Not Allowed");
        }
    }
}
