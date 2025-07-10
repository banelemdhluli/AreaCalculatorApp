import java.util.Scanner;

public class AreaCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        while (true) {
            System.out.println("\n=== AREA CALCULATOR MENU ===");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Parallelogram");
            System.out.println("6. Trapezium");
            System.out.println("7. Rhombus");
            System.out.println("0. Exit");
            System.out.print("Choose a shape >> ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shape = new Rectangle();
                    break;
                case 2:
                    shape = new Circle();
                    break;
                case 3:
                    shape = new Square();
                    break;
                case 4:
                    shape = new Triangle();
                    break;
                case 5:
                    shape = new Parallelogram();
                    break;
                case 6:
                    shape = new Trapezium();
                    break;
                case 7:
                    shape = new Rhombus();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println();
            shape.calculateArea();
        }
    }
}
