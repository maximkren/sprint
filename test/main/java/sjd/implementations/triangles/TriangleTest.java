package main.java.sjd.implementations.triangles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.sjd.implementations.triangles.Triangle;

class TriangleTest {

	@Test
	void test() {
		
		Triangle triangle = new Triangle();
		
		triangle.setSideA(7);
		triangle.setSideB(4);
		triangle.setSideC(9);

		assertEquals(13, triangle.getArea());

	}

}
