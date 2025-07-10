import java.util.Scanner;

/**
 * AreaCalculatorApp is the main class that provides an interactive console menu
 * to calculate the area of various 2D shapes.
 * It uses polymorphism by storing all shape objects as references of the abstract class Shape.
 */
public class AreaCalculatorApp {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Declare a reference to the abstract Shape class
        Shape shape = null;

        // Infinite loop to keep showing the menu until the user chooses to exit
        while (true) {
            // Display the main menu
            System.out.println("\n=== AREA CALCULATOR MENU ===");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Parallelogram");
            System.out.println("6. Trapezium");
            System.out.println("7. Rhombus");
            System.out.println("0. Exit");

            // Prompt user for their choice
            System.out.print("Choose a shape >> ");
            int choice = scanner.nextInt();

            // Switch statement to determine which shape to create
            switch (choice) {
                case 1:
                    shape = new Rectangle(); // Create a Rectangle object
                    break;
                case 2:
                    shape = new Circle(); // Create a Circle object
                    break;
                case 3:
                    shape = new Square(); // Create a Square object
                    break;
                case 4:
                    shape = new Triangle(); // Create a Triangle object
                    break;
                case 5:
                    shape = new Parallelogram(); // Create a Parallelogram object
                    break;
                case 6:
                    shape = new Trapezium(); // Create a Trapezium object
                    break;
                case 7:
                    shape = new Rhombus(); // Create a Rhombus object
                    break;
                case 0:
                    // Exit the program gracefully
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    // Handle invalid input and repeat the menu
                    System.out.println("Invalid choice. Please try again.");
                    continue; // Go back to the beginning of the loop
            }

            // Call the calculateArea() method for the selected shape
            System.out.println();
            shape.calculateArea();
        }
    }
}
