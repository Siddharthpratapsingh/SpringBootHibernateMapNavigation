package com.truck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.truck.dao.*;
//import com.truck.model.truckLocation;
import com.truck.model.*;

//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//import com.truck.dao.trucksRepository;
import com.truck.dao.trucksLocationRepo;

@Service
public class truckTripService implements TruckModelService {
	
	@Autowired
	public trucksTrip trip_repository;
	@Autowired
	public trucksRepository truck_repository;
	@Autowired
	public trucksLocationRepo route_repository;
	@Autowired
	public truckDriverRepo driver_repository;
	
	
public void addTrip(truckTrip truck_trip)
{
	
	trip_repository.save(truck_trip);
	truck_repository.save(truck_trip.truck);
	route_repository.save(truck_trip.route);
	driver_repository.save(truck_trip.drivers);
}

public List<truckTrip> getTrips()
{
	return trip_repository.findAll();
}
	
public truckTrip getTrip(Integer id)
{
	return trip_repository.findOne(id);
}

public String deleteTrip(Integer id) 
{
	trip_repository.delete(id);
	return null;
}
	
}
