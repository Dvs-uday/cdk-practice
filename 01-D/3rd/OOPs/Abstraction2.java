
//Abstraction using  Interfaces
interface Connectable {
    void connect(); 
    void disconnect(); 
}

class Smartphone implements Connectable {
    public void connect() {
        System.out.println("Smartphone connected.");

    }

    public void disconnect() {
        System.out.println("Smartphone disconnected.");
    }
}


class Laptop implements Connectable {

    public void connect() {
        System.out.println("Laptop connected.");
    }

    public void disconnect() {
        System.out.println("Laptop disconnected.");
    }
}

public class Abstraction2{
    public static void main(String[] args) {
        Connectable smartphone = new Smartphone();
        Connectable laptop = new Laptop();

        smartphone.connect();
        smartphone.disconnect();

        laptop.connect();
        laptop.disconnect();
    }
}
