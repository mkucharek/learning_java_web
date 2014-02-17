package pl.krzysh.learning;

import org.springframework.stereotype.Component;

@Component
public class Solution {
	private Student student;
	private Homework homework;
	private String text;

	@Override
	public String toString() {
		return text;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Student getStudent() {
		return this.student;
	}

	public void setHomework(Homework homework) {
		this.homework = homework;
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
