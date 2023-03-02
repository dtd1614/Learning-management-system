import java.io.Serializable;
import java.util.StringTokenizer;

public class Reservation implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String studentId;
	protected String courseId;
	protected String reservationDate;
	
	public Reservation(String inputString) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
    	this.studentId = stringTokenizer.nextToken();
    	this.courseId = stringTokenizer.nextToken();
    	this.reservationDate = stringTokenizer.nextToken();
	}	

    public String toString() {
        String stringReturn = this.studentId + " " + this.courseId + " " + reservationDate;
        return stringReturn;
    }
}
