package edu.mu;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("First code for CS3330");
		System.out.println("Hello!");
		
		/*
		 *  String types are not mutable, to apply 
		 *  the changes you have to reassign them.
		 */
		String name = "Ekincan Ufuktepe";
		String anotherName = "ekincan ufuktepe";

		System.out.println("Name: " + name.toUpperCase());
		//name = name.toUpperCase();
		System.out.println("Name: " + name);
		
		if(name.equalsIgnoreCase(anotherName)) {
			System.out.println("This is the professor");
		}
		else {
			System.out.println("This is NOT the professor!");
		}
		
		System.out.println("Removing whitespaces: " + name.replace(" ", ""));
		
		int age = 10;
		int incrementor = 1;
		
		// The '+' operator is used for String concatenation and arithmetic addition
		System.out.println("Name: " + name + ", age: " + (age + incrementor));
		System.out.printf("%d %d", age , incrementor);
		
		// In Java control statements needs to be boolean,
		// not integers like we had in C.
		if(age == 10) {
			System.out.println("Hey there little boy!");
		}
		
		// Initialize an integer aray
		int array[] = {1,2,3,4,5};
		
		for(int i=0; i<array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
	}

}
