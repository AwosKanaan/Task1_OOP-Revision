import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

	@Test
	public void calculateArea_PositiveRadius_ReturnsCorrectArea() {
		Circle circle = new Circle();
		circle.setRadius(5.0);
		double area = circle.calculateArea();
		assertEquals(Math.PI * 5.0 * 5.0, area, 0.001);
	}

	@Test
	public void calculatePerimeter_PositiveRadius_ReturnsCorrectPerimeter() {
		Circle circle = new Circle();
		circle.setRadius(3.0);
		double perimeter = circle.calculatePerimeter();
		assertEquals(2.0 * Math.PI * 3.0, perimeter, 0.001);
	}

	@Test
	public void calculateArea_ZeroRadius_ThrowsIllegalArgumentException() {
		Circle circle = new Circle();
		assertThrows(IllegalArgumentException.class, () -> circle.setRadius(0.0));
	}

	@Test
	public void toString_ReturnsExpectedString() {
		Circle circle = new Circle();
		circle.setRadius(4.0);
		String result = circle.toString();
		String expected = "Circle {radius = 4.0 Area = " + (Math.PI * 4.0 * 4.0) +
				" Perimeter = " + (2.0 * Math.PI * 4.0) + '}';
		assertEquals(expected, result);
	}
}
