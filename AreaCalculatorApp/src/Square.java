import java.util.Scanner;

/**
 * The Square class represents a 2D shape with four equal sides and four right angles.
 * It extends the abstract Shape class and provides an implementation to calculate its area.
 * The area of a square is calculated using the formula:
 *     area = side × side
 */

public class Square extends Shape {
    // Scanner object for reading user input from the console
    Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to input the length of one side of the square.
     * Calculates the area using the given side length and returns the result.
     *
     * @return the calculated area of the square
     */

    public double calculateArea() {
        System.out.println("Enter square dimensions:");
        System.out.print("Side >> ");
        double side = input.nextDouble();

        double area = side * side;
        System.out.println("Square Area >> " + area);
        return area;
    }
}
