package com.truck.service;

import java.util.List;

import com.truck.model.truckLocation;

public interface truckRouteServiceInterface {
	
	public void addRoute(truckLocation route);
	public List<truckLocation> getAllRoutes();
	public truckLocation getRoute(Integer id);
	public void deleteRoute(Integer id);

}
