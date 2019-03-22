package com.truck.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.truck.model.truckLocation;


public interface trucksLocationRepo extends MongoRepository<truckLocation,Integer> {

}
