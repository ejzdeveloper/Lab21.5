<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mileage Calculator.</title>
<link rel="stylesheet" href="/style.css"/>
</head>
<body>
	<h1>Enter the mileage and gallons.</h1>
</body>
	<form action='/mileage-result'>
		<P> Mileage (MPG): <input type="number" name="mpg" /> </P>
		<P> Gallons in tank: <input type="number" name="gallons" /> </P>
		<P> <button type="submit">Submit</button> </P>
</form>
</html>