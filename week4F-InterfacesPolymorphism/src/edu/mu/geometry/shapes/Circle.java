package edu.mu.geometry.shapes;

import edu.mu.geometry.IShape;

public class Circle implements IShape {
	
	private double radius;
	// private final static double piValue = 3.0;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		// pi*r^2
		double area = radius*radius*Math.PI;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		// return piValue*radius*2;
		return Math.PI*radius*2;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
