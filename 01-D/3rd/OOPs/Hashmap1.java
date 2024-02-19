import java.util.HashMap;
import java.util.Map;

public class Hashmap1{
    public static void main(String[] args) {
        Map<String, Integer> shoppingCart = new HashMap<>();

        // Adding items to the shopping cart
        shoppingCart.put("Milk", 2); // Item ID and quantity
        shoppingCart.put("flour", 1);
        shoppingCart.put("Choclates", 3);

        System.out.println("Shopping Cart: " + shoppingCart);

        // Checking 
        boolean containsChoclates = shoppingCart.containsKey("Choclates");
        System.out.println("Does shopping cart contain Choclates? " + containsChoclates);


        // Removing an item from the shopping cart
        shoppingCart.remove("flour");
        System.out.println("Shopping Cart after removing flour: " + shoppingCart);

        // Size of the shopping cart
        int cartSize = shoppingCart.size();
        System.out.println("Size of the shopping cart: " + cartSize);

        // Iterating through the shopping cart
        System.out.println("Items in the shopping cart:");
        for (Map.Entry<String, Integer> entry : shoppingCart.entrySet()) {
            System.out.println("Item ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        // Clearing the shopping cart
        shoppingCart.clear();
        System.out.println("Shopping Cart after clearing: " + shoppingCart);

        // Checking if the shopping cart is empty
        boolean isEmpty = shoppingCart.isEmpty();
        System.out.println("Is the shopping cart empty? " + isEmpty);
    }
}
