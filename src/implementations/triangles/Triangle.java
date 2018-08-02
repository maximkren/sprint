package implementations.triangles;

import implementations.AbstractShape;

public class Triangle extends AbstractShape {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle() {
		sideA = -1;
		sideB = -1;
		sideC = -1;
	}

	public void setValues(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double getArea() {

		double p = 0.5 * (sideA + sideB + sideC);

		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}
}
