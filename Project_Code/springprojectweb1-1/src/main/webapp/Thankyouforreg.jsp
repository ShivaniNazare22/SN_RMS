<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Home Rental Management System--Thank you</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background-image: url('https://images.unsplash.com/photo-1560518883-ce09059eeffa?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cmVudGFsJTIwcHJvcGVydHl8ZW58MHx8MHx8fDA%3D'); /* Add the path to your background image */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            color: #070707;
        }
        .home-container {
            text-align: center;
        }
        h1 {
            font-size: 3em;
            margin-bottom: 20px;
        }
        p {
            font-size: 1.2em;
            margin-bottom: 40px;
        }
        a#link1 {
            display: inline-block;
            padding: 10px 20px;
            background-color: #10497a;
            color: #080101;
            text-decoration: none;
            font-size: 1.2em;
            border-radius: 8%;
        }
        a#link2 {
            display: inline-block;
            padding: 5px 20px;
            background-color: #10497a;
            color: #080101;
            text-decoration: none;
            font-size: 0.8em;
            border-radius: 5px;
            text-align: right;
         
        }
    
        .topnav {
          
            overflow: hidden; /* Clear floats */
            position: relative; /* Positioning context */
        }

        /* Style for the links */
        .topnav a {
            float: right; /* Float the links to the right */
            display: block; /* Display as block-level element */
            color: #060404; /* Text color */
            text-align: right; /* Center the text */
            padding: 14px 16px; /* Padding for better spacing */
            text-decoration: none; /* Remove underline */
        }
        a:hover {
            background-color: #cb1414;
        }
    </style>
     
</head>
<body>
   
<!-- Navigation bar -->


<div class="home-container">
   
    <h1>Thank You for Registration</h1>
    <p>Please login using below button</p>
    <a href="/LoginPage" id="link1" >Login</a>
    
</div>



</body>
</html>
