package pl.krzysh.exercises.knight;

public class QuestException extends Exception {
	private static final long serialVersionUID = 1L;
	private Exception exception = null;

	public QuestException() {
		super();
	}
	
	public QuestException(Exception e) {
		super();
		exception = e;
	}
	
	public void print() {
		System.err.println("Exception in quest!");
		if(exception != null) {
			exception.printStackTrace();
		}
	}
}
