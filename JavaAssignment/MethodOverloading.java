class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

// Main class to test method overloading
public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling different overloaded add() methods
        System.out.println("Sum of 10 and 20: " + math.add(10, 20));
        System.out.println("Sum of 5, 15, and 25: " + math.add(5, 15, 25));
        System.out.println("Sum of 4.5 and 3.2: " + math.add(4.5, 3.2));
    }
}
