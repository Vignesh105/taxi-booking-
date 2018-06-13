package com.booking.taxi.fuber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.booking.taxi.fuber.entity.TravelDetails;
import com.booking.taxi.fuber.repository.TravelDetailsRepository;

public class TravelDetailsService {
	
	@Autowired
	TravelDetailsRepository travelDetailsRepo;

	public List<TravelDetails> fetchtravelDetails() {
		// TODO Auto-generated method stub
		return travelDetailsRepo.findAll();
	}

}
