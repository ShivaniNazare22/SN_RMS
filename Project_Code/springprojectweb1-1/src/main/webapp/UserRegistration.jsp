<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration Form</title>
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
            background-position: left;
            background-repeat: no-repeat;
        }
        .form-container {
            background-color: rgba(255, 255, 255, 0.2);
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            box-sizing: border-box;
        }
        .login-form label {
            display: block;
            margin-bottom: 8px;
        }
        .login-form input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }
        .login-form button {
            width: 200%;
            padding: 15px;
            background-color: #12060ddd;
            color: #ca0909;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .login-form button:hover {
            background-color: #e41717;
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
    </style>
</head>
<body>
  
<div class="form-container">

    <h2>User Registration Form</h2>
    <form action="your_registration_script.php" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required>
        <p></p>
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>
        <p></p>
        <label for="phoneNumber">Phone Number:</label>
        <input type="tel" id="phoneNumber" name="phoneNumber" pattern="[0-9]{10}" required>
        <p></p>
        <label for="User ID">User ID:</label>
        <input type="User ID" id="userid" name="userid" required>

        <p></p>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <p></p>
        <label for="UserType">Type of User:</label>
        <select id="UserType" name="UserType" required>
            <option value="Owner">Owner</option>
            <option value="Tenant">Tenant</option>
    
            <!-- Add more options as needed -->
        </select>
        <p></p>
        
        <button type="submit">Register</button>


        
    </form>
</div>

</body>
</html>
