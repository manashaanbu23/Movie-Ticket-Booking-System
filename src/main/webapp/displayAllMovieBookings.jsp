<%@ page import="java.util.*" %>
<%@ page import="com.wipro.movie.bean.MovieBookingBean" %>
<html>
<body>
<%
List<MovieBookingBean> list =
(List<MovieBookingBean>) request.getAttribute("list");
if(list == null || list.isEmpty()){
%>
<h3>No records available!</h3>
<%
}else{
for(MovieBookingBean bean : list){
%>
<hr>
Record ID: <%= bean.getRecordId() %><br>
Customer Name: <%= bean.getCustomerName() %><br>
Movie Name: <%= bean.getMovieName() %><br>
Show Time: <%= bean.getShowTime() %><br>
Seat No: <%= bean.getSeatNo() %><br>
Ticket No: <%= bean.getTicketNo() %><br>
Remarks: <%= bean.getRemarks() %><br>

<%
}
}
%>
<a href="menu.html">Go Back</a>
</body>
</html>
