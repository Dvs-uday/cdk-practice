import java.util.*;

public class TreeSetOperations{
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Apple"); // Adding a duplicate element

        // Displaying the TreeSet (naturally sorted)
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element exists in the TreeSet
        System.out.println("Contains 'Orange': " + treeSet.contains("Orange"));

        // Removing an element from the TreeSet
        treeSet.remove("Grapes");

        // Displaying the modified TreeSet
        System.out.println("Modified TreeSet: " + treeSet);

        // Iterating through the TreeSet using an Iterator
        System.out.println("Iterating through TreeSet:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
