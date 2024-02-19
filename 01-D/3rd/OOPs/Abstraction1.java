//Using Abstract classes method

abstract class MotorBike {
  abstract void brake();

  abstract void model();
}

class SportsBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("SportsBike Brake");
  }
  public void model()
  {
    System.out.println("Sports Bike model is Kawasaki");
  }
}

class MountainBike extends MotorBike {
    
  public void brake() {
    System.out.println("MountainBike Brake");
  }

  public void model()
  {
    System.out.println("MountainBike model is TREK");
  } 
}

public class Abstraction1{
  public static void main(String[] args) {
    MountainBike m1 = new MountainBike();

    //here we cannot create objects for abstract methods directly
    m1.brake();
    SportsBike s1 = new SportsBike();
    s1.brake();
    s1.model();
    m1.model();
  }
}