<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Country-Info-Form</title>
<link rel="stylesheet" href="css/country.css" type="text/css"></head>
<body>
<div class="card-header"
		style="background: gray; color: white; padding: 15px; font-size: 10px">Country Info
		</div>

	<div class="container"> 

		<form action="index.doc" method="post">


			<h2>Save Info Of A Country</h2>
			
			<div class="form-group" col-sm-3>
					<label for="email"></label> <input name="email" type="text"
						class="form-control" placeholder="enter email" id="EMAIL">
				</div>
			
			<div class="form-group" col-sm-3>
					<label for="country name"></label> <input name="country name" type="text"
						class="form-control" placeholder="enter country name" id="COUNTRY_NAME">
				</div>
				
				<div class="form-group" col-sm-3>
					<label for="population"></label> <input name="population" type="text"
						class="form-control" placeholder="enter population" id="POPULATION">
				</div>

			<div class="form-group" col-sm-3>
					<label for="Continent"></label> <select class="form-control" name="Continent" id="CONTINENT">
							<option>Select Continent</option>
							<option>Asia</option>
							<option>Africa</option>
							<option>Antarctica</option>
							<option>North America</option>
							<option>South America</option>
							<option>Europe</option>
							<option>Australia</option>
					</select>
					
					
				</div>
			
			<div class="form-group" col-sm-3>
					<label for="capital"></label> <input name="capital"
						type="text" class="form-control" placeholder="capital"
						id="CAPITAL">
				</div>
							
			
			<div>
				<center><input type="submit" value="SAVE" id="butten"></center>
				
				
				<span style="color: yellow; float-size:300pt; font-family: fantasy;">${success}</span>


				<div class="card-footer text-muted"
					style="background: gray; color: white; padding: 15px; font-size: 10px">Copy
					right x-workz</div>

			</div>
		</form>
	</div>
</body>
</html>