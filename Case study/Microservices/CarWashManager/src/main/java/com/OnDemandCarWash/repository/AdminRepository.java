package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

}
