package pl.krzysh.learning;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		Random random = new Random();
		
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
		
		Student student = null;
		for(int i=0; i<5; i++) {
			student = new Student(); // = (Student) context.getBean("student")
			student.setName(generateName(random), generateName(random));
			student.setClassroom(classroom);
			classroom.addStudent(student);
		}
		
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
		
		System.out.println(new TreeSet<Student>(classroom.getStudent()));
		
		/*System.out.println(subject);
		System.out.println(classroom);
		System.out.println(teacher);
		System.out.println(course);
		System.out.println(homework);
		System.out.println(solution);*/
	}
	
	// http://stackoverflow.com/questions/2863852/how-to-generate-a-random-string-in-java
	private static String generateString(Random random, String characters, int length)
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(random.nextInt(characters.length()));
	    }
	    return new String(text);
	}
	
	private static String generateName(Random random)
	{
		return generateString(random, "ABCDEFGHIJKLMNOPQRSTUWXYZ", 1) + generateString(random, "abcdefghijklmnopqrstuwxyz", 4+random.nextInt(6));
	}
}
