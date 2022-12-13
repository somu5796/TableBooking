package com.generaltemplate.managerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.generaltemplate.Interface.Manager;
import com.generaltemplate.dao.BookingRepo;
import com.generaltemplate.dao.GeneralSchemaSyncronization;
import com.generaltemplate.entity.BookingDetails;
import com.generaltemplate.entity.Customer;
import com.generaltemplate.entity.OutletDetails;
import com.generaltemplate.request.BookingRequest;
import com.generaltemplate.response.ResponseGeneric;
@Service
public class ManagerImpl implements Manager {
	
	@Autowired
	GeneralSchemaSyncronization generalSchemaSyncronization;
	
	@Autowired
	BookingRepo bookingRepo;

//	@Override
//	public Iterable<Customer> getCustomerDetails() throws Exception {
//		Iterable<Customer> response = generalSchemaSyncronization.findAll();
//		return response;
//	}
//
//	@Override
//	public ResponseGeneric addCustomerDetails(CustomerRequest customerRequest) {
//		ResponseGeneric response=new ResponseGeneric();
//		Customer customer = new Customer();
//		customer.setName(customerRequest.getName());
//		customer.setId(customerRequest.getId());
//		Customer res = generalSchemaSyncronization.save(customer);
//		if(res.getName().equals(customerRequest.getName())) {
//			response.setMessage(res.getName()+" Added Successfully");
//		}
//		return response;
//	}

	@Override
	public List<String> getOutletDetails(String city) {
		List<OutletDetails> response = new ArrayList<OutletDetails>();
		List<String> outdetails = new ArrayList<String>();
		 response = generalSchemaSyncronization.findByCity(city);
		 outdetails = response.stream().map(e->e.getOutlet_name()).collect(Collectors.toList());
		return outdetails;
	}

	@Override
	public List<String> getAllCities() {
		List<OutletDetails> response = new ArrayList<OutletDetails>();
		List<String> cities = new ArrayList<String>();
		List<String> retcities = new ArrayList<String>();
		response = generalSchemaSyncronization.findAll();
		cities = response.stream().map(e->e.getCity()).collect(Collectors.toList());
		retcities= cities.stream().distinct().collect(Collectors.toList());
		return retcities;
	}

	@Override
	public ResponseGeneric saveBookingDetails(BookingRequest bookingRequest) {
		ResponseGeneric response=new ResponseGeneric();
		Integer booking= (int) bookingRepo.count();
		Integer bookingId = booking+1;
		if(isBookingAvailable(bookingRequest.getDate(),bookingRequest.getTime(),bookingRequest.getOutlet(),bookingRequest.getCity())) {
		BookingDetails bookingreq = new BookingDetails();
		
		bookingreq.setAdultsCount(bookingRequest.getAdultsCount());
		bookingreq.setBookingId(bookingId);
		bookingreq.setCustEmailId(bookingRequest.getCustEmailId());
		bookingreq.setCustName(bookingRequest.getCustName());
		bookingreq.setCustPhoneno(bookingRequest.getCustPhoneno());
		bookingreq.setDate(bookingRequest.getDate());
		bookingreq.setKidsCount(bookingRequest.getKidsCount());
		bookingreq.setOccassion(bookingRequest.getOccassion());
		bookingreq.setTime(bookingRequest.getTime());
		bookingreq.setTotalCount(bookingRequest.getTotalCount());
		bookingreq.setCity(bookingRequest.getCity());
		bookingreq.setOutlet(bookingRequest.getOutlet());
		BookingDetails res = bookingRepo.save(bookingreq);
		if(res.getBookingId().equals(bookingId)) {
			response.setMessage(res.getCustName()+" your booking done Successfully");
		}
		}
		else {
			response.setMessage("Sorry ! All Tables booked for selected Date and Time. ");
		}
		return response;
	}

	private Boolean isBookingAvailable(String date,String time,String outlet,String city) {
		Boolean bookingavailable= false;
		List<OutletDetails> od = generalSchemaSyncronization.findByCityIgnoreCaseContainingAndOutletNameIgnoreCaseContaining(city,outlet);
		Integer totalTables = od.get(0).getNo_of_tables();
		Integer intTime = Integer.parseInt(time.substring(0,2));
		Integer tablesBooked = 0;
		List<BookingDetails> bookings = bookingRepo.findByDateIgnoreCaseContainingAndCityIgnoreCaseContainingAndOutlet(date,city,outlet);
		for(BookingDetails booking:bookings) {
			Integer bookingintTime = Integer.parseInt(booking.getTime().substring(0, 2));
			if(bookingintTime>=intTime-1 && bookingintTime<=intTime+1) {
				tablesBooked+=1;
			}
		}
		
		if(tablesBooked<totalTables) {
			bookingavailable=true;
		}
		
		return bookingavailable;
	}

	@Override
	public List<BookingDetails> getAllBookings() {
		List<BookingDetails> bookingDetails = bookingRepo.findAll();
		return bookingDetails;
	}

}
