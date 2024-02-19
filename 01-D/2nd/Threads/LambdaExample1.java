interface Calculator {
    int calculate(int a, int b);
}

public class LambdaExample1{
    public static void main(String[] args) {
        
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.calculate(5, 3)); 
        System.out.println("Subtraction: " + subtraction.calculate(5, 3)); 
    }
}
