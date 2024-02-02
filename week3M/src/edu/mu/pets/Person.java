package edu.mu.pets;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private int age;
	private Dog[] dogs; // Dog array
	private ArrayList<Cat> cats; // Cat ArrayList, from Collections framework
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.dogs = new Dog[5];
		this.cats = new ArrayList<Cat>();
	}
	
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
	
	public Dog[] getDogs() {
		return dogs;
	}
	
	public void setDogs(Dog[] dogs) {
		this.dogs = dogs;
	}
	
	public int countDogs() {
		int count = 0;
		for(int i=0; i<dogs.length; i++) {
			if(dogs[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	
	/**
	 * This method adds a Dog object to a Dog array.
	 * The max size of the array is 5, if there is an
	 * available space the method will return true, if
	 * there is no available space it will return false.
	 * @param dog the Dog object to be added into the array
	 * @return return <b>true</b> if the dog is added successfully
	 * to the array, returns <b>false</b> if the dog object wasn't
	 * added to the array because the array is full.
	 */
	public boolean adoptDog(Dog dog) {
		for(int i=0; i<dogs.length; i++) {
			if(dogs[i] == null) {
				dogs[i] = dog;
				return true;
			}
		}
		return false;
	}
	
	public void printListOfDogs() {
		// Print the adopted dogs using foreach loop
//		for(Dog dog : dogs) {
//			if(dog != null) {
//				System.out.println(dog);
//			}
//		}
		
		// Print the adopted dogs using a typical for loop
		for(int i=0; i<dogs.length; i++) {
			if(dogs[i] != null) {
				System.out.println(dogs[i]);
			}
		}
	}
	
	public void printListOfCats() {
//		for(int i=0; i<cats.size(); i++) {
//			System.out.println(cats.get(i));
//		}
		for(Cat cat : cats) {
			System.out.println(cat);
		}
	}

	public ArrayList<Cat> getCats() {
		return cats;
	}

	public void setCats(ArrayList<Cat> cats) {
		this.cats = cats;
	}

}
