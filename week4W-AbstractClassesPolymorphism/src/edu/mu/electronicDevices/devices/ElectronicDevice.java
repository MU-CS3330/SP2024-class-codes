package edu.mu.electronicDevices.devices;

public abstract class ElectronicDevice {
	
	protected OnOffStatus status;
	
	/*
	 * You can implement constructors for abstract classes.
	 * However, you cannot instantiate an abstract class.
	 * The constructor will only be invoke by its child classes,
	 * where there is an inheritance relationship.
	 */
	public ElectronicDevice() {
		
	}
	
	public ElectronicDevice(OnOffStatus status) {
		this.status = status;
	}
	
	public abstract boolean turnOn();
	
	public boolean turnOff() {
		return false;
	}

	public OnOffStatus getStatus() {
		return status;
	}

	public void setStatus(OnOffStatus status) {
		this.status = status;
	}
}
