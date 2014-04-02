package pl.krzysh.learningproject.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Suite.class)
@SuiteClasses({TestStudentManager.class, TestStudentManagerAdd.class})
@ContextConfiguration(locations = "/spring/application-config.xml")
public class TestStudentManagerGroup {
}
