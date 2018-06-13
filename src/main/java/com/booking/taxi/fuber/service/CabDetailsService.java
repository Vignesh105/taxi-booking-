package com.booking.taxi.fuber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.taxi.fuber.entity.CabDetails;
import com.booking.taxi.fuber.repository.CabDetailsRepository;

@Service
public class CabDetailsService {
	
	@Autowired
	CabDetailsRepository cabDetailsRepo;
	
	public List<CabDetails> fetchCabDetails() {
		return cabDetailsRepo.findAll();
	}	

	public List<CabDetails> assignCabToUser(CabDetails cabDetails) {		
		cabDetails.setAvailable(false);	
		cabDetailsRepo.save(cabDetails);		
		return cabDetailsRepo.findAll();
	}

}
