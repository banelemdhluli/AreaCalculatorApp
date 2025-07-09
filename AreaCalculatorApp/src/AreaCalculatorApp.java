public class AreaCalculatorApp {
    public static void main(String[] args) {

        // Create objects for all shapes
        Shape[] shapes = {
                new Rectangle(),
                new Circle(),
                new Square(),
                new Triangle(),
                new Parallelogram(),
                new Trapezium(),
                new Rhombus()
        };

        // Loop through and calculate area for each shape
        for (Shape shape : shapes) {
            System.out.println();
            shape.calculateArea();
        }
    }
}