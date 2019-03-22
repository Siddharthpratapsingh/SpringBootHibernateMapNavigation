package com.truck.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection="Route")
public class truckLocation {
	
	@Id
	public int route_id;
	
	public String Source;
	public String Destination;

	public truckLocation() {
	}
	public truckLocation(int id, String source, String destination) {
		this.route_id = id;
		this.Source = source;
		this.Destination = destination;
	}

	public void setId(int id) {
		this.route_id = id;
	}

	public void setSource(String source) {
		this.Source = source;
	}

	public void setDestination(String destination) {
		this.Destination = destination;
	}
	
	
	
	

}
