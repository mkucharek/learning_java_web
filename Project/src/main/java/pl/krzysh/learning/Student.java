package pl.krzysh.learning;

import org.springframework.stereotype.Component;

@Component
public class Student extends User {
	private Classroom classroom;

	public Classroom getClassroom() {
		return this.classroom;
	}
	
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
}
