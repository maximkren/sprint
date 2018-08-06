package main.java.sjd.implementations.circles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.sjd.implementations.circles.Circle;

class CircleTest {

	@Test
	void testGetArea() {

		Circle circle = new Circle();
		
		circle.setRadius(10);

		assertEquals(314, circle.getArea());

	}

}
