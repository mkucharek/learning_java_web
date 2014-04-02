package pl.krzysh.learningproject.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.krzysh.learningproject.domain.Student;
import pl.krzysh.learningproject.service.StudentManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/application-config.xml")
public class TestStudentManager {
	@Autowired
	StudentManager manager;
	
	@Test
	public void testInitStudentCount()
	{
		assertEquals(5, manager.getStudents().size());
	}
}
