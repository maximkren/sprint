package implementations.squares;

import implementations.AbstractShape;

public class Square extends AbstractShape {
	private double height;
	private double width;

	public Square() {
		height = -1;
		width = -1;

	}

	public void setValues(double height, double width) {

		this.height = height;
		this.width = width;

	}

	@Override
	public double getArea() {
		
		return height * width;
	}

}
