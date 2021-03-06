package com.web.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.project.dto.FlightBookRequest;
import com.web.project.dto.FlightBooking;
import com.web.project.service.FlightBookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightServiceExampleApplication {
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping("/bookFlightTicket")
	public FlightBooking bookingFlightTicket(@RequestBody FlightBookRequest request) {
		return this.flightBookingService.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
