package main.java.sjd.implementations.circles;

import main.java.sjd.abstractions.AbstractShape;

public class Circle extends AbstractShape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {

		this.radius = radius;

	}

	@Override
	public int getArea() {

		return (int) (Math.PI * Math.pow(radius, 2));
	}

}
