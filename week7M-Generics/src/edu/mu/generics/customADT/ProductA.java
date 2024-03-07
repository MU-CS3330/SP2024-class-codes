package edu.mu.generics.customADT;

public class ProductA implements GenericInterface<Integer> {

	@Override
	public void process(Integer data) {
		System.out.println("This is an Integer: " + data);
	}

}
