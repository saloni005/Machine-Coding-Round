package dao;

import java.util.HashMap;
import java.util.Map;

import models.Ride;

public class RideDaoImpl implements RideDao {

	private final float CHARGE_PER_KM = 20;
	private final float THRESHOLD = 0.75f;
	private Map<String, Ride> rideMap = new HashMap<>();

	@Override
	public Ride createRide(String name, int origin, int destination, int noOfSeats) {
		Ride ride = new Ride(origin, destination, noOfSeats);
		rideMap.put(name, ride);
		return ride;
	}

	@Override
	public Ride updateRide(String name, int origin, int destination, int noOfSeats) {
		Ride ride;
		if (rideMap.containsKey(name)) {
			ride = rideMap.get(name);
			ride.setOrigin(origin);
			ride.setDestination(destination);
			ride.setNoOfSeats(noOfSeats);
		} else {
			ride = createRide(name, origin, destination, noOfSeats);
		}
		return ride;
	}

	@Override
	public boolean withdrawRide(String name) {
		if (rideMap.containsKey(name)) {
			rideMap.remove(name);
			return true;
		}
		return false;
	}

	@Override
	public float closeRide(String name) {
		Ride ride = rideMap.get(name);
		int distance = ride.getDestination() - ride.getOrigin();
		int noOfSeats = ride.getNoOfSeats();
		float fare = 0;

		if (noOfSeats >= 2) {
			fare = distance * noOfSeats * THRESHOLD * CHARGE_PER_KM;
		} else if (noOfSeats == 1) {
			fare = distance * CHARGE_PER_KM;
		}
		return fare;
	}
}
