package pl.krzysh.learningproject.service;

import java.util.List;

import pl.krzysh.learningproject.domain.Student;

public class SimpleStudentManager implements StudentManager {

    private List<Student> students;
    
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}