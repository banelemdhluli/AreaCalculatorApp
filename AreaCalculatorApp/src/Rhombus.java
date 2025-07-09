import java.util.Scanner;

/**
 * The Rhombus class represents a 2D shape with all sides equal in length and opposite angles equal.
 * It extends the abstract Shape class and provides an implementation for calculating its area.
 * The area of a rhombus is calculated using the formula:
 *     area = 0.5 × diagonal1 × diagonal2
 */

public class Rhombus extends Shape {
    // Scanner object for reading user input from the console
    Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to input the lengths of the two diagonals of the rhombus.
     * Calculates the area using the formula and returns the result.
     *
     * @return the calculated area of the rhombus
     */

    public double calculateArea() {
        System.out.println("Enter rhombus dimensions:");
        System.out.print("Diagonal 1 >> ");
        double d1 = input.nextDouble();
        System.out.print("Diagonal 2 >> ");
        double d2 = input.nextDouble();

        double area = 0.5 * d1 * d2;
        System.out.println("Rhombus Area >> " + area);
        return area;
    }
}
