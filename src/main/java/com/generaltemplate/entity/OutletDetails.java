package com.generaltemplate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="outlet_details",schema="general")
public class OutletDetails {
	@Id
	@Column(name="outlet_id")
	private Integer outlet_id;
	
	@Column(name="outlet_name")
	private String outletName;

	@Column(name="city")
	private String city;
	
	@Column(name="no_of_tables")
	private Integer no_of_tables;

	public Integer getOutlet_id() {
		return outlet_id;
	}

	public void setOutlet_id(Integer outlet_id) {
		this.outlet_id = outlet_id;
	}

	public String getOutlet_name() {
		return outletName;
	}

	public void setOutlet_name(String outlet_name) {
		this.outletName = outlet_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getNo_of_tables() {
		return no_of_tables;
	}

	public void setNo_of_tables(Integer no_of_tables) {
		this.no_of_tables = no_of_tables;
	}

	@Override
	public String toString() {
		return "OutletDetails [outlet_id=" + outlet_id + ", outlet_name=" + outletName + ", city=" + city
				+ ", no_of_tables=" + no_of_tables + "]";
	}
	
}
