package com.truck.service;

import java.util.List;

import com.truck.model.truckDriver;

public interface truckDriverServiceInterface {
	
	public void addDriver(truckDriver driver);
	public List<truckDriver> getAllDrivers();
	public truckDriver getDriver(Integer id);
	public void deleteDriver(Integer id);

}
