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

import com.truck.model.trucks;
import com.truck.service.truckService;

@RestController
@RequestMapping(value="/Truck")
public class truckController {

		
		@Autowired
		public truckService service;
		
		@PostMapping(value="/addTruck")
		public void addRoute(@RequestBody trucks truck)
		{
			service.addTruck(truck);
		}
		
		@GetMapping(value="/getAllTrucks")
		public List<trucks> getAllRoutes()
		{
			return service.getAllTrucks();
		}
		
		@GetMapping(value="/getTruck/{id}")
		public trucks getTruck(@PathVariable Integer id)
		{
			return service.gettruck(id);
		}
		
		@DeleteMapping(value="/delete/{id}")
		public void deleteTruck(@PathVariable Integer id)
		{
			service.deleteTruck(id);
		}
		

	}


