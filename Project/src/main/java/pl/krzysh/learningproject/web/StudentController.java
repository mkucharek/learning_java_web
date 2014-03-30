package pl.krzysh.learningproject.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.krzysh.learningproject.service.StudentManager;

@Controller
public class StudentController {

	@Autowired
	private StudentManager studentManager;

	@RequestMapping(value = "/hello.htm", method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException {

		ModelMap model = new ModelMap();
		model.put("students", this.studentManager.getStudents());

		return new ModelAndView("hello", model);
	}

	public StudentManager getStudentManager() {
		return studentManager;
	}

	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

}