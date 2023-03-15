import java.util.Scanner;

public class Main {

    /**
     * Calculates the number of unsuccessful attempts to find the key in input array.
     */
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Number of unsuccessful attempts.
        int count = 0;

        for (int i : inputArr) {
            if (i == key) {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Scans the size of the array.
            int n = scanner.nextInt();

            // Initializing array of size n.
            int[] array = new int[n];

            // Scans the user input to fill up the array.
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            // Scans the user input to get the key.
            int key = scanner.nextInt();

            // Prints the number of unsuccessful attempts.
            System.out.println(new Main().getLinearSearchUnsuccessfulComparisonCount(array, key));
        } catch (NumberFormatException e) {
            System.out.println("Enter a whole number.");
        }
    }
}
