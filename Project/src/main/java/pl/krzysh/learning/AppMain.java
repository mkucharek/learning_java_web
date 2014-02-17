package pl.krzysh.learning;

import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		Subject subject = (Subject) context.getBean("subject");
		subject.setName("English");
		
		Classroom classroom = (Classroom) context.getBean("classroom");
		classroom.setName("3f");
		classroom.setStudent(new HashSet<Student>());
		classroom.setCourse(new HashSet<Course>());
		
		Teacher teacher = (Teacher) context.getBean("teacher");
		teacher.setName("Abc", "Def");
		teacher.setCourse(new HashSet<Course>());
		
		Student student = (Student) context.getBean("student");
		student.setName("Ghi", "Jkl");
		student.setClassroom(classroom);
		classroom.getStudent().add(student);
		
		Course course = (Course) context.getBean("course");
		course.setHomework(new HashSet<Homework>());
		course.setSubject(subject);
		course.setTeacher(teacher);
		teacher.getCourse().add(course);
		classroom.getCourse().add(course);
		
		Homework homework = (Homework) context.getBean("homework");
		homework.setName("Do something");
		homework.setDescription("something, something, something...");
		homework.setCourse(course);
		homework.setSolution(new HashSet<Solution>());
		course.getHomework().add(homework);
		
		Solution solution = (Solution) context.getBean("solution");
		solution.setStudent(student);
		solution.setText("This is my solution");
		solution.setHomework(homework);
		homework.getSolution().add(solution);
	}
}
