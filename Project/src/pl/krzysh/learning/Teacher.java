package pl.krzysh.learning;

import java.util.HashSet;

public class Teacher extends User {
	public HashSet<Course> course = new HashSet<Course>();
	
	public Teacher(String firstName, String surName) {
		super(firstName, surName);
	}
}
