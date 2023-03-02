import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReservationList {
	protected ArrayList<Reservation> vReservation;
	
	public ReservationList(String sReservationFileName) throws IOException {
		BufferedReader objReservationFile = new BufferedReader(new FileReader(sReservationFileName));
		this.vReservation = new ArrayList<Reservation>();
		while (objReservationFile.ready()) {
			String reservationInfo = objReservationFile.readLine();
			if (!reservationInfo.equals("")) {
				this.vReservation.add(new Reservation(reservationInfo));
			}
		}
		objReservationFile.close();
	}
	
	public ArrayList<Reservation> getAllReservationRecords() throws NullDataException {
		if(this.vReservation.size() == 0) throw new NullDataException("~~~~~~~~~~~~~~~~ Reservation data is null ~~~~~~~~~~~~~~~~~");
		else return this.vReservation;	
	}
	
	public boolean addReservationRecords(String reservationInfo) {
		if(this.vReservation.add(new Reservation(reservationInfo))) return true;
		else return false;		
	}
}
