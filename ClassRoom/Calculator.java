import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input handling with proper prompt messages
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter operation (+, -, *, /, %): ");
        String taskPerform = sc.next();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Perform the calculation based on the operator
        switch (taskPerform) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;

            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Invalid Division: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;

            case "%":
                if (num2 == 0) {
                    System.out.println("Invalid Modulo: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 % num2));
                }
                break;

            default:
                System.out.println("Invalid task: Please enter a valid operator (+, -, *, /, %).");
        }
        
        sc.close(); 
    }
}
