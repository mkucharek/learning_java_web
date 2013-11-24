package pl.krzysh.learning;

public abstract class User {
	public String firstName;
	public String surName;
	
	public User(String firstName, String surName) {
		this.firstName = firstName;
		this.surName = surName;
	}
	
	public String toString() {
		return firstName + " " + surName;
	}
}
