<html>
<head>
<title>Add Movie Booking</title>
</head>
<body>
<h3>Add Movie Ticket Booking</h3>
<form action="MainServlet" method="post">
    <input type="hidden" name="operation" value="newRecord">
    Customer Name: <input type="text" name="customerName"><br><br>
    Movie Name: <input type="text" name="movieName"><br><br>
    Show Time: <input type="text" name="showTime"><br><br>
    Seat No: <input type="text" name="seatNo"><br><br>
    Ticket No: <input type="text" name="ticketNo"><br><br>
    Remarks: <input type="text" name="remarks"><br><br>
    <input type="submit" value="Add Movie Ticket Booking">
</form>

</body>
</html>
