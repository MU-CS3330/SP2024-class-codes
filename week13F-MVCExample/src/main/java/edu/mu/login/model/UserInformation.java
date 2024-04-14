package edu.mu.login.model;

public class UserInformation {
	
	private String username;
	private int age;
	
	public UserInformation(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInformation [username=" + username + ", age=" + age + "]";
	}

}
