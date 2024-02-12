package edu.mu.banking.client;

import java.util.ArrayList;
import java.util.Iterator;

import edu.mu.banking.account.Account;
import edu.mu.banking.account.SavingsAccount;

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

	public boolean closeAllSavingsAccount() {
		boolean flag = false;
//		for(int i=0; i<accounts.size(); i++) {
//			if(accounts.get(i) instanceof SavingsAccount) {
//				accounts.remove(i);
//				flag = true;
//				i--;
//			}
//		}
		
		Iterator<Account> it = accounts.iterator();
		while(it.hasNext()) {
			Account acc = it.next();
			if(acc instanceof SavingsAccount) {
				it.remove();
				flag = true;
			}
		}
		return flag;
	}

	public boolean closeAllAccount() {
		boolean flag = false;
		/*
		 * This could result in ConcurrentModificationException
		 * or IndexOutOfBoundsException, and is not safe. Use an
		 * Iterator for to avoid such exceptions.
		 */
//		for(int i=0; i<accounts.size(); i++) {
//			accounts.remove(i);
//			flag = true;
//		}
//		return flag;
		/*
		 * Use an iterator while removing elements from the ArrayList
		 */
		Iterator<Account> it = accounts.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		return flag;
	}

	public void listOpenAccounts() {
		for(Account acc : accounts) {
			System.out.println("Account: " + acc);
		}
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
