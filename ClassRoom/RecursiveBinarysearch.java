import java.util.Scanner;

public class RecursiveBinarysearch {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + right / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target);
            }
            else {
                return binarySearch(arr, left, mid - 1, target);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the target value to search for:");
        int target = s.nextInt();

        int result = binarySearch(arr, 0, n - 1, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
