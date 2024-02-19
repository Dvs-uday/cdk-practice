

interface Flyable {
    void fly();
}


interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}


class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.fly(); // Bird can fly

        Fish salmon = new Fish();
        salmon.swim(); // Fish can swim

        Duck mallard = new Duck();
        mallard.fly(); // Duck can fly
        mallard.swim(); // Duck can swim
    }
}
