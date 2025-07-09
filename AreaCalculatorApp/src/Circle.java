import java.util.Scanner;

/**
 * The Circle class represents a 2D shape where all points are equidistant from a central point.
 * It extends the abstract Shape class and provides an implementation to calculate its area.
 * The area of a circle is calculated using the formula:
 *     area = π × radius²
 */

public class Circle extends Shape {
    // Scanner object for reading user input from the console
    Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to input the radius of the circle.
     * Calculates the area using the given radius and returns the result.
     *
     * @return the calculated area of the circle
     */

    public double calculateArea() {
        System.out.println("Enter circle dimensions:");
        System.out.print("Radius >> ");
        double radius = input.nextDouble();

        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Circle Area >> " + area);
        return area;
    }
}
