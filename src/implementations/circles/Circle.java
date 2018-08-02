package implementations.circles;

import implementations.AbstractShape;

public class Circle extends AbstractShape {
	private double radius;

	public Circle() {
		radius = -1;
	}

	public void setRadius(double radius) {

		this.radius = radius;

	}

	@Override
	public double getArea() {

		return Math.PI * Math.pow(radius, 2);
	}

}
