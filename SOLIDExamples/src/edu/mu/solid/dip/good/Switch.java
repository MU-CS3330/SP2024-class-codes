package edu.mu.solid.dip.good;

public class Switch {
	private Switchable device;

	public Switch(Switchable device) {
		this.device = device;
	}

	public void toggle() {
		// toggle switch
		if (device.isOn()) {
			device.turnOff();
		} else {
			device.turnOn();
		}
	}
}
