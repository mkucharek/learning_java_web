package pl.krzysh.learning;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private Classroom classroom;
	private Teacher teacher;
	private Subject subject;
	private Set<Homework> homework;

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public Subject getSubject() {
		return this.subject;
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Set<Homework> getHomework() {
		return homework;
	}

	public void setHomework(Set<Homework> homework) {
		this.homework = homework;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
