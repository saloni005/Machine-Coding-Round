package service;

import dao.RideDao;
import models.Ride;

public class RideServiceImpl implements RideService {

	private RideDao rideDao;

	public RideServiceImpl(RideDao rideDao) {
		super();
		this.rideDao = rideDao;
	}

	@Override
	public Ride createRide(String name, int origin, int destination, int noOfSeats) {
		return this.rideDao.createRide(name, origin, destination, noOfSeats);
	}

	@Override
	public Ride updateRide(String name, int origin, int destination, int noOfSeats) {
		return this.rideDao.updateRide(name, origin, destination, noOfSeats);
	}

	@Override
	public boolean withdrawRide(String name) {
		return this.rideDao.withdrawRide(name);
	}

	@Override
	public float closeRide(String name) {
		return this.rideDao.closeRide(name);
	}
	
	

}
