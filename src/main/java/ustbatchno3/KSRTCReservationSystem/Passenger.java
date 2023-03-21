package ustbatchno3.KSRTCReservationSystem;

import java.time.LocalDateTime;

public class Passenger {
	
	
		private int Cid;
		private String Cmob;
		private String busname;
		private String source;
		private String destination;
		private String bustype;
		private int busseats;
		private LocalDateTime busdatetime_depart;
		private LocalDateTime busdatetime_arri;
		
		
		public int getCid() {
			return Cid;
		}
		public void setCid(int cid) {
			Cid = cid;
		}
		public String getCmob() {
			return Cmob;
		}
		public void setCmob(String cmob) {
			Cmob = cmob;
		}
		public String getBusname() {
			return busname;
		}
		public void setBusname(String busname) {
			this.busname = busname;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getBustype() {
			return bustype;
		}
		public void setBustype(String bustype) {
			this.bustype = bustype;
		}
		public int getBusseats() {
			return busseats;
		}
		public void setBusseats(int busseats) {
			this.busseats = busseats;
		}
		public LocalDateTime getBusdatetime_depart() {
			return busdatetime_depart;
		}
		public void setBusdatetime_depart(LocalDateTime busdatetime_depart) {
			this.busdatetime_depart = busdatetime_depart;
		}
		public LocalDateTime getBusdatetime_arri() {
			return busdatetime_arri;
		}
		public void setBusdatetime_arri(LocalDateTime busdatetime_arri) {
			this.busdatetime_arri = busdatetime_arri;
		}
		public Passenger(int cid, String cmob, String busname, String source, String destination, String bustype,
				int busseats, LocalDateTime busdatetime_depart, LocalDateTime busdatetime_arri) {
			super();
			Cid = cid;
			Cmob = cmob;
			this.busname = busname;
			this.source = source;
			this.destination = destination;
			this.bustype = bustype;
			this.busseats = busseats;
			this.busdatetime_depart = busdatetime_depart;
			this.busdatetime_arri = busdatetime_arri;
		}
		
		@Override
		public String toString() {
			return "Passenger [Cid=" + Cid + ", Cmob=" + Cmob + ", busname=" + busname + ", source=" + source
					+ ", destination=" + destination + ", bustype=" + bustype + ", busseats=" + busseats
					+ ", busdatetime_depart=" + busdatetime_depart + ", busdatetime_arri=" + busdatetime_arri + "]";
		}	
		
}