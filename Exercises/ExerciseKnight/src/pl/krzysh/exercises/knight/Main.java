package pl.krzysh.exercises.knight;

public class Main {

	public static void main(String[] args) {
		MyKnight knight1 = new MyKnight("Knight1", new Quest1());
		MyKnight knight2 = new MyKnight("Knight2", new Quest2());
		
		try {
			knight1.embarkOnQuest();
			knight2.embarkOnQuest();
		} catch(QuestException e) {
			e.print();
		}
	}

}
