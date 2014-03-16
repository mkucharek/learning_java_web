package pl.krzysh.learningproject.domain;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Teacher extends User {
	private Set<Course> course;

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}
}
