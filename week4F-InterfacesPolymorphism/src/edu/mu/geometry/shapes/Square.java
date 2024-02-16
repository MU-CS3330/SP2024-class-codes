package edu.mu.geometry.shapes;

import edu.mu.geometry.IShape;

public class Square implements IShape {
	
	private double width;
	
	public Square(double width) {
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return width*width;
	}

	@Override
	public double calculatePerimeter() {
		return width*4;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
