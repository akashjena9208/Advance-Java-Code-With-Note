<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Nyaya : Conquore The Truth.</title>

    <link rel="stylesheet" href="style.css">
    <link rel="icon" href="img/favicon.jpg">

    <style>
        * {
            margin: 0%;
            padding: 0%;
        }

        .admin {
            width: 100vw;
            height: 100vh;
        }

        .admin-nav nav {
            height: 75px;
            line-height: 75px;
            background-image: linear-gradient(to right, white, rgb(246, 226, 226));
        }

        nav ol li img{
            height: 50px;
            width: 50px;
            border: 1px solid black;
            border-radius: 50px;
            margin-right: 50px;
            margin-top: 35px;
            box-shadow: rgba(0, 0, 0, 0.2),rgba(0, 0, 0, 0.2);
        }
        nav ol li h2{
            font-weight: 400;
            margin-right: -10px;
        }
        .admin-container{
            height: 28vh;
            width: 90vw;
            display: flex;
            margin-left: 5vw;
            margin-top: 40px;
        }
        .admin-section{
            height: 200px;
            width: 465px;
            margin: 7.5px;
            padding: 17px;
            
        }
        .admin-section h3{
            color: white;
            font-size: 35px;
            font-weight: 800;
            text-align: end;
            margin-right: 35px;
            margin-top: 38px;
        }
        .admin-section h2{
            margin-left: 10px;
        }
        .admin-section h5{
            margin-left: 10px;
        }
        .chart img{
            width: 99vw;
            margin-left: 0.5vw;
        }
    </style>
</head>
<body>
 <section class="admin" id="admin">
        <section class="admin-nav">
            <div class="nav">
                <nav style=" box-shadow: 0 0 20px 0px rgba(0, 0, 0, 0.2);">
                  <h1 style="color: black;">Nyaya</h1>
                  
                  <ol>
                    <li><h2>Chandan Kumar Sahu</h2></li>
                    <li><img src="img/admin.JPG" alt="user"></li>
                  </ol>
                </nav>
              </div>
        </section>
        <!--admin-dashbord section-->

        <section class="admin-container" id="admin-contaner">
            <div class="admin-section" style="background-color:  rgb(10, 139, 224);">
                <h3>512</h3>
                <br>
                <h2>Registerd User</h2>
                <br>
                <h5>Total Audience Registerd</h5>
            </div>
            <div class="admin-section" style="background-color: rgb(18, 67, 201);">
                <h3>97</h3>
                <br>
                <h2>Registerd Lawyer</h2>
                <br>
                <h5>Number of Registerd Advocate</h5>
            </div>
            <div class="admin-section" style="background-color: red;">
                <h3>115</h3>
                <br>
                <h2>Daily Visiters</h2>
                <br>
                <h5>Total Audience Visited Daily</h5>
            </div>
            <div class="admin-section" style="background-color: green;">
                <h3>57</h3>
                <br>
                <h2>Inbox</h2>
                <br>
                <h5>Recived Mails</h5>
            </div>
        </section>

        <!----- Chart Section------->

        <section class="chart">
            <img src="https://cloud4wi.zendesk.com/hc/article_attachments/360055840591/mceclip0.png" alt="chart">
        </section>
    </section>
</body>
</html>