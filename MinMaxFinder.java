import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size should be a positive integer.");
            return;
        }

        // Create an array to hold the user input
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Find the smallest and largest elements
        int[] result = findMinMax(array);
        if (result != null) {
            System.out.println("Smallest element: " + result[0]);
            System.out.println("Largest element: " + result[1]);
        }
    }

    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            return null; // Handle the case of an empty or null array
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return new int[] { min, max };
    }
}
