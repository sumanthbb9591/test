<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Page</title>
</head>
<body>
<form action="order" method ="post">
<h2>Order Here.....</h2>
<hr>
<table>
<tr><td>OrderDate: <input type="text" name="orderDate"/></td></tr>
<tr><td>OrderStatus : <input type="checkbox" name="orderStatus"/></td></tr>
<tr><td>collectionOfItems : <input type="number" name="collectionOfItems"/></td></tr>
<tr><td><input type = "submit" value="save"/></td></tr>
</table>
</form>

</body>
</html>