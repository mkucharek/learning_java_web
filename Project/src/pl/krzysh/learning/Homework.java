package pl.krzysh.learning;

import java.util.HashSet;

public class Homework {
	public String name;
	public String description;
	public Course course;
	public HashSet<Solution> solution = new HashSet<Solution>();
	
	public Homework(Course course, String name, String description) {
		this.name = name;
		this.description = description;
		this.course = course;
		this.course.homework.add(this);
	}
}
