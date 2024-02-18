<!-- JSP Directive -->
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Garage Management System" %></h1>

<!-- JSP Declarations -->
<%! Date date = new Date(); %>
<%! String text = "The current date and time is "; %>

<!-- JSP Expression -->
<p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p>

<br/>
<a href="add-bike.jsp">Add Bike</a>
</body>
</html>