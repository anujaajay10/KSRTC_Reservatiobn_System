package ustbatchno3.KSRTCReservationSystem;

public class Reservation {
	   private int reservationId;
	   private int busId;
	   
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getNumOfSeatsReserved() {
		return numOfSeatsReserved;
	}
	public void setNumOfSeatsReserved(int numOfSeatsReserved) {
		this.numOfSeatsReserved = numOfSeatsReserved;
	}
	public Reservation(int reservationId, int busId, String passengerName, int numOfSeatsReserved) {
		super();
		this.reservationId = reservationId;
		this.busId = busId;
		this.passengerName = passengerName;
		this.numOfSeatsReserved = numOfSeatsReserved;
	}
	private String passengerName;
	   private int numOfSeatsReserved;
}
