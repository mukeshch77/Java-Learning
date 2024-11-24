import java.util.Scanner;

public class CeilingAndTwosComplement {

    // Function to get 2's complement of an integer
    public static String twosComplement(int num) {
        StringBuilder binary = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            binary.append((num & (1 << i)) != 0 ? "1" : "0");
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input double value
        System.out.print("Enter a decimal value: ");
        double x = sc.nextDouble();

        // Compute ceiling
        int y = (int) Math.ceil(x);

        // Print ceiling value
        System.out.println("Ceiling value (y) = " + y);

        // Print 2's complement of y
        System.out.println("2's Complement of y: " + twosComplement(~y + 1));

        sc.close();
    }
}
