<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
 <link rel="stylesheet" href="./form.css">
</head>
<body>

<div class="container p-5 my-5 bg-dark text-white">

	<form method = "post" action="insertdata">

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
        <label class="form-label" for="nic">NIC</label>
        <input type="text" name="nic" class="form-control" id="nic" placeholder="Eg:Matara,Akuressa">
    </div>
 
     <div class="mb-3">
        <label class="form-label" for="uname">User Name</label>
        <input type="text" name="uname" class="form-control" id="uname" placeholder="uname">
    </div>
    
     <div class="mb-3">
        <label class="form-label" for="pass">Password</label>
        <input type="text" name="pass" class="form-control" id="pass" placeholder="NIC">
    </div>
    
    <button type="submit" class="btn btn-primary" name="sub">Add Admin</button>
    </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>