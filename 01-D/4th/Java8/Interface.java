

interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("This is a default method in the interface");
    }

    static void staticMethod() {
        System.out.println("This is a static method in the interface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod in MyClass");
    }
}

public class Interface{
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling abstract method
        obj.abstractMethod();

        obj.defaultMethod();

        // Calling static method d
        MyInterface.staticMethod();
    }
}
