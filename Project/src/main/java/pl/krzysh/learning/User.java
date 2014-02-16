package pl.krzysh.learning;

public abstract class User {
	public String firstName;
	public String surName;
	
	public String toString() {
		return firstName + " " + surName;
	}
	
	public void setName(String firstName, String surName) {
		this.firstName = firstName;
		this.surName = surName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getSurName() {
		return this.surName;
	}
}
