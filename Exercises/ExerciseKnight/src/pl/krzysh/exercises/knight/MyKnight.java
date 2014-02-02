package pl.krzysh.exercises.knight;

public class MyKnight implements Knight {

	public String name;
	private Quest quest;
	
	public MyKnight(String name, Quest quest) {
		this.name = name;
		this.quest = quest;
	}
	
	@Override
	public void embarkOnQuest() throws QuestException {
		System.out.println("I'm a knight. My name is "+name+". I'm embarking on quest.");
		quest.embark();
	}

}
