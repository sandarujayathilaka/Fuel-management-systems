<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
<meta charset="ISO-8859-1">
<title>delete petrol</title>
</head>
<body>

<%
	
	String pid = request.getParameter("id");
	String date =request.getParameter("date");
	String tcost=request.getParameter("tcost");
	String tax=request.getParameter("tax");
	String dispenser=request.getParameter("dispenser");
	String initqun=request.getParameter("initqun");
	String dprice=request.getParameter("dprice");
	String rqun=request.getParameter("rqun");
	String share=request.getParameter("share");
	
	
%>


<div class="container p-5 my-5 bg-dark text-white">

		<form method="post" action="deletePetrol" name="resourcedData">

			<div class="mb-3">
				<label class="form-label" for="date">Date</label> <input
					type="date" name="date" value="<%=date%>"  class="form-control" id="date"
					readonly>
			</div>

			<div class="mb-3">
				<label class="form-label" for="inputname">Transport cost</label> <input
					type="number" step=0.01 name="tcost" value="<%=tcost%>"  class="form-control" id="tcost"
					readonly>
			</div>

			<div class="mb-3">
				<label class="form-label" for="tax">Tax</label> <input
					type="number" step=0.01 name="tax" value="<%=tax%>" class="form-control" id="tax"
					readonly>
			</div>

			<div class="mb-3">
				<label class="form-label" for="Address">dispenser Maintain Cost</label> <input
					type="number" step=0.01 name="dispenser" value="<%=dispenser%>"  class="form-control" id="dispenser"
					readonly>
			</div>

			<div class="mb-3">
				<label class="form-label" for="pass">Initial Quantity</label> <input
					type="number" step=0.01 name="initqun" value="<%=initqun%>"  class="form-control" id="initqun"
					readonly>
			</div>

			<div class="mb-3">
				<label class="form-label" for="inputname">Day Price</label> <input
					type="number" step=0.01 name="dprice" value="<%=dprice%>"  class="form-control" id="dprice"
					readonly>
			</div>
			
			<div class="mb-3">
				<label class="form-label" for="inputname">Rest Quantity</label> <input
					type="number" step=0.01 name="rqun" value="<%=rqun%>"  class="form-control" id="rqun"
					readonly>
			</div>
			
			<div class="mb-3">
				<label class="form-label" for="inputname">Profit Share</label> <input
					type="number" step=0.01 name="share" value="<%=share%>"  class="form-control" id="share"
					readonly>
			</div>
			
			<div class="mb-3">
				<label class="form-label" for="pid">ID</label> <input
					type="number"  name="pid" value="<%=pid%>"  class="form-control" id="pid"
					readonly>
			</div>
			
			<br>

			<button type="submit" class="btn btn-primary" name="sub">Delete</button>
		</form>
	</div>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>