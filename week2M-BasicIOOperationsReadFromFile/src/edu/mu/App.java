package edu.mu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Naming Conventions
		// Java uses CamelCase, not snake_case
		// Variables, method names they start with lowercase
		// Class names start with uppercase

		
//		Scanner input = new Scanner(System.in); // the "new" keyword is like the malloc, calloc from C
////		String name = input.next();
//		int age = input.nextInt(); // 10"\n"
//		int data = input.nextInt();
		
		/*
		 * you need to add this extra input because it will read the
		 * newline (enter key) as a separate input. With the additional 
		 * nextLine() we get to by pass and discard the newline input and
		 * prevent it from being assigned to the "String name" variable 
		 */
//		input.nextLine();	
//		String name = input.nextLine();
//		//System.out.println("Name: " + name);
//		String jobDefinition = input.nextLine();
//		//System.out.println("Job: " + jobDefinition);
//		
//		System.out.println("Name: " + name);
//		System.out.println("Data: " + data);
//		System.out.println("Job: " + jobDefinition);
//		System.out.println("Age: " + age);
		
		try {
			Scanner fileIn = new Scanner(new FileInputStream("files/data.txt"));
			
			// Read the data separated by whitespaces and new lines
//			while(fileIn.hasNext()) {
//				System.out.println("String token: " + fileIn.next());
//			}
			
			// Read the Data line by line
			while(fileIn.hasNextLine()) {
//				System.out.println("Line: " + fileIn.nextLine());
				String name = fileIn.next();
				int age = fileIn.nextInt();
				System.out.println("Name: " + name + ", Age: " + age);	
			}
			
			/*
			 *  If you are using Scanner for file operations to reset
			 *  the position of the file you need to create a new instance.
			 *  
			 *  Resetting can be done with other file operation classes.
			 */
			
			fileIn = new Scanner(new FileInputStream("files/data.txt"));
			
			while(fileIn.hasNextLine()) {
//				System.out.println("Line: " + fileIn.nextLine());
				String name = fileIn.next();
				int age = fileIn.nextInt();
				System.out.println("Name: " + name + ", Age: " + age);	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
