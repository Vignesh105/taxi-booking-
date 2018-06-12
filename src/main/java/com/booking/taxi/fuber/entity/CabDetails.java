package com.booking.taxi.fuber.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="cab_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CabDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	private Location location;
	
	private String color;
	
	private boolean available;
	
}
