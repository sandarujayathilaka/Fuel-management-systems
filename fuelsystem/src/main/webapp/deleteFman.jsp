<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

	<form method = "post" action="deleteFMan">
	
	<div class="mb-3">
        <label class="form-label" for="id" >FID</label>
        <input type="text" value="<%=id%>" readonly name="id" class="form-control" id="inputid">
    </div>

    <div class="mb-3">
        <label class="form-label" for="inputname" >Name</label>
        <input type="text" name="name" class="form-control" id="inputname" value="<%=name%>" placeholder="Eg:P.K.D.Perera">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="branch">NIC</label>
        <input type="text" name="nic" class="form-control" id="nic" value="<%=nic%>" placeholder="Eg:077xxxxxxx">
    </div>
    
     <div class="mb-3">
        <label class="form-label" for="tel">Contact</label>
        <input type="text" name="tel" class="form-control" id="tel" value="<%=tel%>" placeholder="Eg:Matara,Akuressa">
    </div>
     <div class="mb-3">
        <label class="form-label" for="email">Status</label>
        <input type="text" name="marit" class="form-control" id="marit" value="<%=marit%>" placeholder="NIC">
    </div>
    <div class="mb-3">
        <label class="form-label" for="pass">password</label>
        <input type="password" name="password" class="form-control" id="pass" value="<%=password%>" placeholder="NIC">
    </div>
    <div class="mb-3">
        <label class="form-label" for="add">address</label>
        <input type="text" name="address" class="form-control" id="add" value="<%=address%>" placeholder="NIC">
    </div>
    
    
    <button type="submit" class="btn btn-primary" name="sub">Delete Manager</button>
    </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>