package pl.krzysh.learningproject.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pl.krzysh.learningproject.service.StudentManager;

public class StudentController implements Controller {

    private StudentManager studentManager;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("students", this.studentManager.getStudents());

        return new ModelAndView("hello", "model", myModel);
    }


    public void setStudentManager(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

}