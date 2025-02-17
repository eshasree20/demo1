import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        System.out.println("Employee Details Management System");

        do {
            // Input employee details
            System.out.println("\nEnter Employee Details:");

            System.out.print("Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Employee Age: ");
            int age = scanner.nextInt();

            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the leftover newline character

            // Display entered details
            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: $" + salary);

            // Ask if the user wants to continue
            System.out.print("\nDo you want to enter details for another employee? (yes/no): ");
            continueInput = scanner.nextLine().toLowerCase();

        } while (continueInput.equals("yes"));

        System.out.println("\nThank you! Exiting the system.");
        scanner.close();
    }
}

