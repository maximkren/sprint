package test.java.sjd.implementations.squares;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.sjd.implementations.squares.Square;

class SquareTest {

	@Test
	void test() {
		
		Square square = new Square();
		
		square.setHeight(2);
		square.setWidth(6);

		assertEquals(12, square.getArea());

	}

}
