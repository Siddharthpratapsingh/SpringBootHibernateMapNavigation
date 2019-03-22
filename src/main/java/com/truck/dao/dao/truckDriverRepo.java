package com.truck.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.truck.model.truckDriver;

public interface truckDriverRepo extends MongoRepository<truckDriver,Integer>{

}
