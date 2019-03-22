package com.truck.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.truck.model.truckTrip;

public interface trucksTrip extends MongoRepository<truckTrip,Integer>{

}
