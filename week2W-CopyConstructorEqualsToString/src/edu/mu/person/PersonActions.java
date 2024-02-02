package edu.mu.person;

public class PersonActions {
	
	public PersonActions() {
		
	}
	
	public void introduceYourself(Person person) {
		System.out.println("Hello I am " + person.getName() + ", Age:" + person.getAge());
	}
	
	public Person timeTravel(Person person, int years) {
		int age = person.getAge();
		person.setAge(age + years);
		// when returning object use the copy constructor
		// to prevent information leaks.
		return new Person(person);
	}

}
