package com.wipro.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wipro.movie.bean.MovieBookingBean;
import com.wipro.movie.util.DBUtil;

public class MovieBookingDAO {
	public String createRecord(MovieBookingBean movieBean) {
		String result="Fail";
		Connection con = DBUtil.getDBConnection();
		String sql = "INSERT INTO MOVIEBOOK_TB VALUES(?,?,?,?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, movieBean.getRecordId());
			ps.setString(2, movieBean.getCustomerName());
			ps.setString(3, movieBean.getMovieName());
			ps.setString(4, movieBean.getShowTime());
			ps.setString(5, movieBean.getSeatNo());
			ps.setString(6, movieBean.getTicketNo());
			ps.setString(7, movieBean.getRemarks());
			int rows=ps.executeUpdate();
			if(rows>0) {
				con.commit(); 
				return movieBean.getRecordId();
			}
			}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public MovieBookingBean fetchRecord(String customerName, String showTime) {
		MovieBookingBean bean =null;
		Connection con = DBUtil.getDBConnection();
		String sql = "SELECT * FROM MOVIEBOOK_TB WHERE CUSTOMERNAME=? AND SHOWTIME=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerName);
			ps.setString(2, showTime);
			ResultSet rs= ps.executeQuery();
			if(rs.next()){
	            bean = new MovieBookingBean();
	            bean.setRecordId(rs.getString(1));
	            bean.setCustomerName(rs.getString(2));
	            bean.setMovieName(rs.getString(3));
	            bean.setShowTime(rs.getString(4));
	            bean.setSeatNo(rs.getString(5));
	            bean.setTicketNo(rs.getString(6));
	            bean.setRemarks(rs.getString(7));
	        }

	    }catch(Exception e){
	        e.printStackTrace();
	    }							
		return bean;
	}
	public String generateRecordID(String customerName, String showTime) {
		String recordID="";
		Connection con = DBUtil.getDBConnection();
		String sql="SELECT MOVIEBOOK_SEQ.NEXTVAL FROM DUAL";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				int seq=rs.getInt(1);
				java.util.Date today=new java.util.Date();
				java.text.DateFormat format=new java.text.SimpleDateFormat("yyyyMMdd");
				String datePart=format.format(today);
				String namePart = customerName.substring(0,2).toUpperCase();
				String seqPart = String.format("%02d", seq);
				recordID=datePart+namePart+seqPart;
				return recordID;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return recordID;
	}
	public boolean recordExists(String 	customerName, String showTime) {
		Connection con = DBUtil.getDBConnection();
		String sql = "SELECT * FROM MOVIEBOOK_TB WHERE CUSTOMERNAME=? AND SHOWTIME=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerName);
			ps.setString(2, showTime);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
	}catch(SQLException e) {
		e.printStackTrace();
	}
		return false;
}
	public List<MovieBookingBean> fetchAllRecords() {
		List<MovieBookingBean> list = new ArrayList<MovieBookingBean>();
		Connection con = DBUtil.getDBConnection();
		String sql="SELECT * FROM MOVIEBOOK_TB";
		try {
		 PreparedStatement ps = con.prepareStatement(sql);
	     ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            MovieBookingBean bean = new MovieBookingBean();
	            bean.setRecordId(rs.getString("RECORDID"));
	            bean.setCustomerName(rs.getString("CUSTOMERNAME"));
	            bean.setMovieName(rs.getString("MOVIENAME"));
	            bean.setShowTime(rs.getString("SHOWTIME"));
	            bean.setSeatNo(rs.getString("SEATNO"));
	            bean.setTicketNo(rs.getString("TICKETNO"));
	            bean.setRemarks(rs.getString("REMARKS"));
	            list.add(bean);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}
}
