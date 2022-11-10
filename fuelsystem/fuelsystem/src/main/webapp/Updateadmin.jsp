<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
<meta charset="ISO-8859-1">
<title>Update admin</title>
</head>
<body>

<%

	String id =request.getParameter("id");
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String tel=request.getParameter("tel");
	String nic=request.getParameter("nic");
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
%>

<div class="container p-5 my-5 bg-dark text-white">

	<form method = "post" action="updatedetails">
	
	<div class="mb-3">
        <label class="form-label" for="id" >EmpID</label>
        <input type="text" value="<%=id%>" readonly name="id" class="form-control" id="inputid">
    </div>

    <div class="mb-3">
        <label class="form-label" for="inputname" >Name</label>
        <input type="text" name="name" class="form-control" id="inputname" value="<%=name%>" placeholder="Eg:P.K.D.Perera">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="tel">Mobile Number</label>
        <input type="text" name="tel" class="form-control" id="tel" value="<%=tel%>" placeholder="Eg:077xxxxxxx">
    </div>
    
     <div class="mb-3">
        <label class="form-label" for="Address">Address</label>
        <input type="text" name="address" class="form-control" id="Address" value="<%=address%>" placeholder="Eg:Matara,Akuressa">
    </div>
     <div class="mb-3">
        <label class="form-label" for="nic">NIC</label>
        <input type="text" name="nic" class="form-control" id="nic" value="<%=nic%>" placeholder="NIC">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="uname">User Name</label>
        <input type="text" name="uname" class="form-control" id="uname" value="<%=uname%>" placeholder="uname">
    </div>
    
     <div class="mb-3">
        <label class="form-label" for="pass">Password</label>
        <input type="text" name="pass" class="form-control" id="pass" value="<%=pass%>" placeholder="password">
    </div>
    
    <button type="submit" class="btn btn-primary" name="sub">Update Details</button>
    </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>