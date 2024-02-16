package edu.mu.geometry.shapes;

import edu.mu.geometry.IShape;

public class Rectangle implements IShape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width*height;
	}

	@Override
	public double calculatePerimeter() {
		return (2*width) + (2*height);
	}
	
	
	
}
