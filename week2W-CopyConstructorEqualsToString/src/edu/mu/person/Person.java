package edu.mu.person;

public class Person {
	
	/* Setting default values to fields if
	 * they are not initialized by the constructor
	 */
	private String name = "Dummy";
	private int age = -1;
	private int height = -1;
	
	// Default constructor
	public Person() {
		
	}
	
	// Parameterized constructor
	public Person(String name) {
		this.name = name;
	}
	// Parameterized constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// Parameterized constructor
	public Person(String name, int age, int height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}
	
	/*
	 * Copy Constructor example
	 */
	public Person(Person personObj) {
		this.age = personObj.getAge();
		this.height = personObj.getHeight();
		this.name = personObj.getName();
	}
	
	// setter and getter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void introduce() {
		System.out.println("Hello my name is " + name + ", and I am " + age + " years old!");
	}

	// toString method to print the object in String format
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
//	}
	
	/*
	 * equals method exists in every class (just like the toString)
	 * method, by overriding it you can implement the 
	 * equals method in a way to compare the class
	 * objects if they are equal or not.
	 */
	@Override
	public boolean equals(Object obj) {
		Person p = ((Person)obj);
		if(this.name.equals(p.getName()) && 
				this.age == p.getAge() &&
				this.height == p.getHeight()) {
			return true;
		}
		return false;
	}
}
