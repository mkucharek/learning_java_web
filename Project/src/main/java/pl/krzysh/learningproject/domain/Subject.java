package pl.krzysh.learningproject.domain;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	private String name;
	
	@Override
	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
