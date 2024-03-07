package edu.mu.generics.customADT;

public class ProductB implements GenericInterface<String>{

	@Override
	public void process(String data) {
		System.out.println("This is a String: " + data);
	}

}
