package courses.handlingexceptions.course;

public class InvalidStatementException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InvalidStatementException (String message) {
		super(message);
	}
	
	public InvalidStatementException (String message, Exception ex) {
		super(message,ex);
	}
}
