package com.wipro.movie.service;

import java.util.List;

import com.wipro.movie.bean.MovieBookingBean;
import com.wipro.movie.dao.MovieBookingDAO;
import com.wipro.movie.util.InvalidInputException;

public class Administrator {
	public String addRecord(MovieBookingBean movieBean)throws InvalidInputException {
		if(movieBean==null||movieBean.getCustomerName()==null||movieBean.getShowTime()==null){
			throw new InvalidInputException();
		}
		if(movieBean.getCustomerName().length()<2) {
			return "INVALID CUSTOMER NAME";
		}
		if(movieBean.getShowTime().trim().isEmpty()) {
			return  "INVALID SHOW TIME" ;
		}
		MovieBookingDAO dao =new MovieBookingDAO();
		if(dao.recordExists( movieBean.getCustomerName(),movieBean.getShowTime() )) {
			return "ALREADY EXISTS";
		}
		String recordID=dao.generateRecordID( movieBean.getCustomerName(),movieBean.getShowTime());
		movieBean .setRecordId(recordID);
		return dao.createRecord(movieBean);				
	}
	public MovieBookingBean viewRecord(String customerName, String showTime) {
		MovieBookingDAO dao = new MovieBookingDAO();
	    return dao.fetchRecord(customerName, showTime);
	}
	public List<MovieBookingBean> viewAllRecords(){
		  MovieBookingDAO dao = new MovieBookingDAO();
	      return dao.fetchAllRecords();
	}
}
