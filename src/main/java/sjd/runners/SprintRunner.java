package main.java.sjd.runners;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.sjd.implementations.circles.Circle;
import main.java.sjd.implementations.squares.Square;
import main.java.sjd.implementations.triangles.Triangle;
import main.java.sjd.interfaces.Shape;

public class SprintRunner {

	private static Logger logger = Logger.getLogger(SprintRunner.class.getName());

	public static void main(String[] args) {

		Triangle triangle = new Triangle();
		triangle.setSideA(2);
		triangle.setSideB(2);
		triangle.setSideC(2);

		Triangle triangle1 = new Triangle();
		triangle.setSideA(5);
		triangle.setSideB(2);
		triangle.setSideC(7);

		Square square = new Square();
		square.setSide(2);

		Square square1 = new Square();
		square.setSide(7);

		Circle circle = new Circle();
		circle.setRadius(2);

		Circle circle1 = new Circle();
		circle.setRadius(6);

//        Output for TASK#2
//		logger.info(" Triangle area is " + triangle.getArea() + " Square area is " + square.getArea()
//				+ " Circle area is " + circle.getArea());
//		logger.log(Level.INFO, "Triangle area is " + triangle.getArea());
//		logger.log(Level.INFO, "Square area is " + square.getArea());
//		logger.log(Level.INFO, "Circle area is " + circle.getArea());

//TASK#4		
		ArrayList<Shape> shapes = new ArrayList<>();

		shapes.add(circle);
		shapes.add(square);
		shapes.add(triangle);
		shapes.add(circle1);
		shapes.add(square1);
		shapes.add(triangle1);

		if (!shapes.isEmpty()) {

			Shape maxShape = shapes.get(0);
			Shape minShape = shapes.get(0);

			for (int i = 0; i < shapes.size(); i++) {

				if (maxShape.getArea() < shapes.get(i).getArea()) {
					maxShape = shapes.get(i);
				}

				if (i != 0 && minShape.getArea() > shapes.get(i).getArea()) {
					minShape = shapes.get(i);
				}
			}

			logger.info("The shape with minimal area is " + minShape.getClass().getSimpleName());
			logger.info("The shape with maximal area is " + maxShape.getClass().getSimpleName());

		}

	}
}
