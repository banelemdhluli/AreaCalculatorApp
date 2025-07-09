import java.util.Scanner;

/**
 * The Trapezium class represents a 2D quadrilateral shape with one pair of parallel sides.
 * It extends the abstract Shape class and provides an implementation to calculate its area.
 * The area of a trapezium is calculated using the formula:
 *     area = 0.5 × (base1 + base2) × height
 */
public class Trapezium extends Shape {
    // Scanner object for reading user input from the console
    Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to input the lengths of the two bases and the height of the trapezium.
     * Calculates the area based on the user input and returns the result.
     *
     * @return the calculated area of the trapezium
     */
    public double calculateArea() {
        System.out.println("Enter trapezium dimensions:");

        System.out.print("Base 1 >> ");
        double base1 = input.nextDouble();

        System.out.print("Base 2 >> ");
        double base2 = input.nextDouble();

        System.out.print("Height >> ");
        double height = input.nextDouble();

        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Trapezium Area >> " + area);
        return area;
    }
}