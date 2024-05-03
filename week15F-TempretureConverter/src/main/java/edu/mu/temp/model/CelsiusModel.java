package edu.mu.temp.model;

import java.util.Observable;

public class CelsiusModel extends Observable implements ITempratureUnit {
	
	private double temprature;
	
	public CelsiusModel(double temp) {
		setTempratureValue(temp);
	}
	
	/**
	 * Adds to integer values.
	 * @param a <b>int</b> 
	 * @param b <b>int</b>
	 * @return <b>int</b>
	 */
	public int add(int a, int b) {
		return a+b;
	}


	@Override
	public void setTempratureValue(double newTemp) {
		this.temprature = newTemp;
		setChanged();
		notifyObservers();
	}

	@Override
	public double getTemprature() {
		return temprature;
	}

	@Override
	public CelsiusModel toCelsius() {
		return this;
	}

	@Override
	public FahrenaitModel toFahrenait() {
		double fahrenaitTemp = (temprature * 1.8) + 32;
		return new FahrenaitModel(fahrenaitTemp);
	}
}
