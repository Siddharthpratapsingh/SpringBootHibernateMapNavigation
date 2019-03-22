package com.truck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.model.trucks;
import com.truck.dao.trucksRepository;

@Service
public class truckService implements Truckmainservice{

	@Autowired
	public trucksRepository repository;
	
	public void addTruck(trucks truck) {
		// TODO Auto-generated method stub
		repository.save(truck);
	}


	public List<trucks> getAllTrucks() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	public trucks gettruck(Integer id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	
	public void deleteTruck(Integer id) {
		// TODO Auto-generated method stub
		repository.delete(id);
		
	}
	
	
	

}
