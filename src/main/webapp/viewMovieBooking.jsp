<html>
<head>
<title>View Movie Booking</title>
</head>
<body>
<h3>View Movie Ticket Booking</h3>
<form action="MainServlet" method="post">
    <input type="hidden" name="operation" value="viewRecord">
    Customer Name: <input type="text" name="customerName"><br><br>
    Show Time: <input type="text" name="showTime"><br><br>
    <input type="submit" value="View Movie Ticket Booking">
</form>

</body>
</html>
