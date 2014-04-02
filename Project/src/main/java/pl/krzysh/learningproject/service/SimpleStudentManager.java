package pl.krzysh.learningproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.krzysh.learningproject.domain.Student;

@Component
public class SimpleStudentManager implements StudentManager {
	
	private List<Student> students = new ArrayList<Student>();
	
	public SimpleStudentManager() {
		// Add some students for testing
		for(int i=0; i<5; i++)
		{
			Student student = new Student();
			student.setFirstName("Student"+i);
			student.setSurName("Number"+i);
			this.students.add(student);
		}
	}

	public List<Student> getStudents() {
		return students;
	}

}