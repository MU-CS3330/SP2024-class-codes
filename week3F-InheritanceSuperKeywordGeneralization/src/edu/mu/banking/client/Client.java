package edu.mu.banking.client;

import java.util.ArrayList;

import edu.mu.banking.account.Account;

public class Client {
	
	private String name;
	/*
	 *  Create an Account type ArrayList member.
	 *  This will allow generalization and will allow
	 *  adding other accounts that has an "is-a" (inheritance)
	 *  relationship. You do not have to create a separate field
	 *  to have a SavingsAccount or a CheckingAccount.
	 */
	private ArrayList<Account> accounts;
	
	public Client(String name) {
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	

}
