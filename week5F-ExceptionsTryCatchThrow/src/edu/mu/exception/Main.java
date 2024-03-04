package edu.mu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean flag = true;
		
		/*
		 * Solution #1
		 * Ask for the input again if not valid
		 */
		while(flag) {
			try {
				System.out.println("Enter x:");
				int x = input.nextInt();
				System.out.println("Enter y:");
				int y = input.nextInt();
				System.out.println("Result: " + divide(x,y));
				flag = false;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// Solution #2
		try {
			System.out.println("Enter x:");
			int x = input.nextInt();
			System.out.println("Enter y:");
			int y = input.nextInt();
			System.out.println("Result: " + divide(x,y));
			flag = false;
		} catch (DivideException e) {
			System.out.println("This is the problem causing input: " + e.getBadInput());
			e.printStackTrace();
		} 

		//		int number = -1;
		//		
		//		try {
		//			number = input.nextInt();
		//		}
		//		catch(InputMismatchException e) {
		//			System.out.println("you didn't enter an integer!! Dummy!");
		//			number = 0;
		//		}
		//		System.out.println("Number: " + number);
	}

	private static int divide(int x, int y) throws DivideException {
		if(y == 0) {
//			throw new Exception("You are trying to divide this by 0 (ZERO) you dummy!");
			throw new DivideException("You are trying to divide this by 0 (ZERO) you dummy!", y);
		}
		System.out.println("Passed the exception!");
		return x/y;
	}

}
