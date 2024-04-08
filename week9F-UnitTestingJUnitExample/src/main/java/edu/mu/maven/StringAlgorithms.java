package edu.mu.maven;

public class StringAlgorithms {
	
	public StringAlgorithms() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPalindrome(String input) {
		// Logic to check if input is a palindrome
		return new StringBuilder(input).reverse().toString().equals(input);
	}
}
