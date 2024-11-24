package StackClass;
import java.util.Scanner;

public class ArrayReverseUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        StackUsingArray stack = new StackUsingArray(n);

        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("After Reverse:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}