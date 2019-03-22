package com.truck.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;


@Data
@Document(collection="Data")
public class trucks {
	
	@Id
	public int truck_id;
	public String truckname;
	
	 
	

	public trucks() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public trucks(int id, String truckname) {
		
		this.truck_id = id;
		this.truckname = truckname;
		
	}

	public void setId(int id) {
		this.truck_id = id;
	}

	
	public void setTruckname(String truckname) {
		this.truckname = truckname;
		
	}

	
}