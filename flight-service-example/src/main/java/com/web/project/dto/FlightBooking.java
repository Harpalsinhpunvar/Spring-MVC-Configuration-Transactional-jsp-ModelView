package com.web.project.dto;


import com.web.project.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBooking {
	
	private String status;
	private double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;

}
