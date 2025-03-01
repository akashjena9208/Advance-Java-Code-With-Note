<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicle Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
  body {
    background-color: #f8f9fa;
    font-family: Arial, sans-serif;
  }
  .container {
    margin-top: 50px;
  }
  h1 {
    margin-bottom: 30px;
    text-align: center;
  }
  .form-group {
    margin-bottom: 20px;
  }
  .form-control {
    margin-bottom: 20px;
  }
  .btn-primary {
    background-color: #007bff;
    border-color: #007bff;
  }
  .btn-primary:hover {
    background-color: #0056b3;
    border-color: #0056b3;
  }
  .vehicle-image {
    width: 100px;
    height: auto;
    margin: 10px;
  }
</style>
</head>
<body>
  <div class="container">
    <h1>Enter Vehicle Details</h1>
    <form action="add-vehicle" method="post">
      <div class="form-group">
        <input type="number" class="form-control" placeholder="Enter VehicleId" name="vehicleId" required>
      </div>
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Enter Model" name="model" required>
      </div>
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Enter Brand" name="brand" required>
      </div>
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Enter Type" name="type" required>
      </div>
      <div class="form-group">
        <input type="number" class="form-control" placeholder="Enter Price" name="price" required>
      </div>
      <button type="submit" class="btn btn-primary btn-block">Add Vehicle</button>
    </form>
    <
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.1/js/bootstrap.min.js"></script>
</body>
</html>
