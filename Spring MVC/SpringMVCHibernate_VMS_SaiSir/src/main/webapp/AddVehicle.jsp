<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicle Home</title>
</head>
<body>
	<h1>Enter Vehicle  Details:-</h1>
	<form action="add-vehicle" method="post">
		<input type="number" placeholder="Enter VehicleId" name=vehicleId>
		<input type="text" placeholder="Enter Model" name=model>
		<input type="text" placeholder="Enter Brand" name=brand>
		<input type="text" placeholder="Enter Type" name=type>
		<input type="number" placeholder="Enter Price" name=price>
		<input type="submit" value="Add Vehicle">
		
	</form>
</body>
</html>