public class Main {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(2);

		Square square1 = new Square();
		square1.setSide(11);

		Triangle triangle1 = new Triangle();
		triangle1.setSideA(3);
		triangle1.setSideB(4);
		triangle1.setSideC(5);


		printDifferentShapes(circle1);
		printDifferentShapes(square1);
		printDifferentShapes(triangle1);

	}

	/**
	 * Prints the details of a given Shape object
	 * This method takes a shape object and prints all it's details
	 * @param shape
	 */
	public static void printDifferentShapes(Shape shape) {
		System.out.println(shape);
	}
}