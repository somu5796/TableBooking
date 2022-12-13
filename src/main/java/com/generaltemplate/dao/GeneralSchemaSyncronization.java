package com.generaltemplate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generaltemplate.entity.Customer;
import com.generaltemplate.entity.OutletDetails;

@Repository
public interface GeneralSchemaSyncronization extends JpaRepository<OutletDetails, Integer> {

	List<OutletDetails> findByCity(String city);

	List<OutletDetails>  findByCityIgnoreCaseContainingAndOutletNameIgnoreCaseContaining(String city, String outlet);

}
