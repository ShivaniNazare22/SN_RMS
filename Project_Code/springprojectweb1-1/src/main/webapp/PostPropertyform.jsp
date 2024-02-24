<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Property Details Form</title>
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
    </style>
</head>
<body>

<div class="form-container">
    <h2>Property Details Form</h2>
    <form action="your_processing_script.php" method="post">
        <label for="propertyType">Property Type:</label>
        <select id="propertyType" name="propertyType" required>
            <option value="apartment">Apartment</option>
            <option value="house">House</option>
            <option value="condo">Condo</option>
            <!-- Add more options as needed -->
        </select>
        <p></p>
        <label for="buildingName">Building Name:</label>
        <input type="text" id="buildingName" name="buildingName" required>
        <p></p>
        <label for="locality">Locality:</label>
        <input type="text" id="locality" name="locality" required>
        <p></p>
        <label for="City">City:</label>
        <input type="text" id="City" name="City" required>
        <p></p>
        <label for="ZipCode">ZipCode:</label>
        <input type="text" id="ZipCode" name="ZipCode" required>
        <p></p>
        <label for="bhkType">Type of BHK:</label>
        <select id="bhkType" name="bhkType" required>
            <option value="1">1 BHK</option>
            <option value="2">2 BHK</option>
            <option value="3">3 BHK</option>
            <!-- Add more options as needed -->
        </select>
        <p></p>
        <label for="furnishedType">Furnished Type:</label>
        <select id="furnishedType" name="furnishedType" required>
            <option value="unfurnished">Unfurnished</option>
            <option value="semiFurnished">Semi-furnished</option>
            <option value="fullyFurnished">Fully furnished</option>
            <!-- Add more options as needed -->
        </select>
        <p></p>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
