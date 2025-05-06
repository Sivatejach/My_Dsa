package OOPS.Abstraction;


abstract class Vehicle {
    abstract void startEngine();
    void fuel() {
        System.out.println("Fueling the vehicle...");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

public class Absusingabstractclass {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine(); // Abstract method implemented
        myCar.fuel();         // Concrete method from abstract class
    }
}
