package com.truck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truck.model.truckTrip;
import com.truck.service.truckTripService;


@RestController
@RequestMapping(value="/Trip")
public class truckTripController {
	
	@Autowired
	public truckTripService service;

	@PostMapping(value="/addTruckTrip") 
	public void AddTrip(@RequestBody truckTrip truck_trip) 
	{
	
		service.addTrip(truck_trip);
	
	}
	
	
	@GetMapping(value="/findAllTrips")
	public List<truckTrip> getTrucks()
	{
		return service.getTrips();
	}
	
	
	
	@GetMapping("/findTrip/{id}")
	public truckTrip getTruck(@PathVariable Integer id)
	{
		return service.getTrip(id);
	}
	
	@DeleteMapping("deleteTrip/{id}")
	public String deleteTruck(@PathVariable Integer id) 
	{
		service.deleteTrip(id);
		return null;
	}
	
}
