package edu.mu.banking.account;

/**
 * CheckingAccount is a subclass/child class of Account.
 * The "extends" keyword allow you to inherit a class.
 */
public class CheckingAccount extends Account {

	public CheckingAccount(int balance, String accountNumber) {
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
		super(balance, accountNumber);
		System.out.println("Checking account object created!");
	}
	
}
