package com.truck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.model.truckDriver;
import com.truck.dao.truckDriverRepo;

@Service
public class truckDriverService implements truckDriverServiceInterface{

	@Autowired
	public truckDriverRepo repository;
	@Override
	public void addDriver(truckDriver driver) {
		// TODO Auto-generated method stub
		
		repository.save(driver);
		
	}

	@Override
	public List<truckDriver> getAllDrivers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public truckDriver getDriver(Integer id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public void deleteDriver(Integer id) {
		// TODO Auto-generated method stub
		repository.delete(id);
		
	}

}
