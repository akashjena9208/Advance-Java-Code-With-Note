<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Vehicle Management System</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">
    <style>
        /* General Styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        body {
            background: linear-gradient(to right, #667eea, #764ba2);
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }

        h1 {
            color: white;
            font-size: 32px;
            font-weight: 600;
            margin-bottom: 20px;
            text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
        }

        /* Card Container */
        .container {
            background: white;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.2);
            width: 400px;
            text-align: center;
            transition: 0.3s;
        }

        .container:hover {
            transform: scale(1.05);
        }

        /* Buttons */
        .btn {
            display: block;
            text-decoration: none;
            background: #28a745;
            color: white;
            padding: 12px 20px;
            border-radius: 8px;
            margin: 15px 0;
            font-size: 18px;
            font-weight: 500;
            transition: 0.3s ease-in-out;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
        }

        .btn:hover {
            background: #218838;
            transform: translateY(-3px);
            box-shadow: 0px 6px 12px rgba(0, 0, 0, 0.3);
        }

        /* Responsive Design */
        @media (max-width: 480px) {
            .container {
                width: 90%;
            }
        }
    </style>
</head>
<body>
    <h1>Welcome to the Vehicle Management System</h1>
    <div class="container">
        <a href="AddVehicle.jsp" class="btn">🚗 Add New Vehicle</a>
        <a href="display-all-vehicle" class="btn">📋 Display All Vehicles</a>
    </div>
</body>
</html>
