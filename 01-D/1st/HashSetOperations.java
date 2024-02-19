import java.util.*;

public class HashSetOperations{
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Apple"); // Adding a duplicate element

        // Displaying the HashSet
        System.out.println("HashSet: " + hashSet);

        // Checking if an element exists in the HashSet
        System.out.println("Contains 'Orange': " + hashSet.contains("Orange"));

        // Removing an element from the HashSet
        hashSet.remove("Grapes");

        // Displaying the modified HashSet
        System.out.println("Modified HashSet: " + hashSet);

        // Iterating through the HashSet using an Iterator
        System.out.println("Iterating through HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Clearing the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
