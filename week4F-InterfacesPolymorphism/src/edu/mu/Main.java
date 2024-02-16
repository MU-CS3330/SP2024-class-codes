package edu.mu;

import java.util.ArrayList;
import java.util.List;

import edu.mu.geometry.IShape;
import edu.mu.geometry.shapes.Circle;
import edu.mu.geometry.shapes.Rectangle;
import edu.mu.geometry.shapes.Square;

public class Main {

	public static void main(String[] args) {
		//ArrayList<IShape> shapeList = new ArrayList<>();
		/*
		 *  You can limit the things you can do by using List instead of ArrayList
		 *  ArrayList implements many interfaces, so it has access to multiple methods.
		 *  However, if you would like to limit the functions you can do, consider
		 *  assigning you ArrayList object to a List. You will see that you can only
		 *  access and invoke the List methods and not the others.
		 */
		List<IShape> shapeList = new ArrayList<IShape>();
		
		IShape shape = new Rectangle(3, 5);
		shapeList.add(shape);
		System.out.println("Area: " + shape.calculateArea());
		System.out.println("Perimeter: " + shape.calculatePerimeter());
		
		shape = new Square(5);
		shapeList.add(shape);
		System.out.println("Area: " + shape.calculateArea());
		System.out.println("Perimeter: " + shape.calculatePerimeter());
	
		shape = new Circle(2);
		shapeList.add(shape);
		System.out.println("Area: " + shape.calculateArea());
		System.out.println("Perimeter: " + shape.calculatePerimeter());
			
//		shapeList.add(new Rectangle(3, 5));
//		shapeList.add(new Square(5));
	}
}
