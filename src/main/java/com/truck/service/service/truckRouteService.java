package com.truck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.model.truckLocation;
import com.truck.dao.trucksLocationRepo;

@Service
public class truckRouteService implements truckRouteServiceInterface{

	@Autowired
	public trucksLocationRepo repository;
	
	@Override
	public void addRoute(truckLocation route) {
		// TODO Auto-generated method stub
		repository.save(route);
		
	}

	@Override
	public List<truckLocation> getAllRoutes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public truckLocation getRoute(Integer id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public void deleteRoute(Integer id) {
		// TODO Auto-generated method stub
		repository.delete(id);
		
	}

}
