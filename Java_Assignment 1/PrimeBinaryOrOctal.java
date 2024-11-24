import java.util.Scanner;

public class PrimeBinaryOrOctal {

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) if (num % i == 0) return false;
        return true;
    }

    // Convert number to binary
    public static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }

    // Convert number to octal
    public static String toOctal(int num) {
        String octal = "";
        while (num > 0) {
            octal = (num % 8) + octal;
            num /= 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The number is prime. Binary: " + toBinary(num));
        } else {
            System.out.println("The number is not prime. Octal: " + toOctal(num));
        }
        
        sc.close();
    }
}
