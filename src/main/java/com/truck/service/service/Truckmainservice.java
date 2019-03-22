package com.truck.service;

import java.util.List;

import com.truck.model.trucks;

public interface Truckmainservice {

	public void addTruck(trucks truck);
	public List<trucks> getAllTrucks();
	public trucks gettruck(Integer id);
	public void deleteTruck(Integer id);
	
}
