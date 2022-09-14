<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> List of All warehouse Details</h2>
<table border = "1">
<h3><a href ="show"> create details</a></h3>
<tr>
<th>Warehouse</th>
<th>Widgets</th>
<th>Gadgets</th>
<th>price</th>
<th>expirydate</th>
<th>title</th>
<th>Delete</th>
<th>Update</th>
</tr>


<c:forEach var ="leads" items ="${leads}">
<tr>
<td>${leads.warehouse}</td>
<td>${leads.widgets}</td>
<td>${leads.gadgets}</td>
<td>${leads.price}</td>
<td>${leads.expirydate}</td>
<td>${leads.title}</td>
<td><a href ="delete?id=${leads.id}">Delete</a></td>
<td><a href ="update?id=${leads.id}">Update</a></td>

</tr>


</c:forEach>
</table>
</body>
</html>