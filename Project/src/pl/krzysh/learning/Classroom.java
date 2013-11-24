package pl.krzysh.learning;

import java.util.HashSet;

public class Classroom {
	public String name;
	public HashSet<Course> course = new HashSet<Course>();
	public HashSet<Student> student = new HashSet<Student>();
	
	public Classroom(String name) {
		this.name = name;
	}
}
