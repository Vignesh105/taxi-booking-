package com.booking.taxi.fuber.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="travel_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TravelDetails {

	@Id
	private String carNumber;
	
	private String location;

    private String driverName;
    
    private long driverContactNumber;

}
