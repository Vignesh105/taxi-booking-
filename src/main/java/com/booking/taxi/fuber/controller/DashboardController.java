package com.booking.taxi.fuber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.taxi.fuber.entity.CabDetails;
import com.booking.taxi.fuber.entity.CostDetails;
import com.booking.taxi.fuber.entity.TravelDetails;
import com.booking.taxi.fuber.service.CabDetailsService;
import com.booking.taxi.fuber.service.CostlDetailsService;
import com.booking.taxi.fuber.service.TravelDetailsService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	CabDetailsService cabDetailsService; 
	
	@Autowired
	TravelDetailsService travelDetailsService;
	
	@Autowired
	CostlDetailsService costDetailsService;

	
	@GetMapping("/cab/list")
	public List<CabDetails> getCabList() {
		return cabDetailsService.fetchCabDetails();
	}
	
	@PostMapping("/assign/cab")
	public List<CabDetails> assignCabToUser(@RequestBody CabDetails cabDetails) {
		return cabDetailsService.assignCabToUser(cabDetails);
	}

	@GetMapping("/travel/detail")
	public List<TravelDetails> showTravelDetails(){
		return travelDetailsService.fetchtravelDetails();		
	}
	
	@PostMapping("/assign/starttime")
	public void assignStartTime(@RequestBody CostDetails costDetails){
		costDetailsService.addStartTime(costDetails);
	}

	@PostMapping("/assign/endtime")
	public void assignEndTime(@RequestBody CostDetails costDetails){
		costDetailsService.addEndTime(costDetails);
	}
}
