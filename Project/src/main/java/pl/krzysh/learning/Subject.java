package pl.krzysh.learning;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	public String name;
	
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
