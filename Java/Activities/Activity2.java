package Activities;

public class Activity2 {

    public static void main(String[] args) {

        // Initialize array
        int[] numbers = {10, 77, 10, 54, -11, 10};

        int sum = 0;

        // Loop through array and add all 10's
        for (int num : numbers) {
            if (num == 10) {
                sum += 10;
            }
        }

        // Check if the sum is exactly 30
        if (sum == 30) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}







