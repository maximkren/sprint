package main.java.sjd.implementations.squares;

import main.java.sjd.abstractions.AbstractShape;

public class Square extends AbstractShape {
	private int height;
	private int width;

	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getArea() {
		
		return height * width;
	}

}
