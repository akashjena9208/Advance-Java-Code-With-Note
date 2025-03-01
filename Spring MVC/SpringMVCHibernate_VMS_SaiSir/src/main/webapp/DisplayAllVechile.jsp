<%@page import="com.jsp.spring.vms.entity.Vehicle"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	List<Vehicle> vehicles=(List) request.getAttribute("vechileList");
	/* List<Vehicle> vehicles = (List) request.getAttribute("vehicleList"); */
	%>

	<table border="3" class="center">
		<tr>
			<th>VehicleId</th>
			<th>Model</th>
			<th>Brand</th>
			<th>Type</th>
			<th>Price</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
		for (Vehicle vehicle : vehicles) {
		%>
			<tr>
			<td><%=vehicle.getVehicleId()%></td>
			<td><%=vehicle.getModel()%></td>
			<td><%=vehicle.getBrand()%></td>
			<td><%=vehicle.getType()%></td>
			<td><%=vehicle.getPrice()%></td>
		</tr>
		
		<td><a href="updateVehicle.jsp?vehicleId=<%= vehicle.getVehicleId() %>">Update</a></td>
        <td><a href="deleteVehicle.jsp?vehicleId=<%= vehicle.getVehicleId() %>">Delete</a></td>
		
	
		<%
		}
		%>

	</table>




</body>
</html>