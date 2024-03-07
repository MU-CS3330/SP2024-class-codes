package edu.mu.generics.customADT;

import java.util.List;

public class WildcardMethodGenericExample {
	
	public double average(List<? extends Number> listOfNumbers) {
		double sum = 0;
		double average = 0.0;
		for(Number data : listOfNumbers) {
			sum += data.doubleValue();
		}
		average = sum/listOfNumbers.size();
		return average;
	}
	
	
	public <T> void copy(List<T> src,  List<? super T> dst) {
		for(T data : src) {
			dst.add(data);
		}
	}

}
