package pl.krzysh.exercises.knight;

public class Quest2 implements Quest {

	@Override
	public void embark() throws QuestException {
		try {
			System.out.println("This is quest 2");
			throw new Exception("I died. :(");
		} catch(Exception e) {
			throw new QuestException(e);
		}
	}

}
