package exception;

public class NullDataException extends Exception{
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	public NullDataException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
		
	}
}
