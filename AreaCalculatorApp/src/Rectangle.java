import java.util.Scanner;

/**
 * The Rectangle class represents a 2D shape with four right angles and opposite sides equal in length.
 * It extends the abstract Shape class and provides an implementation to calculate its area.
 * The area of a rectangle is calculated using the formula:
 *     area = width × height
 */

public class Rectangle extends Shape {
    // Scanner object for reading user input from the console
    Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to input the width and height of the rectangle.
     * Calculates the area using the provided dimensions and returns the result.
     *
     * @return the calculated area of the rectangle
     */


    public double calculateArea() {
        System.out.println("Enter rectangle dimensions:");
        System.out.print("Width >> ");
        double width = input.nextDouble();
        System.out.print("Height >> ");
        double height = input.nextDouble();

        double area = width * height;
        System.out.println("Rectangle Area >> " + area);
        return area;
    }
}
