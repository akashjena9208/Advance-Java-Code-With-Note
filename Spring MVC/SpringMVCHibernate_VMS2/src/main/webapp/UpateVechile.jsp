<%@page import="com.jsp.spring.vms.entity.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%Vehicle v=(Vehicle) request.getAttribute("vechileObject"); %>
	<h1>Enter Vehicle  Details:-</h1>
	<form action="save-upate-vehicle" method="put">
		<input type="number" value="<%v.getVehicleId();%>" name=vehicleId>
		<input type="text" value="<%v.getModel(); %>" name=model>
		<input type="text" value="<%v.getBrand(); %>" name=brand>
		<input type="text" value="<%v.getType(); %>" name=type>
		<input type="number" value="<%v.getPrice(); %>"name=price>
		<input type="submit" value="Update Vehicle">
		
	</form>
	
	

</body>
</html>