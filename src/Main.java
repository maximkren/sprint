

import implementations.circles.Circle;
import implementations.squares.Square;
import implementations.triangles.Triangle;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Square square = new Square();	
		Circle circle = new Circle();
		
		triangle.setValues(2, 2, 2);
		square.setValues(2, 2);
		circle.setRadius(2);
		
		
		System.out.println("Circle area is "+ circle.getArea());
		System.out.println("Triangle area is " + triangle.getArea());
		System.out.println("Square area is " + square.getArea());
	}

}
