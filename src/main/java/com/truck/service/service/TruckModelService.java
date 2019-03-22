package com.truck.service;

import java.util.List;

import com.truck.model.truckTrip;

public interface TruckModelService {
	public void addTrip(truckTrip truck_trip);
	public List<truckTrip> getTrips();
	public truckTrip getTrip(Integer id);
	public String deleteTrip(Integer id) ;

}
