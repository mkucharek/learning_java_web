package pl.krzysh.learning;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Classroom {
	private String name;
	private Set<Course> course;
	private Set<Student> student;

	@Override
	public String toString() {
		return name;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
