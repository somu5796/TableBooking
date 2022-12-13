package com.generaltemplate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generaltemplate.entity.BookingDetails;

public interface BookingRepo extends JpaRepository<BookingDetails, Integer>{

	List<BookingDetails> findByDateIgnoreCaseContainingAndCityIgnoreCaseContainingAndOutlet(String date, String city,
			String outlet);

}
