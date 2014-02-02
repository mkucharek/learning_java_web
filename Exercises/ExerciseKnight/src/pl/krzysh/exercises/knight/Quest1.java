package pl.krzysh.exercises.knight;

public class Quest1 implements Quest {

	@Override
	public void embark() throws QuestException {
		try {
			System.out.println("This is quest 1");
		} catch(Exception e) {
			throw new QuestException(e);
		}
	}

}
