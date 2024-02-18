<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bike Information Form</title>
</head>
<body>

    <h2>Bike Information Form</h2>

    <form action="/garage-management/bikeServlet" method="POST">
        <label for="bikeId">Bike ID:</label>
        <input type="text" id="bikeId" name="bike_id"><br>

        <label for="make">Make:</label>
        <input type="text" id="make" name="make"><br>

        <label for="model">Model:</label>
        <input type="text" id="model" name="model"><br>

        <label for="color">Color:</label>
        <input type="text" id="color" name="color"><br>

        <label for="numberPlate">Number Plate:</label>
        <input type="text" id="numberPlate" name="numberPlate"><br>

        <label for="year">Year:</label>
        <input type="text" id="year" name="year"><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
