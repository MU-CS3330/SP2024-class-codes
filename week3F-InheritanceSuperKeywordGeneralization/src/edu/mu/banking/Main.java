package edu.mu.banking;

import edu.mu.banking.account.CheckingAccount;
import edu.mu.banking.account.SavingsAccount;
import edu.mu.banking.client.Client;

public class Main {

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount(0, "12345");
		System.out.println("===== CHECKING ACCOUNT =====");
		checkingAccount.printBalance();
		checkingAccount.deposit(50);
		checkingAccount.printBalance();
		checkingAccount.withdraw(10);
		checkingAccount.printBalance();
		
		
		System.out.println("===== SAVINGS ACCOUNT =====");
		SavingsAccount savingsAccount = new SavingsAccount(100, "54321", 0.01);
		savingsAccount.printBalance();
		savingsAccount.deposit(1000);
		savingsAccount.printBalance();
		savingsAccount.addInterest();
		savingsAccount.printBalance();
		
		Client client = new Client("Ekin");
		// Adding the accounts to the client
		client.getAccounts().add(checkingAccount);
		client.getAccounts().add(savingsAccount);
	}
}
