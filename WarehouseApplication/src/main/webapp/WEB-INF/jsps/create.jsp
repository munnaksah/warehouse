<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Warehouse</title>
</head>
<body>
	<h2>Save warehouse here ...</h2>
	
	<h1>Enter the Details here</h1>
	
	

	<form action="save" method="post">
	
	      <pre>
	    <h3> <a href ="list"> View all details</a></h3> 
	     warehouse<input type="text" name="warehouse">
          widgets<input type="text" name="widgets">
          gadgets<input type="text" name="gadgets">
          price<input type="text" name="price">
         title<input type="text" name="title">
         expirydate<input type="text" name="expirydate">
          <input type="submit" value=" save">
             
       
       </pre>






	</form>



</body>
</html>