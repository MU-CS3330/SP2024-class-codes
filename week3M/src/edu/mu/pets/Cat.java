package edu.mu.pets;

public class Cat {
	
	private String name;
	private int age;
	private String breed;
	
	public Cat(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Cat catObj = (Cat)obj;
		if(this.age == catObj.getAge() &&
				this.breed.equals(catObj.getBreed()) &&
				this.name.equals(catObj.getName())) {
			System.out.println("Cat found!");
			return true;
		}
		System.out.println("Cat not found!");
		return false;
	}
	
}
