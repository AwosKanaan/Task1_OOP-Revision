import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

	@Test
	void setSide_WhenEntersPositiveValue_setCorrectValue() {
		Square square = new Square();
		assertDoesNotThrow(() -> square.setSide(2));
	}

	@Test
	void setSide_WhenEntersNegativeValue_throwsException() {
		Square square = new Square();
		assertThrows(IllegalArgumentException.class, () -> square.setSide(-1));
	}

	@Test
	void setSide_WhenEntersZeroRadius_throwsException() {
		Square square = new Square();
		assertThrows(IllegalArgumentException.class, () -> square.setSide(0));
	}

	@Test
	void calculateArea_WhenEntersSideFromOverload_calculatesAreaCorrectly() {
		Square square = new Square();
		assertEquals(20, square.calculateArea(5));
	}

	@Test
	void calculateArea_WhenEntersSides_calculatesAreaCorrectly() {
		Square square = new Square();
		square.setSide(5);
		assertEquals(20, square.calculateArea());
	}

	@Test
	void calculatePerimeter_WhenEntersSides_calculatesPerimeterCorrectly() {
		Square square = new Square();
		square.setSide(7);
		assertEquals(49, square.calculatePerimeter());
	}
}