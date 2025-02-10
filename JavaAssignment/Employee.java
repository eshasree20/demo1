import java.util.Scanner;

public class Employee {
    private String name;
    private int id;
    private double salary;

    // Parameterized Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter employee name: ");
        
        String name = scanner.nextLine();
        

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Creating Employee object
        Employee employee = new Employee(name, id, salary);

        // Displaying employee details
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
