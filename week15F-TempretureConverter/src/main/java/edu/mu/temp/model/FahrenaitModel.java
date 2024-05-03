package edu.mu.temp.model;

public class FahrenaitModel implements ITempratureUnit {
	
	private double temprature;
	
	public FahrenaitModel(double temp) {
		setTempratureValue(temp);
	}

	@Override
	public void setTempratureValue(double newTemp) {
		this.temprature = newTemp;
	}

	@Override
	public double getTemprature() {
		return temprature;
	}

	@Override
	public CelsiusModel toCelsius() {
		double celsiusTemp = (temprature - 32) / 1.8;
		return new CelsiusModel(celsiusTemp);
	}

	@Override
	public FahrenaitModel toFahrenait() {
		return this;
	}

}
