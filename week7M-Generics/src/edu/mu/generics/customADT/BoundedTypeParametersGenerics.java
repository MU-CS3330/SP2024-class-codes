package edu.mu.generics.customADT;

import java.util.List;

public class BoundedTypeParametersGenerics <T extends Number> {
	
	public double sumOfAllData(List<T> listOfNumbers) {
		double sum = 0;
		for(T data : listOfNumbers) {
			sum += data.doubleValue();
		}
		return sum;
	}

}
