import java.util.Scanner;

/**
 * The Triangle class represents a 2D polygon with three sides.
 * It extends the abstract Shape class and provides an implementation for calculating area.
 * The area of a triangle is calculated using the formula:
 *     area = 0.5 × base × height
 */

public class Triangle extends Shape {
    // Scanner object for reading user input from the console
    Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to input the base and height of the triangle.
     * Calculates the area using the given dimensions and returns the result.
     *
     * @return the calculated area of the triangle
     */

    public double calculateArea() {
        System.out.println("Enter triangle dimensions:");
        System.out.print("Base >> ");
        double base = input.nextDouble();
        System.out.print("Height >> ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Triangle Area >> " + area);
        return area;
    }
}
