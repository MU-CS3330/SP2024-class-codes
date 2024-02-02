package edu.mu;

import edu.mu.pets.Cat;
import edu.mu.pets.Dog;
import edu.mu.pets.Person;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Ekin", 20);
		
		System.out.println(p1.getName() + " has " + p1.countDogs() + " dogs.");
		Dog emma = new Dog("Emma", 7, "Lab mix");
		p1.adoptDog(emma);
		System.out.println(p1.getName() + " has " + p1.countDogs() + " dogs.");
		p1.printListOfDogs();
		
		System.out.println("Number of cats: " + p1.getCats().size());
		Cat peanut = new Cat("Peanut", 13, "Brown Tabby");
		p1.getCats().add(peanut);
		System.out.println("Number of cats: " + p1.getCats().size());
		System.out.println(p1.getCats().get(0));
		Cat otis = new Cat("Otis", 5, "Black cat");
		p1.getCats().add(otis);
		System.out.println("Number of cats: " + p1.getCats().size());
		p1.printListOfCats();
//		p1.getCats().remove(1);
//		System.out.println("Number of cats: " + p1.getCats().size());
//		p1.getCats().remove(otis);
//		p1.getCats().remove(peanut);
//		System.out.println("Number of cats: " + p1.getCats().size());
		
	}

}
