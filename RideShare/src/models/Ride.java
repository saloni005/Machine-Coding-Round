package models;

import java.util.List;

public class Ride {
	private static int id = 0;
	private int origin;
	private int destination;
	private int noOfSeats;
	private float fare;
	private int driverId;

	public Ride(int origin, int destination, int noOfSeats) {
		super();
		id++;
		this.origin = origin;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Ride [origin=" + origin + ", destination=" + destination + ", noOfSeats=" + noOfSeats + ", fare=" + fare
				+ ", driverId=" + driverId + "]";
	}

}
