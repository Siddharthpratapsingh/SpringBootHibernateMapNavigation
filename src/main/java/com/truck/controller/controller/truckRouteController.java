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

import com.truck.model.truckLocation;
import com.truck.service.truckRouteService;;
@RestController
@RequestMapping(value="/Route")
public class truckRouteController {
	
	@Autowired
	public truckRouteService service;
	
	@PostMapping(value="/addRoute")
	public void addRoute(@RequestBody truckLocation routes)
	{
		service.addRoute(routes);
	}
	
	@GetMapping(value="/getAllRoutes")
	public List<truckLocation> getAllRoutes()
	{
		return service.getAllRoutes();
	}
	
	@GetMapping(value="/getRoute/{id}")
	public truckLocation getRoute(@PathVariable Integer id)
	{
		return service.getRoute(id);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteRoute(@PathVariable Integer id)
	{
		service.deleteRoute(id);
	}
	

}
