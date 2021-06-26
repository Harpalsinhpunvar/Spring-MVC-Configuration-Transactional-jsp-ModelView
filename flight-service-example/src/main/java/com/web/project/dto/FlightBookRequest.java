package com.web.project.dto;

import com.web.project.entity.PassengerInfo;
import com.web.project.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookRequest {
	
	private PassengerInfo passengerInfo;
	private PaymentInfo paymentInfo;
	
	

}
