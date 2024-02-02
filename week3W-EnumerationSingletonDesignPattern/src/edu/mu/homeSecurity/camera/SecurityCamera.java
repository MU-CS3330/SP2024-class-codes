package edu.mu.homeSecurity.camera;

import java.util.Random;

import edu.mu.homeSecurity.logger.LoggerSingleton;

public class SecurityCamera {

	private int id;
	private Location location; // Set the location from the Location enum class
	
	public SecurityCamera(int id, Location location) {
		this.id = id;
		this.location = location;
	}
	
	public boolean monitor() {
		Random rand = new Random();
		// Randomly decide if a there is an object detected
		if(rand.nextBoolean()) {
			int numOfDetectableObjects = DetectedObjectType.values().length;
			// Randomly decide what object is detected from the enum
			DetectedObjectType obj = DetectedObjectType.values()[rand.nextInt(numOfDetectableObjects)];
			System.out.println("Camera #" + id + " detected " + obj.name());
			// Prepare the security camera log data
			String message = "Camera #" + id + " detected " + obj.name() + ", at " + location.name() + "\n";
			// pass the log data to the logger 
			// Here, each security camera object uses the same LoggerSingleton instance.
			// You can directly access the getInstance() method without creating
			// and object because it is static and also public.
			LoggerSingleton.getInstance().logData(message);
			return true;
		}
		System.out.println("Nothing detected!");
		return false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "SecurityCamera [id=" + id + ", location=" + location + "]";
	}
}
