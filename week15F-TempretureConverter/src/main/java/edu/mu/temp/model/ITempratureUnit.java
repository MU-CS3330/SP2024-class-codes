package edu.mu.temp.model;

public interface ITempratureUnit {
	
	public void setTempratureValue(double newTemp);
	public double getTemprature();
	public CelsiusModel toCelsius();
	public FahrenaitModel toFahrenait();

}
