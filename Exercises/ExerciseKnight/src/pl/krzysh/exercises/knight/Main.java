package pl.krzysh.exercises.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		Knight knight = (Knight) context.getBean("myKnight");
		
		//Knight knight1 = new MyKnight("Knight1", new Quest1());
		//Knight knight2 = new MyKnight("Knight2", new Quest2());
		
		try {
			//knight1.embarkOnQuest();
			//knight2.embarkOnQuest();
			knight.embarkOnQuest();
		} catch(QuestException e) {
			e.print();
		}
	}

}
