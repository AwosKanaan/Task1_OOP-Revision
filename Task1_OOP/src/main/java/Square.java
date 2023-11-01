public class Square extends Shape {
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (side <= 0) {
			throw new IllegalArgumentException("Square side must be greater than 0");
		}
		this.side = side;
	}

	/**
	 * Calculates the area of the square
	 * This method calculates the area of the square based on attribute(s) (side)
	 *
	 * @return area
	 */
	@Override
	public double calculateArea() {
		return 4 * side;
	}

	/**
	 * Calculates the area of the square
	 * This method calculates the area of the square based on parameter(s) (side)
	 * @param side
	 * @return area
	 */
	public double calculateArea(double side) {
		return 4 * side;
	}

	/**
	 * Calculates the perimeter of the square
	 * This method calculates the perimeter of the square based on attribute(s) (side)
	 *
	 * @return perimeter
	 */
	@Override
	public double calculatePerimeter() {
		return side * side;
	}

	@Override
	public String toString() {
		return "Square {" +
				"side = " + side + " " +
				"Area = " + calculateArea() + " " +
				"Perimeter = " + calculatePerimeter() +
				'}';
	}
}
