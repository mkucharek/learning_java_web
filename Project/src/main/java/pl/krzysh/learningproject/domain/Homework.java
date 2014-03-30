package pl.krzysh.learningproject.domain;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Homework {
	private String name;
	private String description;
	private Course course;
	private Set<Solution> solution;

	@Override
	public String toString() {
		return name + ": " + description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Set<Solution> getSolution() {
		return solution;
	}

	public void setSolution(Set<Solution> solution) {
		this.solution = solution;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
