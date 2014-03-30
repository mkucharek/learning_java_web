package pl.krzysh.learningproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.krzysh.learningproject.domain.Student;

@Component
public class SimpleStudentManager implements StudentManager {
	
	@Autowired
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
		
		// Add some students for testing
		for(int i=0; i<5; i++)
		{
			Student student = new Student();
			student.setFirstName("Student"+i);
			student.setSurName("Number"+i);
			this.students.add(student);
		}
	}

}