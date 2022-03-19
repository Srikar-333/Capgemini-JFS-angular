package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.ReviewAndRating;
import com.OnDemandCarWash.repository.ReviewAndRatingRepository;

@RestController
public class ReviewAndRatingController {
	@Autowired
	public ReviewAndRatingRepository repository;
//For adding the review and rating
	@PostMapping("addReviewAndRating")
	public int saveBook(@RequestBody ReviewAndRating rating) {
		repository.save(rating);
		return rating.getId();
		
	}
	
//To view all ratings
	@GetMapping("/findAllReviewsAndRatings")
	public List<ReviewAndRating> getBooks(){
		return repository.findAll();
	}

}
