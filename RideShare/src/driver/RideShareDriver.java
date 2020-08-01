package driver;

import java.util.Scanner;

import dao.DriverDaoImpl;
import dao.RideDaoImpl;
import models.Ride;
import service.RideServiceImpl;

public class RideShareDriver {

	public static void main(String[] args) {

		RideDaoImpl rideDao = new RideDaoImpl();
		RideServiceImpl rideService = new RideServiceImpl(rideDao);

		DriverDaoImpl driverService1 = new DriverDaoImpl();
		DriverDaoImpl driverService2 = new DriverDaoImpl();

		driverService1.addDriver("driver1");
		driverService2.addDriver("driver2");

		Scanner sc = new Scanner(System.in);
		int t = 0;

		while (t++ < Math.pow(10, 3)) {
			String riderName = sc.next();

			String operation = sc.next();

			Ride ride;

			switch (operation) {
			case "requests": {
				ride = rideService.createRide(riderName, sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.println("Ride ID: " + ride.getId());
				break;
			}

			case "updates": {
				ride = rideService.updateRide(riderName, sc.nextInt(), sc.nextInt(), sc.nextInt());		
				System.out.println("Ride ID: " + ride.getId());
				System.out.println("Ride details: " + ride);
				break;
			}

			case "withdraws": {
				if (rideService.withdrawRide(riderName)) {
					System.out.println("Ride Cancelled");
				}
				break;
			}
			case "close": {
				float fare = rideService.closeRide(riderName);
				System.out.println("Fare: " + fare);
				break;
			}
			
			default:
				System.out.println("invalid option!");
				break;
			}
		}

		sc.close();
	}

}
