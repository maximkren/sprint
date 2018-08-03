package main.java.sjd.implementations.triangles;

import main.java.sjd.abstractions.AbstractShape;

public class Triangle extends AbstractShape {
	private double sideA;
	private double sideB;
	private double sideC;

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public int getArea() {

		double p = 0.5 * (sideA + sideB + sideC);

		return (int)Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}
}
