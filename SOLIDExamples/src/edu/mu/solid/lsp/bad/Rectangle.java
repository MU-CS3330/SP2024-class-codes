package edu.mu.solid.lsp.bad;

//Bad example: Violating LSP
public class Rectangle {
	protected int width;
	protected int height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}



