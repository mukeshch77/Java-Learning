import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[4][4], B = new int[4][4], AB = new int[4][4], BA = new int[4][4];

        // Input matrices A and B
        System.out.println("Enter Matrix A (4x4): ");
        for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) A[i][j] = sc.nextInt();
        System.out.println("Enter Matrix B (4x4): ");
        for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) B[i][j] = sc.nextInt();

        // Matrix multiplication for AB and BA
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    AB[i][j] += A[i][k] * B[k][j];
                    BA[i][j] += B[i][k] * A[k][j];
                }
            }
        }

        // Print results and check AB == BA
        boolean isEqual = true;
        System.out.println("Matrix AB:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(AB[i][j] + " ");
                if (AB[i][j] != BA[i][j]){
                    isEqual = false;
                    break;
                } 
            }
            System.out.println();
        }

        System.out.println("Matrix BA:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) System.out.print(BA[i][j] + " ");
            System.out.println();
        }

        // System.out.println((isEqual) ? "AB = BA" : "AB ≠ BA");
        if(isEqual){
            System.out.println("AB = BA");
        } else {
            System.out.println("Ab ≠ BA");
        }
        sc.close();
    }
}