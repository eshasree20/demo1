public class Constructor {

    // Static variable
    private static String companyName;

    // Instance variables
    private String employeeName;
    private int employeeId;

    // Static block (to initialize static variables)
    static {
        companyName = "Tech Solutions Inc.";
        System.out.println("Static block executed: Company Name set to " + companyName);
    }

    // Default constructor (non-parameterized)
    public Constructor() {
        this.employeeName = "Unknown";
        this.employeeId = 0;
        System.out.println("Default constructor executed: Employee Name and ID are set to default values.");
    }

    // Parameterized constructor
    public Constructor(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        System.out.println("Parameterized constructor executed: Employee Name and ID are initialized.");
    }

    // Static method
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Instance method
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }

    public static void main(String[] args) {
        // Accessing static method
        Constructor.displayCompanyName();

        // Creating an object using the default constructor
        Constructor employee1 = new Constructor();
        employee1.displayEmployeeDetails();

        // Creating an object using the parameterized constructor
        Constructor employee2 = new Constructor("Eshasree Madireddy", 101);
        employee2.displayEmployeeDetails();
    }
}
