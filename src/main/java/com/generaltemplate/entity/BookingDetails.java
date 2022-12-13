package com.generaltemplate.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_details",schema="general")
public class BookingDetails {
	
	@Id
	@Column(name="booking_id")
	private Integer bookingId;
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_phone_no")
	private String custPhoneno;
	
	@Column(name="cust_email_id")
	private String custEmailId;
	
	
	@Column(name="kids_count")
	private Integer kidsCount;
	
	@Column(name="adults_count")
	private Integer adultsCount;
	
	@Column(name="Total_count")
	private Integer totalCount;
	
	@Column(name="occassion")
	private String occassion;
	
	@Column(name="date")
	private String date;
	
	@Column(name="time")
	private String time;
	
	@Column(name="city")
	private String city;
	
	@Column(name="outlet")
	private String outlet;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOutlet() {
		return outlet;
	}

	public void setOutlet(String outlet) {
		this.outlet = outlet;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhoneno() {
		return custPhoneno;
	}

	public void setCustPhoneno(String custPhoneno) {
		this.custPhoneno = custPhoneno;
	}

	public String getCustEmailId() {
		return custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}

	public Integer getKidsCount() {
		return kidsCount;
	}

	public void setKidsCount(Integer kidsCount) {
		this.kidsCount = kidsCount;
	}

	public Integer getAdultsCount() {
		return adultsCount;
	}

	public void setAdultsCount(Integer adultsCount) {
		this.adultsCount = adultsCount;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getOccassion() {
		return occassion;
	}

	public void setOccassion(String occassion) {
		this.occassion = occassion;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", custName=" + custName + ", custPhoneno=" + custPhoneno
				+ ", custEmailId=" + custEmailId + ", kidsCount=" + kidsCount + ", adultsCount=" + adultsCount
				+ ", totalCount=" + totalCount + ", occassion=" + occassion + ", date=" + date + ", time=" + time
				+ ", city=" + city + ", outlet=" + outlet + "]";
	}

	
	
	

}
