public class WhileLoopDemo {

    public static void main(String[] args) {
        
        // Example 1: Simple Counting
        int counter = 1;
        System.out.println("Counting from 1 to 5:");
        while (counter <= 5) {
            System.out.println(counter);
            counter++; // Increment the counter
        }

        // Example 2: Summing Numbers
        int number = 1;
        int sum = 0;
        System.out.println("\nCalculating the sum of numbers from 1 to 10:");
        while (number <= 10) {
            sum += number; // Add the current number to the sum
            number++;      // Move to the next number
        }
        System.out.println("Sum: " + sum);

        // Example 3: Finding Even Numbers
        int start = 1;
        System.out.println("\nEven numbers between 1 and 10:");
        while (start <= 10) {
            if (start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        }

        // Example 4: Working with User Input (Using a Dummy Example)
        int userNumber = 3; // Example value; in practice, you would read from the user
        System.out.println("\nMultiplication table for " + userNumber + ":");
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(userNumber + " x " + multiplier + " = " + (userNumber * multiplier));
            multiplier++;
        }

        // Example 5: Using Break in While Loop
        System.out.println("\nBreaking out of a loop:");
        int value = 1;
        while (value <= 10) {
            if (value == 5) {
                System.out.println("Breaking the loop at value: " + value);
                break;
            }
            System.out.println("Value: " + value);
            value++;
        }

        // Example 6: Infinite Loop with a Condition to Exit
        System.out.println("\nInfinite loop example (Exiting when a condition is met):");
        int infiniteCounter = 1;
        while (true) {
            System.out.println("Infinite loop counter: " + infiniteCounter);
            if (infiniteCounter == 3) {
                System.out.println("Exiting the infinite loop.");
                break;
            }
            infiniteCounter++;
        }
    }
}

