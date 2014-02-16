package pl.krzysh.learning;

import org.springframework.stereotype.Component;

@Component
public class Student extends User {
	public Classroom classroom;
	
	public String toString() {
		return super.toString() + " (class: " + classroom + ")";
	}
	
	public Classroom getClassroom() {
		return this.classroom;
	}
}
