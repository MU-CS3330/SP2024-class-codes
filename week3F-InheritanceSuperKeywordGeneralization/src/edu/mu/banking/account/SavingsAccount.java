package edu.mu.banking.account;

public class SavingsAccount extends Account {

	/*
	 *  SavingsAccount is a specialized type of account.
	 *  So, a private member interestRate is added, that will
	 *  be only specific to this class.
	 */
	private double interestRate;

	/*
	 *  super keyword allows you to invoke a specific
	 *  constructor of the parent class. If super is not
	 *  used it will invoke the default constructor of the
	 *  parent/inherited class (if exists).
	 *  
	 *  The child class constructor will always invoke the 
	 *  super/parent class constructor. Therefore, whenever
	 *  a child class object is instantiated a parent class 
	 *  object will always be created first!
	 */
	public SavingsAccount(int balance, String accountNumber, double interestRate) {
		super(balance, accountNumber);
		this.interestRate = interestRate;
	}

	/*
	 * methods (deposit, withdraw) from the Account class 
	 * will also be usable for this class because of the 
	 * inheritance relationship.
	 */
	
	/**
	 * This will add interest to your current balance
	 * @return
	 */
	public boolean addInterest() {
		if(interestRate > 0) {
			double newBalance = getBalance() + getBalance() * interestRate;
			setBalance(newBalance);
			return true;
		}
		return false;
	}

}
