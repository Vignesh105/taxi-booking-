package com.booking.taxi.fuber.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.booking.taxi.fuber.entity.CostDetails;
import com.booking.taxi.fuber.repository.CostDetailsRepository;

public class CostlDetailsService {
	
	@Autowired
	CostDetailsRepository costDetailsRepo;

	public void addStartTime(CostDetails costDetails) {
		// TO set start time of travel to Database
		costDetailsRepo.save(costDetails);
	}

	public void addEndTime(CostDetails costDetails) {
		// TO set End time of travel to Database
		costDetailsRepo.save(costDetails);
	}

	

}
