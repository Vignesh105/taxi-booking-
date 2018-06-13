package com.booking.taxi.fuber.entity;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cost_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CostDetails {
	
	private LocalTime startTime;
	
	private LocalTime endTime;

	private Double distance;
}
