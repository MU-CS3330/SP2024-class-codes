package edu.mu.banking;

import edu.mu.banking.account.Account;
import edu.mu.banking.account.CheckingAccount;
import edu.mu.banking.account.SavingsAccount;
import edu.mu.banking.client.Client;

public class Main {

	public static void main(String[] args) {
		CheckingAccount ca1 = new CheckingAccount(1, "222");
		CheckingAccount ca2 = new CheckingAccount(1, "3333");
		SavingsAccount sa1 = new SavingsAccount(10, "444", 0.2);
		SavingsAccount sa2 = new SavingsAccount(10, "555", 0.2);
		
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
		client.getAccounts().add(sa2);
		client.getAccounts().add(ca1);
		client.getAccounts().add(ca2);
		client.getAccounts().add(sa1);
		
		int checkingAccountCount = 0;
		int savingsAccountCount = 0;
		
		for(Account acc : client.getAccounts()) {
			// instanceof example
			if(acc instanceof CheckingAccount) {
				System.out.println("This is a Checking Account: " + acc);
			}
			
			//System.out.println("Account Class: " + acc.getClass());
			if(acc.getClass() == CheckingAccount.class) {
				//System.out.println("Found Checking Account: "+ acc.toString());
				checkingAccountCount++;
			}
			else if(acc.getClass() == SavingsAccount.class) {
				savingsAccountCount++;
			}
			System.out.println("You have: ");
			System.out.println(checkingAccountCount + " open Checking Accounts");
			System.out.println(savingsAccountCount + " open Savings Accounts");
		}
		
		System.out.println("Before deposit on all accounts");
		client.listOpenAccounts();
		
		for(Account account : client.getAccounts()) {
			account.deposit(100);
		}
		
		System.out.println("After deposit on all accounts");
		client.listOpenAccounts();
		
//		System.out.println("Before closing");
//		client.listOpenAccounts();
//		client.closeAllSavingsAccount();
//		System.out.println("After closing");
//		client.listOpenAccounts();
//		client.closeAllAccount();
//		client.listOpenAccounts();
		
	}
}
