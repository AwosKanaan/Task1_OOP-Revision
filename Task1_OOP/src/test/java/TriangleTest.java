import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

	@Test
	void setSideA_WhenEntersPositiveValue_setCorrectValue() {
		Triangle triangle = new Triangle();
		assertDoesNotThrow(() -> triangle.setSideA(2));
	}

	@Test
	void setSideA_WhenEntersNegativeValue_throwsException() {
		Triangle triangle = new Triangle();
		assertThrows(IllegalArgumentException.class, () -> triangle.setSideA(-1));
	}

	@Test
	void setSideA_WhenEntersZeroRadius_throwsException() {
		Triangle triangle = new Triangle();
		assertThrows(IllegalArgumentException.class, () -> triangle.setSideA(0));
	}

	@Test
	void setSideB_WhenEntersPositiveValue_setCorrectValue() {
		Triangle triangle = new Triangle();
		assertDoesNotThrow(() -> triangle.setSideB(2));
	}

	@Test
	void setSideB_WhenEntersNegativeValue_throwsException() {
		Triangle triangle = new Triangle();
		assertThrows(IllegalArgumentException.class, () -> triangle.setSideB(-1));
	}

	@Test
	void setSideB_WhenEntersZeroRadius_throwsException() {
		Triangle triangle = new Triangle();
		assertThrows(IllegalArgumentException.class, () -> triangle.setSideB(0));
	}

	@Test
	void setSideC_WhenEntersPositiveValue_setCorrectValue() {
		Triangle triangle = new Triangle();
		assertDoesNotThrow(() -> triangle.setSideC(2));
	}

	@Test
	void setSideC_WhenEntersNegativeValue_throwsException() {
		Triangle triangle = new Triangle();
		assertThrows(IllegalArgumentException.class, () -> triangle.setSideC(-1));
	}

	@Test
	void setSideC_WhenEntersZeroRadius_throwsException() {
		Triangle triangle = new Triangle();
		assertThrows(IllegalArgumentException.class, () -> triangle.setSideC(0));
	}
	@Test
	void calculateArea_WhenEntersSidesFromOverload_calculatesAreaCorrectly() {
		Triangle triangle = new Triangle();
		assertEquals(9.921567416492215, triangle.calculateArea(4, 5, 6));
	}

	@Test
	void calculateArea_WhenEntersSides_calculatesAreaCorrectly() {
		Triangle triangle = new Triangle();
		triangle.setSideA(4);
		triangle.setSideB(5);
		triangle.setSideC(6);
		assertEquals(9.921567416492215, triangle.calculateArea());
	}

	@Test
	void calculatePerimeter_WhenEntersSides_calculatesPerimeterCorrectly() {
		Triangle triangle = new Triangle();
		triangle.setSideA(5);
		triangle.setSideB(6);
		triangle.setSideC(7);
		assertEquals(18, triangle.calculatePerimeter());
	}
}