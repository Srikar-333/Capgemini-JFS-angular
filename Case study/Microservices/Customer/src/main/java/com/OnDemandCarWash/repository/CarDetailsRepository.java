package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.CarDetails;

public interface CarDetailsRepository extends MongoRepository<CarDetails,Integer> {

}
