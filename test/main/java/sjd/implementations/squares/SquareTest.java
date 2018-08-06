package main.java.sjd.implementations.squares;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.sjd.implementations.squares.Square;

class SquareTest {

	@Test
	void testGetArea() {

		Square square = new Square();

		square.setSide(8);

		assertEquals(64, square.getArea());

	}

}
