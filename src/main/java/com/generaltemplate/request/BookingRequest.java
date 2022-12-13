package com.generaltemplate.request;


public class BookingRequest {
	private Integer bookingId;
	private String custName;
	private String custPhoneno;
	private String custEmailId;
	private Integer kidsCount;
	private Integer adultsCount;
	private Integer totalCount;
	private String occassion;
	private String date;
	private String time;
	private String city;
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
		return "BookingRequest [bookingId=" + bookingId + ", custName=" + custName + ", custPhoneno=" + custPhoneno
				+ ", custEmailId=" + custEmailId + ", kidsCount=" + kidsCount + ", adultsCount=" + adultsCount
				+ ", totalCount=" + totalCount + ", occassion=" + occassion + ", date=" + date + ", time=" + time
				+ ", city=" + city + ", outlet=" + outlet + "]";
	}
	


}
