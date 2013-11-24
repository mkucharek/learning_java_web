package pl.krzysh.learning;

import java.util.HashSet;

public class Course {
	public Classroom classroom;
	public Teacher teacher;
	public Subject subject;
	public HashSet<Homework> homework = new HashSet<Homework>();
	
	public Course(Subject subject, Teacher teacher, Classroom classroom) {
		this.subject = subject;
		this.teacher = teacher;
		this.classroom = classroom;
		this.classroom.course.add(this);
		this.teacher.course.add(this);
	}
	
	public String toString() {
		return teacher + "'s " + subject + " course for class " + classroom;
	}
}
