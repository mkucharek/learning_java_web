package pl.krzysh.learning;

import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class Homework {
	public String name;
	public String description;
	public Course course;
	public HashSet<Solution> solution = new HashSet<Solution>();
	
	public String toString() {
		return "Homework \"" + name + "\" for " + course;
	}

	public void setName(String name) {
		this.name = name;
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

	public void addSolution(Solution solution) {
		solution.homework = this;
		this.solution.add(solution);
	}
}
