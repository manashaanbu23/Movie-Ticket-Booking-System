<%@ page import="com.wipro.movie.bean.MovieBookingBean" %>
<html>
<body>
<%
MovieBookingBean bean =
(MovieBookingBean) request.getAttribute("bean");
if(bean == null){
%>
<h3>No matching records exists! Please try again!</h3>
<%
}else{
%>
<h3>Movie Booking Details</h3>
Record ID: <%= bean.getRecordId() %><br><br>
Customer Name: <%= bean.getCustomerName() %><br><br>
Movie Name: <%= bean.getMovieName() %><br><br>
Show Time: <%= bean.getShowTime() %><br><br>
Seat No: <%= bean.getSeatNo() %><br><br>
Ticket No: <%= bean.getTicketNo() %><br><br>
Remarks: <%= bean.getRemarks() %><br><br>
<%
}
%>
<a href="menu.html">Go Back</a>
</body>
</html>
