package edu.mu.observer.model;

import java.util.Observable;

/**
 * Defining a button subject model class that
 * keeps a boolean button status.
 */
public class ButtonSubjectModel extends Observable {
	
	private boolean btnStatus;
	
	/**
	 * Set button status to false by default
	 * when a ButtonSubjectModel object is 
	 */
	public ButtonSubjectModel() {
		this.btnStatus = false;
	}
	
	/**
	 * Every time the button is toggled it will
	 * return its flipped status.
	 */
	public boolean toggleButton() {
		btnStatus = !btnStatus;
		setChanged();
		notifyObservers();
		return btnStatus;
	}
	
	public boolean getButtonStatus() {
		return btnStatus;
	}
}
