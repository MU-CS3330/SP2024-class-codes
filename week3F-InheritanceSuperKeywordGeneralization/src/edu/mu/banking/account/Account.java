package edu.mu.banking.account;

/**
 * Create a super/parent class Account
 * 
 * protected members will be visible to classes with 
 * inheritance relationship.
 * 
 * Inheritance allows you to reusability and generalization
 */
public class Account {
	
	private double balanceInDollars = 0;
	protected String accountNumber; // protected members will be visible to the sub-classes
	
//	public Account() {
//		System.out.println("1) Account object created");
//	}

	public Account(int balance, String accountNumber) {
		System.out.println("2) Account object created");
		this.balanceInDollars = balance;
		this.accountNumber = accountNumber;
//		System.out.println();
	}
	
	/**
	 * Deposit money to the account
	 * @param amount
	 * @return returns false if deposit  money is negative or 0. 
	 * Returns true if the deposit is positive.
	 */
	public boolean deposit(int amount) {
		if(amount <= 0) {
			return false;
		}
		balanceInDollars += amount;
		return true;
	}
	
	/**
	 * Withdraw money from the account
	 * @param amount
	 * @return if withdraw money (amount) is negative or 0 return false.
	 * If amount is positive, return true.
	 */
	public boolean withdraw(int amount) {
		if(amount <= 0) {
			return false;
		}
		balanceInDollars -= amount;
		return true;
	}
	
	public void printBalance() {
		System.out.println("Your balance is: $" + balanceInDollars);
	}
	
	public double getBalance() {
		return balanceInDollars;
	}

	public void setBalance(double balance) {
		this.balanceInDollars = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


}
