package com.wipro.movie.bean;

public class MovieBookingBean {
	private String recordId ;
    public String customerName;
    private String movieName ;
    public String showTime ;
    private String seatNo ;
    private String ticketNo ;
    private String remarks ; 
       public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}      
}
