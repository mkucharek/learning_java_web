package pl.krzysh.learning;

import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class Course {
	public Classroom classroom;
	public Teacher teacher;
	public Subject subject;
	public HashSet<Homework> homework = new HashSet<Homework>();
	
	public String toString() {
		return teacher + "'s " + subject + " course for class " + classroom;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public Subject getSubject() {
		return this.subject;
	}

	public void assignTeacher(Teacher teacher) {
		if(this.teacher != null) this.teacher.course.remove(this);
		this.teacher = teacher;
		this.teacher.course.add(this);
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}

	public void addHomework(Homework homework) {
		homework.course = this;
		this.homework.add(homework);
	}
}
