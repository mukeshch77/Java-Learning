import java.util.Scanner;

// Step 1: Create the Shape interface
interface Shape {
    double area(); // Method to calculate the area
}

// Step 2: Implement Circle class
class Circle implements Shape {
    private double radius;
    private final double pi = Math.PI; // Using Math.PI for a more accurate value of π

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * radius * radius; // Area of Circle: πr²
    }
}

// Step 3: Implement Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width; // Area of Rectangle: length * width
    }
}

// Step 4: Implement Triangle class
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height; // Area of Triangle: ½ * base * height
    }
}

// Step 5: Create ShapeAreaCalculator class
class ShapeAreaCalculator {
    public double calculate_area(Shape shape) {
        return shape.area(); // Use polymorphism to calculate area
    }
}

// Step 6: Implement the main class for user interaction
public class GeometricShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        
        while (true) {
            System.out.println("Select a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            Shape shape = null; // Variable to hold the shape object

            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 2: // Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;

                case 3: // Triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    break;

                default:
                    System.out.println("Invalid choice! Please select again.");
                    continue;
            }

            // Calculate and display the area of the chosen shape
            double area = calculator.calculate_area(shape);
            System.out.println("The area is: " + area);
            System.out.println(); // Print a new line for better readability
        }

        scanner.close(); // Close the scanner
    }
}
