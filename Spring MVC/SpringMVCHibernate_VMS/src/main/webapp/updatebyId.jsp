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
	<%-- <%Vehicle obj=(Vehicle) request.getAttribute("vechileObjectkey"); %>
	
	<h1>Update Vehicle :-</h1>
	<form action="add-vehicle" method="post">
		<input type="number" value="<%=obj.getVehicleId()%>"  name=vehicleId readonly="readonly">
		<input type="text" value="<%= obj.getModel()%>"   name=model><br>
		<input type="text"  value="<%= obj.getVehicleId()%>"  name=brand>
		<input type="text" value="<%= obj.getVehicleId()%>"  name=type>
		<input type="number" value="<%= obj.getVehicleId()%>" name=price>
		<input type="submit" value="Add Vehicle">
		
	</form> --%>
	
	
	<% Vehicle vehicle= (Vehicle)request.getAttribute("vehicleObj");

     %>
     
<body>
<h1>Enter The Updated Fields :-</h1>

<form action="save-updated-vehicle" method="post">
z
<input type="text" value="<%=vehicle.getModel()%>" name="model"><br>
<input type="text" value="<%=vehicle.getBrand()%>" name="brand"> <br>
<input type="text" value="<%=vehicle.getType()%>" name="type"><br>
<input type="number" value="<%=vehicle.getPrice()%>" name="price"><br>
<input type="submit" value="UPDATE">
	
	
</body>
</html>