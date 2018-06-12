package com.booking.taxi.fuber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.taxi.fuber.entity.CabDetails;
import com.booking.taxi.fuber.service.CabDetailsService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	CabDetailsService cabDetailsService; 
	
	@GetMapping("/cab/list")
	public List<CabDetails> getCabList() {
		return cabDetailsService.fetchCabDetails();
	}

}
