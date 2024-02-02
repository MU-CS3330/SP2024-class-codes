package edu.mu;

import edu.mu.person.Person;
import edu.mu.person.PersonActions;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(); // Create a Person object
		p1.setName("Frodo"); // set the fields of 
		p1.setAge(10);
		p1.setHeight(6);
//		p1.name = "Ekincan";
//		p1.age = 10;
//		p1.height = 6;
//		
//		Person p2 = new Person();
//		p2.name = "Ekincan";
//		p2.age = 10;
//		p2.height = 6;
		
		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());
		System.out.println("P1 Object: " + p1.toString());
		System.out.println("P1 Object: " + p1);
		p1.introduce();
		
//		Person p2 = new Person("Ekincan", 12);
		Person p2 = new Person("Gandalf", 11, 6);
		p2.introduce();
		System.out.println("John's age: " + p2.getHeight());
//		p2.setName("John");
//		p2.setAge(12);
		System.out.println("Expecting Frodo here: " + p1.getName());
		
		
		if(p1.equals(p2)) {
			System.out.println("These Person objects are the same");
		}
		else { 
			System.out.println("These Person objects are different");
		}
//		System.out.println("P2 Object: " + p2);
		
//		if((p1.age == p2.age) && 
//				(p1.name.equals(p2.name)) && 
//				(p1.height == p2.height)) {
//			System.out.println("These objects are the same!");
//		}
//		else {
//			System.out.println("These objects are different!");
//		}
		
		Person aragorn = new Person("Aragorn", 78, 6);
		System.out.println("Aragorn is " + aragorn.getAge() + " years old.");
		PersonActions actions = new PersonActions();
		actions.introduceYourself(aragorn);
		
		Person copyCatOfAragorn = actions.timeTravel(aragorn, 3);
		actions.introduceYourself(aragorn);
		actions.timeTravel(copyCatOfAragorn, 5);
		actions.introduceYourself(aragorn);
		
		System.out.println(aragorn);
		System.out.println(copyCatOfAragorn);
		
	}

}
