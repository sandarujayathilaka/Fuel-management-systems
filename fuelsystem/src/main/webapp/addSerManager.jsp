<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
</head>
<body>

<div class="container p-5 my-5 bg-dark text-white">

	<form method = "post" action="insertSmanager">

    <div class="mb-3">
        <label class="form-label" for="inputname" >Name</label>
        <input type="text" name="name" class="form-control" id="inputname" placeholder="Eg:P.K.D.Perera">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="tel">Mobile Number</label>
        <input type="text" name="tel" class="form-control" id="tel" placeholder="Eg:077xxxxxxx">
    </div>
    
     <div class="mb-3">
        <label class="form-label" for="Address">Address</label>
        <input type="text" name="address" class="form-control" id="Address" placeholder="Eg:Matara,Akuressa">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="branch">Branch</label>
        <input type="text" name="branch" class="form-control" id="branch" placeholder="Kandy">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="pass">Password</label>
        <input type="password" name="password" class="form-control" id="pass" placeholder="Hint">
    </div>
    
    <div class="mb-3">
        <label class="form-label" for="sdate">Start Date</label>
        <input type="date" name="startdate" class="form-control" id="sdate" placeholder="sdate">
    </div>
    
    
     <div class="mb-3">
        <label class="form-label" for="email">email</label>
        <input type="email" name="email" class="form-control" id="email" placeholder="userid@redox.com">
    </div>
    
    <button type="submit" class="btn btn-primary" name="sub">Add Service Manager</button>
    </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>