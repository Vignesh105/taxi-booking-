package com.booking.taxi.fuber.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;
import java.util.List;

import com.booking.taxi.fuber.entity.CostDetails;
import com.booking.taxi.fuber.repository.CostDetailsRepository;

public class CostlDetailsService extends CabDetailsService{
	
	@Autowired
	CostDetailsRepository costDetailsRepo;
	
	CostlDetailsService costdetails = new CostlDetailsService();

	public void addStartTime(CostDetails costDetails) {
		// TO set start time of travel to Database
		costDetailsRepo.save(costDetails);
	}

	public void addEndTime(CostDetails costDetails) {
		// TO set End time of travel to Database
		costDetailsRepo.save(costDetails);
	}

	public double calculateCost(CostDetails costDetails) {
		// To Calculate the totalcost of travel from costDetails
		LocalTime startTime = costDetails.getStartTime();
		LocalTime EndTime = costDetails.getEndTime();
		double totalDistance = costDetails.getDistance();
		double difference = EndTime - startTime;
		double differenceSeconds = difference / 1000 % 60;
		double differenceMinutes = difference / (60 * 1000) % 60;
		double differenceHours = difference / (60 * 60 * 1000) % 24;
		double totalminutes = (differenceSeconds/60)+ differenceMinutes + (differenceHours*60);
		double totalCost = (totalminutes * 1)+ (totalDistance*2);
		String color = costdetails.color;
		if(color == "pink") {
			return totalCost+5;
		}
		return totalCost;
	}

	
}
