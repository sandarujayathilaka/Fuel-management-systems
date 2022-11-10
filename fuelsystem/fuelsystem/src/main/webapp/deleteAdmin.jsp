<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
<meta charset="ISO-8859-1">
<title>Delete Admin</title>
</head>
<body>

<%

	String id =request.getParameter("id");
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String tel=request.getParameter("tel");
	String nic=request.getParameter("nic");

%>

<div class="container p-5 my-5 bg-dark text-white">

	<form method = "post" action="deletedetails">
	
	<div class="mb-3">
        <label class="form-label" for="id" >EmpID</label>
        <input type="text" value="<%=id%>" readonly name="id" class="form-control" id="inputid">
    </div>

    <div class="mb-3">
        <label class="form-label" for="inputname" >Name</label>
        <input type="text" name="name" class="form-control" id="inputname" value="<%=name%>" readonly >
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="tel">Mobile Number</label>
        <input type="text" name="tel" class="form-control" id="tel" value="<%=tel%>" readonly>
    </div>
    
     <div class="mb-3">
        <label class="form-label" for="Address">Address</label>
        <input type="text" name="address" class="form-control" id="Address" value="<%=address%>" readonly>
    </div>
     <div class="mb-3">
        <label class="form-label" for="nic">Address</label>
        <input type="text" name="nic" class="form-control" id="nic" value="<%=nic%>" readonly>
    </div>
    
    <button type="submit" class="btn btn-primary " name="sub">Delete User</button>
    </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>