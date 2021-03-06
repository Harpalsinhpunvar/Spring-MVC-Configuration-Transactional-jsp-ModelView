package com.web.project.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.project.dto.FlightBookRequest;
import com.web.project.dto.FlightBooking;
import com.web.project.entity.PassengerInfo;
import com.web.project.entity.PaymentInfo;
import com.web.project.repository.PassengerRepository;
import com.web.project.repository.PaymentRepository;
import com.web.project.utils.PaymentUtils;

@Service
public class FlightBookingService {
	
	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Transactional
	public FlightBooking bookFlightTicket(FlightBookRequest request) {
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfo = passengerRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		paymentInfo = paymentRepository.save(paymentInfo);
		
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		
		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentRepository.save(paymentInfo);
		
		return new FlightBooking("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}

}
