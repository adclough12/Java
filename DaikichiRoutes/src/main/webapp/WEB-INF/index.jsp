<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Demo JSP</title>
	</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form action = "/omikuji" method = 'GET'>
		<label for = "number" >Pick any number from 5 to 25</label>
		<input type = "range" id = "number" name = "number" min = "5" max = "25">
		<label>Enter the name of any city.</label>
		<input type = "text" name = "city">
		<label>Enter the name of any real person.</label>
		<input type = "text" name = "person">
		<label>Enter professional endeavor or hobby.</label>
		<input type = "text" name = "hobby">
		<label>Enter any type of living thing.</label>
		<input type = "text" name = "creature">
		<label>Say something nice to someone:</label>
		<input type = "text" name = "compliment">
		<p>Send and show a friend</p>
		<label>Send</label>
		<input type = "submit" name = "send">
	</form>
</body>
</html>