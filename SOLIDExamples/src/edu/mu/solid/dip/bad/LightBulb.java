package edu.mu.solid.dip.bad;

//Bad example: High-level module depends on low-level module
public class LightBulb {
	public void turnOn() {
		// turn on light bulb
	}
	
	public void turnOff() {
		// turn off light bulb
	}
	
	public boolean isOn() {
		return false;
	}
	
	public boolean isOff() {
		return false;
	}
}

