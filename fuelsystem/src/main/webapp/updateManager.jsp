<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	String id =request.getParameter("id");
	String name=request.getParameter("name");
	String branch=request.getParameter("branch");
	String tel=request.getParameter("tel");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String address=request.getParameter("address");
	String startdate=request.getParameter("startdate");
	

%>

<div class="container p-5 my-5 bg-dark text-white">

	<form method = "post" action="updateSerManage">
	
	<div class="mb-3">
        <label class="form-label" for="id" >MID</label>
        <input type="text" value="<%=id%>" readonly name="id" class="form-control" id="inputid">
    </div>

    <div class="mb-3">
        <label class="form-label" for="inputname" >Name</label>
        <input type="text" name="name" class="form-control" id="inputname" value="<%=name%>" placeholder="Eg:P.K.D.Perera">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="branch">Branch</label>
        <input type="text" name="branch" class="form-control" id="branch" value="<%=branch%>" placeholder="Eg:077xxxxxxx">
    </div>
    
     <div class="mb-3">
        <label class="form-label" for="tel">Contact</label>
        <input type="text" name="tel" class="form-control" id="tel" value="<%=tel%>" placeholder="Eg:Matara,Akuressa">
    </div>
     <div class="mb-3">
        <label class="form-label" for="email">Email</label>
        <input type="email" name="email" class="form-control" id="email" value="<%=email%>" placeholder="NIC">
    </div>
    <div class="mb-3">
        <label class="form-label" for="pass">password</label>
        <input type="password" name="password" class="form-control" id="pass" value="<%=password%>" placeholder="NIC">
    </div>
    <div class="mb-3">
        <label class="form-label" for="add">address</label>
        <input type="text" name="address" class="form-control" id="add" value="<%=address%>" placeholder="NIC">
    </div>
    <div class="mb-3">
        <label class="form-label" for="date">Startdate</label>
        <input type="text" name="startdate" class="form-control" id="date" value="<%=startdate%>" placeholder="NIC">
    </div>
    
    <button type="submit" class="btn btn-primary" name="sub">Update Details</button>
    </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>