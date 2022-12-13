package com.generaltemplate.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.generaltemplate.entity.BookingDetails;
import com.generaltemplate.entity.Customer;
import com.generaltemplate.request.BookingRequest;
import com.generaltemplate.response.ResponseGeneric;

@Service
public interface Manager {
//	public Iterable<Customer> getCustomerDetails() throws Exception;
//
//	public ResponseGeneric addCustomerDetails(CustomerRequest customerRequest);

	public List<String> getOutletDetails(String city);

	public List<String> getAllCities();

	public ResponseGeneric saveBookingDetails(BookingRequest bookingRequest);

	public List<BookingDetails> getAllBookings();

}
