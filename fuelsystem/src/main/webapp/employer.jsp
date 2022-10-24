<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
</head>
<body>

	<form method="post" action="employerdetails">


		Enter Employer ID : <input type="text" name="empid"> <input
			type="submit" class="btn btn-lg btn-success" name="sub">

	</form>

	<form method="post" action="fetchSerMan">

		<input type="submit" name="sub" value="allempdetails">

	</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>