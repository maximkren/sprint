package main.java.sjd.runners;

import main.java.sjd.implementations.circles.Circle;
import main.java.sjd.implementations.squares.Square;
import main.java.sjd.implementations.triangles.Triangle;
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
