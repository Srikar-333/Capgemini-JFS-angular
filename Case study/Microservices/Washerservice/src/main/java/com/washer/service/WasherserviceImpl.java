package com.washer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.Repository.WasherRepo;
import com.washer.model.Washers;

@Service
public class WasherserviceImpl implements WashService {
	@Autowired
	private WasherRepo repo;

	@Override
	public Washers addWasher(Washers washer) {
		return repo.save(washer);
	}

	@Override
	public List<Washers> getwashers() {
		return repo.findAll();
	}

	@Override
	public List<Washers> getwasherbylocation(String location) {
		return repo.findAll();
	}

	@Override
	public void deletewasher(Washers washer) {
		repo.delete(washer);
		
	}

	
	
	
	
	

}
