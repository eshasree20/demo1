// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Some generic animal sound...");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

// Derived class Cat
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate method overriding
public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden methods
        myAnimal.sound(); // Calls Animal's method
        myDog.sound();    // Calls Dog's overridden method
        myCat.sound();    // Calls Cat's overridden method
    }
}
