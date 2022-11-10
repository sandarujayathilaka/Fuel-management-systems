<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add fuel</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
 <link rel="stylesheet" href="Asserts/Css/form.css">
</head>
<body>

<div class="container p-5 my-5 bg-dark text-white">

		<form method="Post" action="addFueldata" name="resourcedData">
		
		
			<div class="mb-3">
				<label class="form-label" for="inputname">Category :</label>
				<select id="cate" name="cate">
				<option value="diesel">Diesel</option>
				<option value="petrol">Petrol</option>
				</select> 
				
			</div>

			<div class="mb-3">
				<label class="form-label" for="date">Date</label> <input
					type="date" name="date" class="form-control" id="date">
			</div>

			<div class="mb-3">
				<label class="form-label" for="inputname">Transport cost</label> <input
					type="number" step=0.01 name="tcost" class="form-control" id="tcost"
					placeholder="500.0">
			</div>

			<div class="mb-3">
				<label class="form-label" for="tax">Tax</label> <input
					type="number" step=0.01 name="tax" class="form-control" id="tax"
					placeholder="1000.0">
			</div>

			<div class="mb-3">
				<label class="form-label" for="Address">dispenser Maintain Cost</label> <input
					type="number" step=0.01 name="dispenser" class="form-control" id="dispenser"
					placeholder="5000.0">
			</div>

			<div class="mb-3">
				<label class="form-label" for="pass">Initial Quantity(liter)</label> <input
					type="number" step=0.01 name="initqun" class="form-control" id="initqun"
					placeholder="50000.0">
			</div>

			<div class="mb-3">
				<label class="form-label" for="inputname">Day Price</label> <input
					type="number" step=0.01 name="dprice" class="form-control" id="dprice"
					placeholder="147.50">
			</div>
			
			<div class="mb-3">
				<label class="form-label" for="inputname">Rest Quantity(liter)</label> <input
					type="number" step=0.01 name="rqun" class="form-control" id="rqun"
					placeholder="600.0">
			</div>
			
			<div class="mb-3">
				<label class="form-label" for="inputname">Profit Share(percentage)</label> <input
					type="number" step=0.01 name="share" class="form-control" id="share"
					placeholder="5">
			</div>
			<br>

			<button type="submit" class="btn btn-primary" name="sub">Record Day Info</button>
		</form>
	</div>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>