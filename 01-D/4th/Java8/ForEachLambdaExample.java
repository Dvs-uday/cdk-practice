import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLambdaExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Iterating over a List 
        System.out.println("Iterating through a List ");
        numbers.forEach(number -> System.out.println(number));

        //array
        String[] names = {"Uday", "Virat", "Kiran"};

        
        System.out.println("\nIterating through an array ");
        Arrays.asList(names).forEach(name -> System.out.println(name));
    }
}
