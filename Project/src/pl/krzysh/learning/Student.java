package pl.krzysh.learning;

public class Student extends User {
	public Classroom classroom;
	
	public Student(String firstName, String surName, Classroom classroom) {
		super(firstName, surName);
		this.classroom = classroom;
		this.classroom.student.add(this);
	}
	
	public String toString() {
		return super.toString() + " (class: " + classroom + ")";
	}
}
