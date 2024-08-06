<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Details</title>
</head>
<body>
<div align="center">
<h2> Bus Details</h2>
 
<table border="1">
      <th>Bus Name :</th>
      <th>Location :</th>
      <th>Ticket Price :</th>
<c:forEach var="list" items="${buses}">
   <tr>
     <td> ${list.busname} </td>
     <td> ${list.location} </td>
     <td> ${list.ticketPrice} </td>
   </tr>
</c:forEach>
</table>
</div>
</body>
</html>