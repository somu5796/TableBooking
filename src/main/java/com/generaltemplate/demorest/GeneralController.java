package com.generaltemplate.demorest;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generaltemplate.Interface.Manager;
import com.generaltemplate.entity.BookingDetails;
import com.generaltemplate.entity.Customer;
import com.generaltemplate.request.BookingRequest;
import com.generaltemplate.response.ResponseGeneric;

@RestController
@Component
public class GeneralController {
	
	@Autowired
	Manager manager;

//	@GetMapping("/api/getCustomers")
//	@Produces("application/json")
//	public Iterable<Customer> getCustomerDetails(){
//		Iterable<Customer> response = null;
//		try {
//			 response = manager.getCustomerDetails();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return response;
//	}
//	
	@PostMapping("/api/saveBooking")
	@Consumes("application/json")
	@Produces("application/json")
	public ResponseGeneric addCustomerDetails(@RequestBody BookingRequest bookingRequest) {
		ResponseGeneric response =new ResponseGeneric();
		try {
			 response = manager.saveBookingDetails(bookingRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
		
	}
	
	
	@GetMapping("/api/getOutlets/{city}")
	@Produces("application/json")
	public List<String> getOutletDetails(@PathVariable("city") String city){
		List<String> response = new ArrayList<String>();
		try {
			System.out.println(city);
			 response = manager.getOutletDetails(city);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@GetMapping("/api/getcities")
	@Produces("application/json")
	public List<String> getCities(){
		List<String> response = new ArrayList<String>();
		try {
			 response = manager.getAllCities();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@GetMapping("/api/getAllBookings")
	@Produces("application/json")
	public List<BookingDetails> getAllBookings(){
		List<BookingDetails> response = new ArrayList<BookingDetails>();
		try {
			 response = manager.getAllBookings();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
