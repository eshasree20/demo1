import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        // 1. Declaring and Initializing an Array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing Array Elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 3. Iterating Through the Array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 4. Modifying Array Elements
        numbers[2] = 35; // Changing the value at index 2
        System.out.println("Modified Array: " + Arrays.toString(numbers));

        // 5. Sorting an Array
        int[] unsortedArray = {3, 5, 1, 4, 2};
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        Arrays.sort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));

        // 6. Searching in a Sorted Array
        int searchValue = 4;
        int index = Arrays.binarySearch(unsortedArray, searchValue);
        if (index >= 0) {
            System.out.println("Element " + searchValue + " found at index: " + index);
        } else {
            System.out.println("Element " + searchValue + " not found.");
        }

        // 7. Multidimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 8. Finding the Maximum Element
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element in the array: " + max);

        // 9. Copying Arrays
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // 10. Length of an Array
        System.out.println("Length of the array: " + numbers.length);
    }
}

