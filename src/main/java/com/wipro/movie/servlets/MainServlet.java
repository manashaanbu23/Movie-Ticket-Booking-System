package com.wipro.movie.servlets;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.movie.bean.MovieBookingBean;
import com.wipro.movie.service.Administrator;
import com.wipro.movie.util.InvalidInputException;
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	  private static final long serialVersionUID = 1L;
	    Administrator admin = new Administrator();
	    public String addRecord(HttpServletRequest request) {
	        MovieBookingBean bean = new MovieBookingBean();
	        bean.setCustomerName(request.getParameter("customerName"));
	        bean.setMovieName(request.getParameter("movieName"));
	        bean.setShowTime(request.getParameter("showTime"));
	        bean.setSeatNo(request.getParameter("seatNo"));
	        bean.setTicketNo(request.getParameter("ticketNo"));
	        bean.setRemarks(request.getParameter("remarks"));
	        try {
	            return admin.addRecord(bean);
	        } catch (InvalidInputException e) {
	            return "INVALID INPUT";
	        }
	    }
	    public MovieBookingBean viewRecord(HttpServletRequest request) {
	        String customerName = request.getParameter("customerName");
	        String showTime = request.getParameter("showTime");
	        return admin.viewRecord(customerName, showTime);
	    }
	    public List<MovieBookingBean> viewAllRecords(HttpServletRequest request) {
	        return admin.viewAllRecords();
	    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       String operation = request.getParameter("operation");
	        if (operation.equals("newRecord")) {
	            String result = addRecord(request);
	            if (result.equals("FAIL") ||
	                result.equals("INVALID INPUT") ||
	                result.equals("INVALID CUSTOMER NAME") ||
	                result.equals("INVALID SHOW TIME") ||
	                result.equals("ALREADY EXISTS")) {
	                response.sendRedirect("error.html");
	            } else {
	                response.sendRedirect("success.html");
	            }
	        }
	        else if (operation.equals("viewRecord")) {
	            MovieBookingBean bean = viewRecord(request);
	            if (bean == null) {
	                response.sendRedirect(
	                        "displayMovieBooking.jsp?msg=No matching records exists! Please try again!");
	            } else {
	                request.setAttribute("bean", bean);
	                RequestDispatcher rd =request.getRequestDispatcher("displayMovieBooking.jsp");

	                rd.forward(request, response);
	            }
	        }
	        else if (operation.equals("viewAllRecords")) {
	            List<MovieBookingBean> list = viewAllRecords(request);
	            if (list.isEmpty()) {
	                response.sendRedirect(
	                        "displayAllMovieBookings.jsp?msg=No records available!");
	            } else {
	                request.setAttribute("list", list);
	                RequestDispatcher rd = request.getRequestDispatcher("displayAllMovieBookings.jsp");
	                rd.forward(request, response);
	            }
	        }
	}

}
