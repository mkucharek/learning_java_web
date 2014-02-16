package pl.krzysh.learning;

import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class Classroom {
	public String name;
	public HashSet<Course> course = new HashSet<Course>();
	public HashSet<Student> student = new HashSet<Student>();
	
	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void addStudent(Student student) {
		student.classroom = this;
		this.student.add(student);
	}

	public void addCourse(Course course) {
		course.classroom = this;
		this.course.add(course);
	}
}
