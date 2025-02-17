// Base class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Main class to demonstrate method overriding
public class MethodOverriding {
    public static void main(String[] args) {
        // Creating an Animal object
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls the base class method

        // Creating a Dog object
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method in Dog class

        // Using polymorphism
        Animal myPet = new Dog();
        myPet.makeSound(); // Calls the overridden method in Dog class (Dynamic Binding)
    }
}
