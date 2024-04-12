package edu.mu.solid.lsp.good;

public class Square extends Shape {
	protected int side;

	public int area() {
		return side * side;
	}
}