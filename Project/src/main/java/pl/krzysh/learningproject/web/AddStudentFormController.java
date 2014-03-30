package pl.krzysh.learningproject.web;

import javax.servlet.ServletException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import pl.krzysh.learningproject.domain.Student;
import pl.krzysh.learningproject.service.AddStudent;
import pl.krzysh.learningproject.service.AddStudentValidator;
import pl.krzysh.learningproject.service.StudentManager;

@Controller
public class AddStudentFormController {

	@Autowired
	private StudentManager studentManager;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new AddStudentValidator());
	}

	@RequestMapping(value = "/addstudent.htm", method = RequestMethod.POST)
	public ModelAndView onSubmit(
			@Valid @ModelAttribute("addStudent") AddStudent addStudent)
			throws ServletException {

		Student student = new Student();
		student.setName(addStudent.getFirstName(), addStudent.getSurName());
		studentManager.getStudents().add(student);

		return new ModelAndView(new RedirectView("hello.htm"));
	}

	@RequestMapping(value = "/addstudent.htm", method = RequestMethod.GET)
	public ModelAndView onShowForm() throws ServletException {

		ModelMap model = new ModelMap();
		AddStudent addStudent = new AddStudent();
		addStudent.setFirstName("First Name");
		addStudent.setSurName("Sur Name");
		model.addAttribute("addStudent", addStudent);

		return new ModelAndView("addstudent", model);
	}

	public StudentManager getStudentManager() {
		return studentManager;
	}

	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

}