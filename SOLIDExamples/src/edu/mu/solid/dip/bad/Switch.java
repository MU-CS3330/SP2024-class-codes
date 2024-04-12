package edu.mu.solid.dip.bad;

public class Switch {
	private LightBulb bulb;

	public Switch() {
		this.bulb = new LightBulb();
	}

	public void toggle() {
		// toggle light switch
		if (bulb.isOn()) {
			bulb.turnOff();
		} else {
			bulb.turnOn();
		}
	}
}

