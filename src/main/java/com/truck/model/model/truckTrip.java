package com.truck.model;
import com.truck.model.trucks;

import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.truck.model.truckDriver;

@Data
@Document(collection="trip")
public class truckTrip {
	
	@Id
	public int tripId;
	public String start_trip_time;
	public String end_trip_time;
	
	@DBRef
	public List<trucks> truck;

	@DBRef
	public List<truckDriver> drivers;
	
	@DBRef
	public List<truckLocation> route;
	
	
	
	public truckTrip() {
		
		// TODO Auto-generated constructor stub
	}
	public truckTrip(int tripId, String start_trip_time, String end_trip_time, List<trucks> truck, List<truckDriver> drivers,List<truckLocation> route) {
		
		this.tripId = tripId;
		this.start_trip_time = start_trip_time;
		this.end_trip_time = end_trip_time;
		this.truck = truck;
		this.drivers = drivers;
		this.route = route;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public void setStart_trip_time(String start_trip_time) {
		this.start_trip_time = start_trip_time;
	}
	public void setEnd_trip_time(String end_trip_time) {
		this.end_trip_time = end_trip_time;
	}
	public void setTruck(List<trucks> truck) {
		this.truck = truck;
	}
	public void setDrivers(List<truckDriver> drivers) {
		this.drivers = drivers;
	}
	public void setRoute(List<truckLocation> route) {
		this.route = route;
	}
	
	
	
	

}
