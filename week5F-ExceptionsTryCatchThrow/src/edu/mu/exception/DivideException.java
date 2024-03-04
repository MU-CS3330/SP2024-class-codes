package edu.mu.exception;

/**
 * Make sure you extend the Exception class if you are implementing your
 * custom exception class.
 */
public class DivideException extends Exception {
	
	/**
	 * This is a serialization, this allows you to have
	 * quicker access to data.
	 * 
	 * You can have this custom exception class without it but you 
	 * will have warnings. Therefore, the serialVersionUID is generated
	 * by the Eclipse IDE. Or you can generate a default one.
	 */
	private static final long serialVersionUID = -7763563882802258815L;
	private int badInput;
	
	/**
	 * Constructor for the DivideException. It sets the bad input
	 * to its field to be investigated later, and possibly fixing it.
	 * @param msg
	 * @param badInput
	 */
	public DivideException(String msg, int badInput) {
		super(msg);
		this.setBadInput(badInput);
	}

	public int getBadInput() {
		return badInput;
	}

	public void setBadInput(int badInput) {
		this.badInput = badInput;
	}
	
	

}
