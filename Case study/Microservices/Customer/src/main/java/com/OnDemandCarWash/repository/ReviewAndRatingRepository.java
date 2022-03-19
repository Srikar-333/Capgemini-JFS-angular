package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.ReviewAndRating;

public interface ReviewAndRatingRepository extends MongoRepository <ReviewAndRating,Integer>{

}
