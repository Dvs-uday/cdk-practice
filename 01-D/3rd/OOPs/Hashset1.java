import java.util.HashSet;
import java.util.Set;

public class Hashset1{
    public static void main(String[] args) {
        Set<String> cricketersSet = new HashSet<>();

        cricketersSet.add("Sachin Tendulkar");
        cricketersSet.add("Virat Kohli");
        cricketersSet.add("AB de Villiers");
        cricketersSet.add("Steve Smith");
        cricketersSet.add("Sachin Tendulkar"); // Adding a duplicate 

        System.out.println("Cricketers set " + cricketersSet);

        // Check contina
        boolean containsKohli = cricketersSet.contains("Virat Kohli");
        System.out.println("Set contains Virat Kohli " + containsKohli);

        // Removing 
        cricketersSet.remove("Steve Smith");
        System.out.println("Cricketers set after removing 'Smith': " + cricketersSet);

        // Size 
        int setSize = cricketersSet.size();
        System.out.println("Size of the cricketers set: " + setSize);

        // Iterating through the set
        for (String cricketer : cricketersSet) {
            System.out.println(cricketer);
        }

        // Clearing the set
        cricketersSet.clear();
        System.out.println("Cricketers set after clearing: " + cricketersSet);

        // is empty
        boolean isEmpty = cricketersSet.isEmpty();
        System.out.println("Is the cricketers set empty? " + isEmpty);
    }
}
