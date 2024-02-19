
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods1  {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 7, 5, 1, 7, 3, 9, 6, 2);

        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct()
                .sorted()
                .limit(3)
                .map(number -> number * 2)
                .toList(); // Requires Java 16+ for toList() method, otherwise use collect(Collectors.toList())

        System.out.println("Filtered, distinct, sorted, limited, and doubled even numbers: " + evenNumbers);

        // Find the first even number
        Optional<Integer> firstEvenNumber = numbers.stream()
                .filter(number -> number % 2 == 0)
                .findFirst();

        if (firstEvenNumber.isPresent()) {
            System.out.println("First even number found: " + firstEvenNumber.get());
        } else {
            System.out.println("No even number found");
        }
    }
}
