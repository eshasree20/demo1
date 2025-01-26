import java.util.Scanner;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        // Array to store employee details
        String[] employeeNames = new String[numEmployees];
        double[] employeeSalaries = new double[numEmployees];

        // Input details for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            
            System.out.print("Name: ");
            employeeNames[i] = scanner.nextLine();

            System.out.print("Salary: ");
            employeeSalaries[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the leftover newline
        }

        // Display employees with salary less than 80,000
        System.out.println("\nEmployees with salary less than $80,000:");
        for (int i = 0; i < numEmployees; i++) {
            if (employeeSalaries[i] < 80000) {
                System.out.println("Name: " + employeeNames[i] + ", Salary: $" + employeeSalaries[i]);
            }
        }

        scanner.close();
    }
}
