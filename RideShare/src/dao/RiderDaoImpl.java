package dao;

import java.util.Map;

import models.Rider;

public class RiderDaoImpl implements RiderDao{
	private Map<Integer, Rider> riderMap;
	private static int id = 0;
	
	public void addRider(String riderName) {
		id++;
		riderMap.put(id, new Rider(id, riderName));
	}
	
}
