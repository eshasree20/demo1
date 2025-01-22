import java.util.Scanner;

public class Employee {

    // Static variable to keep track of total employees
    private static int totalEmployees = 0;

    // Instance variables
    private int employeeId;
    private String name;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        totalEmployees++; // Increment the total employees count whenever a new employee is created
    }

    // Method to get employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Static method to get the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        // Array to hold Employee objects
        Employee[] employees = new Employee[numberOfEmployees];

        // Loop to take employee details as input
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            // Create a new Employee object and store it in the array
            employees[i] = new Employee(id, name, salary);
        }

        // Display all employee details
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
            System.out.println();
        }

        // Display total number of employees
        System.out.println("Total Employees: " + Employee.getTotalEmployees());

        scanner.close();
    }
}
