package pl.krzysh.learning;

import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class Teacher extends User {
	public HashSet<Course> course = new HashSet<Course>();
}
