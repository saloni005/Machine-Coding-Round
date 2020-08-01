package service;

import models.Ride;

public interface RideService {

	Ride createRide(String name, int origin, int destination, int noOfSeats);

	Ride updateRide(String name, int origin, int destination, int noOfSeats);

	boolean withdrawRide(String name);

	float closeRide(String name);

}
