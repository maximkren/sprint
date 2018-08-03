package sjd.java.runners;

import sjd.java.implementations.circles.Circle;
import sjd.java.implementations.squares.Square;
import sjd.java.implementations.triangles.Triangle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SprintRunner {
	
	private static Logger logger = Logger.getLogger(SprintRunner.class.getName());
	
	public static void main(String[] args) {

		

		Triangle triangle = new Triangle();

		triangle.setSideA(2);
		triangle.setSideB(2);
		triangle.setSideC(2);

		Square square = new Square();

		square.setHeight(2);
		square.setWidth(2);

		Circle circle = new Circle();

		circle.setRadius(2);

		logger.log(Level.INFO, "Triangle area is " + triangle.getArea());
		logger.log(Level.INFO, "Square area is " + square.getArea());
		logger.log(Level.INFO, "Circle area is " + circle.getArea());

	}
}
