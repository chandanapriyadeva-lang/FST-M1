package Activities;


public class Activity4 {

    public static void main(String[] args) {

        // Initialize an array with random numbers
        int[] numbers = {34, 12, 5, 66, 29, 8, 1};

        // Display array before sorting
        System.out.println("Array before sorting:");
        printArray(numbers);

        // Perform insertion sort
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Move elements that are greater than key
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }

            // Place key at the correct position
            numbers[j + 1] = key;
        }

        // Display array after sorting
        System.out.println("Array after sorting:");
        printArray(numbers);
    }

    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}