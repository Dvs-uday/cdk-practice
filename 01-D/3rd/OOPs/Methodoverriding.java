
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Methodoverriding{
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.draw(); 

        Shape shape2 = new Rectangle();
        shape2.draw(); 

        Shape shape3 = new Circle();
        shape3.draw(); 
    }
}
