import java.util.Scanner;

/**
 * The Parallelogram class represents a 2D shape with opposite sides that are parallel.
 * It extends the abstract class Shape and provides an implementation for calculating area.
 * Area of a parallelogram is calculated using the formula: base × height.
 */
public class Parallelogram extends Shape {
    // Scanner to get user input from the console
    Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to input the base and height of a parallelogram,
     * then calculates and returns the area.
     *
     * @return the calculated area of the parallelogram
     */
    public double calculateArea() {
        System.out.println("Enter parallelogram dimensions:");
        System.out.print("Base >> ");
        double base = input.nextDouble();

        System.out.print("Height >> ");
        double height = input.nextDouble();

        double area = base * height;
        System.out.println("Parallelogram Area >> " + area);
        return area;
    }
}
