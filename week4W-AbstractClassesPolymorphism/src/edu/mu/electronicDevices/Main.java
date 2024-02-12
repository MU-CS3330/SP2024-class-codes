package edu.mu.electronicDevices;

import edu.mu.electronicDevices.devices.ElectronicDevice;
import edu.mu.electronicDevices.devices.SmartPhone;
import edu.mu.electronicDevices.devices.SmartTelevision;
import edu.mu.electronicDevices.users.ElectronicDeviceUser;

public class Main {

	public static void main(String[] args) {
		
		ElectronicDeviceUser user1 = new ElectronicDeviceUser();
		ElectronicDevice smartPhone = new SmartPhone("Apple", "IPhone 2");
		
//		user1.getDevicesOwned().add(smartPhone); // This is a bad way to add an object to a list
		user1.addElectronicDeviceToUser(smartPhone);
		user1.addElectronicDeviceToUser(new SmartTelevision());
		
		user1.turnOnAllDevices();
		user1.turnOffAllDevices();
	}
}
