package edu.mu.electronicDevices.devices;

public class SmartPhone extends ElectronicDevice {
	
	private double battery = 0.0;
	private String brand;
	private String model;
	
	public SmartPhone(String brand, String model) {
//		super();
		/*
		 * sets the status to OFF when a smart phone 
		 * object is created, and uses the parameterized
		 * constructor to initialize the status.
		 */
		super(OnOffStatus.OFF); 
		this.brand = brand;
		this.model = model;
	}

	/*
	 * Polymorphism example where method from super class
	 * is overridden to change its behavior, when it is 
	 * SmartPhone.
	 */
	@Override
	public boolean turnOn() {
		if(status == OnOffStatus.OFF) {
			System.out.println("Turning on Smart phone");
			System.out.println("Pressing Power button for 2 secs.");
			int timer = 1;
			// Wait for 2 seconds to turn on
			for(int i=0; i<2; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Seconds: " + timer++);
			}
			System.out.println("Your smart phone is now ON!");
			setStatus(OnOffStatus.ON);
			return true;
		}
		System.out.println("Smart Phone already on!");
		return false;
	}
	
	/*
	 * Polymorphism: Changing the default behavior of
	 * turnOff() method for SmartPhone.
	 */
	@Override
	public boolean turnOff() {
		if(status == OnOffStatus.ON) {
			System.out.println("Turning off Smart phone");
			setStatus(OnOffStatus.OFF);
			return true;
		}
		System.out.println("Smart Phone already off!");
		return false;
	}
	
	public void displayBatteryLevel() {
		System.out.println("Battery level of Smart phone: " + battery );
	}
	
	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
