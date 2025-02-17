// Abstract class
abstract class Vehicle {
    // Abstract method (to be implemented by subclasses)
    abstract void start();
}

// Subclass Car that implements the start method
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key ignition...");
    }
}

// Subclass Bike that implements the start method
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick or self-start...");
    }
}

// Main class to demonstrate abstraction
public class AbstractClass {
    public static void main(String[] args) {
        // Creating objects of Car and Bike
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Calling the overridden start() method
        myCar.start();  // Calls Car's implementation
        myBike.start(); // Calls Bike's implementation
    }
}
