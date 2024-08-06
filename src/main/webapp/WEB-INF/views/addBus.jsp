<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Add Bus</h2>
    <form action="addbuses" method="post">
        <label for="busname">Bus Name:</label>
        <input type="text" id="busname" name="busname" required><br>
        <label for="location">Location:</label>
        <input type="text" id="location" name="location" required><br>
        <label for="ticketPrice">Ticket Price:</label>
        <input type="number" step="0.01" id="ticketPrice" name="ticketPrice" required><br>
        <input type="submit" value="Add Bus">
    </form>
</body>
</html>






