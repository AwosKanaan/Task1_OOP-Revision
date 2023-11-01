public class Circle extends Shape {
	private double radius;
	private final double PI = Math.PI;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be greater than 0");
		}
		this.radius = radius;
	}

	/**
	 * Calculates the area of the circle
	 * This method calculates the area of the circle based on attribute(s) (radius)
	 * @return area
	 */
	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	/**
	 * Calculates the area of the circle
	 * This method calculates the area of the circle based on parameter(s) (radius)
	 * @param radius
	 * @return
	 */
	public double calculateArea(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be greater than 0");
		}
		return PI * radius * radius;
	}

	/**
	 * Calculates the perimeter of the circle
	 * This method calculates the perimeter of the circle based on attribute(s) (radius)
	 * @return perimeter
	 */
	@Override
	public double calculatePerimeter() {
		return 2 * PI * radius;
	}

	@Override
	public String toString() {
		return "Circle {" +
				"radius = " + radius + " " +
				"Area = " + calculateArea() + " " +
				"Perimeter = " + calculatePerimeter() +
				'}';
	}
}
