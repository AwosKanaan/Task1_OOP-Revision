public class Square extends Shape{
    private final double side;

    public Square(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Square side must be greater than 0");
        }

        this.side = side;
    }
    @Override
    public double calculateArea() {
        return 4 * side;
    }

    public static double calculateArea(double side) {
        return 4 * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * side;
    }
}
