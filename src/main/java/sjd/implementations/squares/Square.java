package main.java.sjd.implementations.squares;

import main.java.sjd.abstractions.AbstractShape;

public class Square extends AbstractShape {
	private int side;
	

	
	public int getSide() {
		return side;
	}



	public void setSide(int side) {
		this.side = side;
	}

	
	
	@Override
	public int getArea() {
		
		return (int) Math.sqrt(side);
	}

}
