package edu.mu.electronicDevices.devices;

public class SmartTelevision extends ElectronicDevice {
	
	public SmartTelevision() {
		super(OnOffStatus.OFF);
	}

	// Polymorphism change behavior of turnOn() method for SmartTelevision 
	@Override
	public boolean turnOn() {
		if(status == OnOffStatus.OFF) {
			System.out.println("Turning on Smart TV");
			System.out.println("Pressing power button!");
			setStatus(OnOffStatus.ON);
			System.out.println("Your TV is now ON!");
			return true;
		}
		System.out.println("Smart TV already on!");
		return false;
	}
	
	// Polymorphism, change behavior of turnOff() for SmartTelevision
	@Override
	public boolean turnOff() {
		if(status == OnOffStatus.ON) {
			System.out.println("Turning off Smart TV");
			setStatus(OnOffStatus.OFF);
			return true;
		}
		System.out.println("Smart TV already off!");
		return false;
	}

}
