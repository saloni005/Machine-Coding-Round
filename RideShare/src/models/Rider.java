package models;

public class Rider extends User {

	private int riderId;
	private String riderName;
	
	public Rider(int riderId, String riderName) {
		super();
		this.riderId = riderId;
		this.riderName = riderName;
	}
	
	public int getRiderId() {
		return riderId;
	}
	
	public void setRiderId(int riderId) {
		this.riderId = riderId;
	}
	
	public String getRiderName() {
		return riderName;
	}
	
	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

}
