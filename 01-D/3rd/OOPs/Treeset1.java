import java.util.Set;
import java.util.TreeSet;

public class Treeset1{
    public static void main(String[] args) {
        // Create a TreeSet of cricketer names
        Set<String> cricketersTreeSet = new TreeSet<>();

        // Adding cricketer names to the TreeSet
        cricketersTreeSet.add("Sachin Tendulkar");
        cricketersTreeSet.add("Virat Kohli");
        cricketersTreeSet.add("AB de Villiers");
        cricketersTreeSet.add("Steve Smith");
        cricketersTreeSet.add("Sachin Tendulkar"); // Adding a duplicate - won't be added

        System.out.println("Cricketers TreeSet after adding: " + cricketersTreeSet);

        
        boolean containsKohli = cricketersTreeSet.contains("Virat Kohli");
        System.out.println("TreeSet contains Virat Kohli: " + containsKohli);

        // Removing 
        cricketersTreeSet.remove("Steve Smith");
        System.out.println("Cricketers TreeSet after removing 'Steve Smith': " + cricketersTreeSet);

        // Size 
        int setSize = cricketersTreeSet.size();
        System.out.println("Size of the cricketers TreeSet: " + setSize);

        // Iterating 
        System.out.println("Iterating through the cricketers TreeSet:");
        for (String cricketer : cricketersTreeSet) {
            System.out.println(cricketer);
        }

        // Clearing 
        cricketersTreeSet.clear();
        System.out.println("Cricketers TreeSet after clearing: " + cricketersTreeSet);

        // Checking if the TreeSet is empty
        boolean isEmpty = cricketersTreeSet.isEmpty();
        System.out.println("Is the cricketers TreeSet empty? " + isEmpty);
    }
}
