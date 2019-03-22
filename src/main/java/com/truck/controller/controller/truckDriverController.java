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

import com.truck.model.truckDriver;
import com.truck.service.truckDriverService;

@RestController
@RequestMapping(value="/Driver")
public class truckDriverController {
	
	@Autowired
	public truckDriverService service;
	
	@PostMapping(value="/addDriver")
	public void addDriver(@RequestBody truckDriver driver)
	{
		service.addDriver(driver);
	}
	
	@GetMapping(value="/getAllDrivers")
	public List<truckDriver> getAllDrivers()
	{
		return service.getAllDrivers();
	}
	
	@GetMapping(value="/getDriver/{id}")
	public truckDriver getTruck(@PathVariable Integer id)
	{
		return service.getDriver(id);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteDriver(@PathVariable Integer id)
	{
		service.deleteDriver(id);
	}
	

}
