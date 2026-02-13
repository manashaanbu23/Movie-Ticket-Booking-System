🎬 Movie Ticket Booking System (JSP + Servlet + JDBC)
📌 Project Description

This project is a Movie Ticket Booking System web application developed using JSP, Servlets, JDBC, and Oracle Database.
It allows users to:

Add Movie Ticket Booking details

View a specific booking record

View all booking records

🎯 Project Objective

To create an online application for entering and managing movie ticket booking details such as:

Customer Name

Movie Name

Show Time

Seat Number

Ticket Number

Remarks

🛠️ Technologies Used

Java (JDK 8 or above)

JSP & Servlets

JDBC

Oracle Database

Apache Tomcat Server

HTML

📦 MovieTicketBookingSystem
 ┣ 📂 src
 ┃ ┣ 📂 com.wipro.movie.util
 ┃ ┃ ┣ 📜 DBUtil.java
 ┃ ┃ ┗ 📜 InvalidInputException.java
 ┃ ┣ 📂 com.wipro.movie.bean
 ┃ ┃ ┗ 📜 MovieBookingBean.java
 ┃ ┣ 📂 com.wipro.movie.dao
 ┃ ┃ ┗ 📜 MovieBookingDAO.java
 ┃ ┣ 📂 com.wipro.movie.service
 ┃ ┃ ┗ 📜 Administrator.java
 ┃ ┗ 📂 com.wipro.movie.servlets
 ┃   ┗ 📜 MainServlet.java
 ┣ 📂 WebContent
 ┃ ┣ 📜 menu.html
 ┃ ┣ 📜 addMovieBooking.jsp
 ┃ ┣ 📜 viewMovieBooking.jsp
 ┃ ┣ 📜 viewAllMovieBookings.jsp
 ┃ ┣ 📜 displayMovieBooking.jsp
 ┃ ┣ 📜 displayAllMovieBookings.jsp
 ┃ ┣ 📜 success.html
 ┃ ┗ 📜 error.html
 ┗ 📜 README.md

⚙️ Features
✅ Add Movie Ticket Booking

Inserts booking details into the database

Redirects to:

success.html if insert is successful

error.html if insert fails

✅ View Movie Ticket Booking

Fetch record based on:

Customer Name

Show Time

If record exists → display details

Else → show message:
"No matching records exists! Please try again!"

✅ View All Movie Bookings

Displays all records in the database

If no records → show message:
"No records available!"

🧾 Record ID Format

Record ID is generated in this format:

YYYYMMDD + first two letters of CustomerName + SequenceNumber

Example:

20240625CU11

🚀 How to Run the Project
Step 1: Import Project

Open Eclipse

File → Import → Existing Projects into Workspace

Select the project folder

Step 2: Configure Database

Add Oracle JDBC Driver (ojdbc.jar) in Build Path

Update DBUtil.java with your database credentials

Step 3: Configure Tomcat

Add Apache Tomcat Server in Eclipse

Right click project → Run As → Run on Server

Step 4: Run Application

Open browser and run:

http://localhost:8080/YourProjectName/menu.html

📄 Pages Included

<img width="971" height="423" alt="image" src="https://github.com/user-attachments/assets/e8047f81-5d75-4a99-bdd3-420f62780b08" />
<img width="843" height="525" alt="image" src="https://github.com/user-attachments/assets/a84a2308-5797-4bfc-a677-0841476c89db" />
<img width="885" height="296" alt="image" src="https://github.com/user-attachments/assets/21247c14-7402-4ec8-85c7-d29da7608f0d" />
<img width="885" height="336" alt="image" src="https://github.com/user-attachments/assets/42c06e83-025c-4d0e-8900-84dbbb030325" />
<img width="760" height="601" alt="image" src="https://github.com/user-attachments/assets/618c4b05-da8e-4aea-be19-6ca5faef1058" />
<img width="843" height="922" alt="image" src="https://github.com/user-attachments/assets/189fafe1-5845-4a28-8a74-0c3c1e26c551" />

Page Name	Description

menu.html	Main menu with links

addMovieBooking.jsp	Add booking form

viewMovieBooking.jsp	View specific booking form

viewAllMovieBookings.jsp	View all records form

displayMovieBooking.jsp	Display booking result

displayAllMovieBookings.jsp	Display all records

success.html	Shows success message

error.html	Shows error message

✅ Sample Validations

Customer Name should contain minimum 2 characters

Show Time should not be empty

Duplicate booking not allowed

👨‍💻 Author

Name: Manasha A

Project: Movie Ticket Booking System

Technology: JSP + Servlet + JDBC + Oracle
