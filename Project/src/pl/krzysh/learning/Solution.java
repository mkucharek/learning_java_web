package pl.krzysh.learning;

public class Solution {
	public Student student;
	public Homework homework;
	public String text;
	
	public Solution(Student student, Homework homework, String text) {
		this.student = student;
		this.homework = homework;
		this.text = text;
		this.homework.solution.add(this);
	}
}
