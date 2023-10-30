public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);

        Square square1 = new Square(11);

        Triangle triangle1 = new Triangle(3, 4, 5);

        printDifferentShapes(circle1);
        printDifferentShapes(square1);
        printDifferentShapes(triangle1);

        System.out.println("Circle Area = " + Circle.calculateArea(2));
        System.out.println("Square Area = " + Square.calculateArea(11));
        System.out.println("Triangle Area = " + Triangle.calculateArea(3 ,4, 5));
    }

    public static void printDifferentShapes(Shape shape) {
        String shapeName = shape.getClass().getSimpleName();
        System.out.println(shapeName + " Area = " + (shape.calculateArea() * 100) / 100);
        System.out.println(shapeName + " Perimeter = " + shape.calculatePerimeter());
    }
}