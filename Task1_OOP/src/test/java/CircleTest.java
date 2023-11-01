import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

	@Test
	void setRadius_WhenEntersPositiveRadius_setCorrectRadius() {
		Circle circle = new Circle();
		assertDoesNotThrow(() -> circle.setRadius(2));
	}

	@Test
	void setRadius_WhenEntersNegativeRadius_throwsException() {
		Circle circle = new Circle();
		assertThrows(IllegalArgumentException.class, () -> circle.setRadius(-1));
	}

	@Test
	void setRadius_WhenEntersZeroRadius_throwsException() {
		Circle circle = new Circle();
		assertThrows(IllegalArgumentException.class, () -> circle.setRadius(0));
	}

	@Test
	void calculateArea_WhenEntersPositiveRadiusFromOverload_calculatesAreaCorrectly() {
		Circle circle = new Circle();
		assertEquals(28.274333882308138, circle.calculateArea(3));
	}

	@Test
	void calculateArea_WhenEntersNegativeRadiusFromOverload_throwsException() {
		Circle circle = new Circle();
		assertThrows(IllegalArgumentException.class, () -> circle.calculateArea(-1));
	}

	@Test
	void calculateArea_WhenEntersZeroRadiusFromOverload_throwsException() {
		Circle circle = new Circle();
		assertThrows(IllegalArgumentException.class, () -> circle.calculateArea(0));
	}

	@Test
	void calculateArea_WhenEntersRadius_calculatesAreaCorrectly() {
		Circle circle = new Circle();
		circle.setRadius(3);
		assertEquals(28.274333882308138, circle.calculateArea());
	}

	@Test
	void calculatePerimeter_WhenEntersRadius_calculatesPerimeterCorrectly() {
		Circle circle = new Circle();
		circle.setRadius(2);
		assertEquals(12.566370614359172, circle.calculatePerimeter());
	}
}
