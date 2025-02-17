import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input and converting it to double
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        double doubleValue = (double) intValue; // Implicit conversion
        System.out.println("Converted to double: " + doubleValue);

        // Taking double input and converting it to integer
        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        int convertedInt = (int) inputDouble; // Explicit conversion (Type casting)
        System.out.println("Converted to integer: " + convertedInt);

        scanner.close();
    }
}
