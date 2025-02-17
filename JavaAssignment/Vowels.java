import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Converting input to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();

        int vowelCount = 0;

        // Checking each character for vowels
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Displaying the result
        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();
    }
}
