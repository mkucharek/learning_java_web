package pl.krzysh.learning;

public class AppMain {
	public static void main(String[] args) {
		Subject subject = new Subject("English");
		Classroom classroom = new Classroom("3f");
		Teacher teacher = new Teacher("Abc", "Def");
		Student student = new Student("Ghi", "Jkl", classroom);
		Course course = new Course(subject, teacher, classroom);
		
		Homework homework = new Homework(course, "Do something", "something, something, something...");
		Solution solution = new Solution(student, homework, "This is my solution");
	}
}
