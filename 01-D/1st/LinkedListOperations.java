import java.util.*;

public class LinkedListOperations{
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Apple"); // Adding a duplicate element

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Checking if an element exists in the LinkedList
        System.out.println("Contains 'Orange': " + linkedList.contains("Orange"));

        // Removing an element from the LinkedList
        linkedList.remove("Grapes");

        // Displaying the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);

        // Iterating through the LinkedList using an Iterator
        System.out.println("Iterating through LinkedList:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Getting the size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
