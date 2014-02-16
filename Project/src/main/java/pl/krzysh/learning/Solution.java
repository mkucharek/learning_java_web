package pl.krzysh.learning;

import org.springframework.stereotype.Component;

@Component
public class Solution {
	public Student student;
	public Homework homework;
	public String text;
	
	public String toString() {
		return student + "'s solution for " + homework;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Student getStudent() {
		return this.student;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
	public Homework getHomework() {
		return this.homework;
	}
}
