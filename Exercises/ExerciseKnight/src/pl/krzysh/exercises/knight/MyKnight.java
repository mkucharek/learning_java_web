package pl.krzysh.exercises.knight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyKnight implements Knight {

	public String name;
	@Qualifier("quest1")
	@Autowired
	private Quest quest;

	public MyKnight(String name, Quest quest) {
		this.name = name;
		this.quest = quest;
	}
	
	public MyKnight(String name) {
		this.name = name;
	}
	
	public MyKnight() {
		this.name = "Unnamed";
	}
	
	@Override
	public void embarkOnQuest() throws QuestException {
		//TODO: logger
		System.out.println("I'm a knight. My name is "+name+". I'm embarking on quest.");
		quest.embark();
	}

}
