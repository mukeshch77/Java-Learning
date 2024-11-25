import java.util.Scanner;

public class Conditions {

    public static void main(String args[]) {
        // Create a scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Enter month number
        System.out.print("Enter month number (1 to 12): ");
        int monthNo = sc.nextInt();

        // Using switch case to print the name of the month
        switch(monthNo) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month number! Please enter a number between 1 and 12.");
        }

        sc.close();
    }
}
