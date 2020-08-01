package dao;

import java.util.HashMap;
import java.util.Map;

import models.Driver;

public class DriverDaoImpl implements DriverDao {

	private Map<Integer, Driver> driverMap = new HashMap<>();
	private static int id = 0;

	@Override
	public void addDriver(String riderName) {
		id++;
		driverMap.put(id, new Driver(id, riderName));
	}

}
