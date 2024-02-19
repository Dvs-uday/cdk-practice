public class Exception1{
    public static void main(String[] args) {
        try {
            // Simulating a condition where an exception should be thrown
            int age = -5;

            if (age < 0) {
                // Throw an ArithmeticException if age is negative
                throw new ArithmeticException("Age cannot be negative");
            }

            // If age is non-negative, print 
            System.out.println("Age: " + age);
        } catch (ArithmeticException ex) {
            // Catching the ArithmeticException and printing the error message
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
