package com.truck.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="driver_details")
public class truckDriver {
	
	@Id
	public int driver_id;
	public String driver_name;
	public String driver_address;
	public String driver_phone_number;
	
	
	
	
	public truckDriver() {
	
	}
	public truckDriver(int driver_id, String driver_name, String driver_address, String driver_phone_number) {
		
		this.driver_id = driver_id;
		this.driver_name = driver_name;
		this.driver_address = driver_address;
		this.driver_phone_number = driver_phone_number;
	}
	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public void setDriver_address(String driver_address) {
		this.driver_address = driver_address;
	}
	public void setDriver_phone_number(String driver_phone_number) {
		this.driver_phone_number = driver_phone_number;
	}
	
	

}
