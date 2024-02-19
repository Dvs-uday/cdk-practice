
class Vehicle {
    void start() {
        System.out.println("Both Vehicles have  started");
    }

    void stop() {
        System.out.println("Vehicles stopped because of low fuel");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Normal Car is being driven");
    }

    void brake() {
        System.out.println("Fuel is being filled");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }

    void selfDrive() {
        System.out.println("Electric car is started with self-driving ");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        Car car=new Car();
        
        car.start();  //inherited from vehicle
        electricCar.selfDrive();  //inherited from electric car
        car.drive(); //inherited from car
        car.stop();

        car.brake();
        electricCar.charge();

    }
}
