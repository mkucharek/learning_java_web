package pl.krzysh.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		Subject subject = (Subject) context.getBean("subject");
		subject.setName("English");
		
		Classroom classroom = (Classroom) context.getBean("classroom");
		classroom.setName("3f");
		
		Teacher teacher = (Teacher) context.getBean("teacher");
		teacher.setName("Abc", "Def");
		
		Student student = (Student) context.getBean("student");
		student.setName("Ghi", "Jkl");
		classroom.addStudent(student);
		
		Course course = (Course) context.getBean("course");
		course.setSubject(subject);
		course.assignTeacher(teacher);
		classroom.addCourse(course);
		
		Homework homework = (Homework) context.getBean("homework");
		homework.setName("Do something");
		homework.setDescription("something, something, something...");
		course.addHomework(homework);
		
		
		Solution solution = (Solution) context.getBean("solution");
		solution.setStudent(student);
		solution.setText("This is my solution");
		homework.addSolution(solution);
		
		System.out.println(solution);
	}
}
