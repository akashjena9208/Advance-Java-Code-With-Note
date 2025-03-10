<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nyaya Login</title>
    <link rel="icon" href="img/favicon.jpg">
    <!-- CSS only -->

    <style>
        *{
            margin: 0;
            padding:0;
            font-family: sans-serif;
        }
        .hero{
            height: 100vh;
            width: 100vw;
            background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/bg_img.jpeg);
            background-position: center;
            background-size: cover;
            position: absolute;
          }
          .form-box{
            width: 380px;
            height: 480px;
            position: relative;
            margin: 6% auto;
            background: #fff;
            padding: 5px;
            overflow: hidden;
          }
          .button-box{
            margin: 35px auto;
            position: relative;
          }
          .button-box h1{
            text-align: center;
            cursor: pointer;
          }
          .input-group{
            top: 180px;
            position: absolute;
            width: 280px;
            transition: .5s;
          }
          .input-field{
            width: 100%;
            padding: 10px 0;
            margin: 5px  0;
            border-left: 0;
            border-right: 0;
            border-top:0;
            border-bottom: 1px solid #999;
            outline: none;
            background: transparent;
          }
          .submit-btn{
            width:85% ;
            padding: 10px 30px;
            display: block;
            margin: 50px auto;
            background: linear-gradient(to right , #ff105f,#ffad06);
            border: 0;
            outline: none;
            border-radius: 30px;
            cursor: pointer;
          }
          span{
            color: #777;
            font-size: 12px;
            bottom: 68px;
          }
          span a{
            text-decoration: none;
          }
          
          #login{
            left: 50px;
          }
          .type{
            margin-left: 40px;
            margin-top: 50px;
          }
          .type input{
            margin-left:15px;
            margin-right: 10px;
          }
          
    </style>
    
    
</head>
<body>

	 <div class="hero">
        <div class="form-box">
            <div class="button-box">
                <div id="btn"></div>
                <h1>Login</h1>
            </div>
            <div class="type">
              <input type="radio" name="login" id="User" Value="User">User
              <input type="radio" name="login" id="Advocate" Value="Advocate">Advocate
              <input type="radio" name="login" id="Admin" Value="Admin">Admin
            </div>
            <form class="input-group" id="login">
                <input type="text" class="input-field" placeholder="Username" required/>
                <input type="password" class="input-field" placeholder="Enter Password" required/><br><br>
                <span>If You Don't have an account then <a href="register.html">SignUp</a></span>
                <button type="submit" class="submit-btn">Log-In</button>
            </form>
        </div>
        
    </div>

    <script src="script.js"></script>

</body>
</html>