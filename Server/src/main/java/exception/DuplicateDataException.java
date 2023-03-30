package exception;

public class DuplicateDataException extends Exception{
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public DuplicateDataException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
		
	}
}
