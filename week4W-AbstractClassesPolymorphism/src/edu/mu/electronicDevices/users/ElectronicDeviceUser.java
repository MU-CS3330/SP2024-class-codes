package edu.mu.electronicDevices.users;

import java.util.ArrayList;

import edu.mu.electronicDevices.devices.ElectronicDevice;
import edu.mu.electronicDevices.devices.OnOffStatus;

public class ElectronicDeviceUser {

	private ArrayList<ElectronicDevice> devicesOwned;

	public ElectronicDeviceUser() {
		devicesOwned = new ArrayList<ElectronicDevice>();
	}

	public boolean addElectronicDeviceToUser(ElectronicDevice device) {
		if(device != null) {
			devicesOwned.add(device);
			return true;
		}
		return false;
	}

	public ArrayList<ElectronicDevice> getDevicesOwned() {
		return devicesOwned;
	}

	public void setDevicesOwned(ArrayList<ElectronicDevice> devicesOwned) {
		this.devicesOwned = devicesOwned;
	}

	public void turnOnAllDevices() {
		for(ElectronicDevice device : devicesOwned) {
			if(device.getStatus() == OnOffStatus.OFF) {
				device.turnOn();
			}
		}
	}

	public void turnOffAllDevices() {
		for(ElectronicDevice device : devicesOwned) {
			if(device.getStatus() == OnOffStatus.ON) {
				device.turnOff();
			}
		}
	}
	
}
