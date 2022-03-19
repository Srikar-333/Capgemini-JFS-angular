package com.OnDemandCarWash.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.OnDemandCarWash.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String>{
	
	UserModel findByUsername(String username);
	
}
