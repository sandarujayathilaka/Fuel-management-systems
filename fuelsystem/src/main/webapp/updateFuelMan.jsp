<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Update fuel Man</title>
</head>
<body>

	<%

	String id =request.getParameter("id");
	String name=request.getParameter("name");
	String tel=request.getParameter("tel");
	String nic=request.getParameter("nic");
	String password=request.getParameter("password");
	String address=request.getParameter("address");
	String marit=request.getParameter("marit");
	

%>

	<div class="container p-5 my-5 bg-dark text-white">

		<form method="post" action="UpdateFuelMDetails">

			<div class="mb-3">
				<label class="form-label" for="id">MID</label> <input type="text"
					value="<%=id%>" readonly name="id" class="form-control"
					id="inputid">
			</div>

			<div class="mb-3">
				<label class="form-label" for="inputname">Name</label> <input
					type="text" name="name" class="form-control" id="inputname"
					value="<%=name%>" placeholder="Eg:P.K.D.Perera">
			</div>

			<div class="mb-3">
				<label class="form-label" for="nic">NIC</label> <input type="text"
					name="nic" class="form-control" id="nic" value="<%=nic%>"
					placeholder="Eg:199966330924">
			</div>

			<div class="mb-3">
				<label class="form-label" for="tel">Contact</label> <input
					type="text" name="tel" class="form-control" id="tel"
					value="<%=tel%>" >
			</div>

			<div class="mb-3">
				<label class="form-label" for="pass">password</label> <input
					type="password" name="password" class="form-control" id="pass"
					value="<%=password%>" >
			</div>
			<div class="mb-3">
				<label class="form-label" for="add">address</label> <input
					type="text" name="address" class="form-control" id="add"
					value="<%=address%>" >
			</div>

			<div class="mb-3">
				<label class="form-label" for="inputname">Your Status :</label> <select
					id="status" name="marit">
					<option value="<%=marit%>" selected><%=marit%> (Your Current Selected Field)</option>
					<option value="Married">Married</option>
					<option value="Single">Single</option>
				</select>
			</div>

			<button type="submit" class="btn btn-primary" name="sub">Update
				Details</button>
		</form>
	</div>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>