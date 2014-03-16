package pl.krzysh.learningproject.service;

import java.io.Serializable;
import java.util.List;

import pl.krzysh.learningproject.domain.Student;

public interface StudentManager extends Serializable{
    
    public List<Student> getStudents();
    
}