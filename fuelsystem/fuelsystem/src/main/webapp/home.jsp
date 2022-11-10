<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="Asserts/Css/UI.css">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
<title>Admin Dashboard</title>
</head>
<body>

<div class="dash">
<h1 >Welcome to Admin Dashboard </h1>
<img id="logo1" src="Asserts/images/Last.png">
</div>

 <nav>
 
 <div id="logbtn">
    <a href="#"><button class="log">Logout</button></a>
   </div>
</nav>

<div id="verticalnav">

<div id="adminbanner">

<img id="logo" src="Asserts/images/Last.png">

</div>

<ul>
     <li class="list"><a href="home.jsp"><img id="img1" src="Asserts/images/12.png"> Dashboard</a></li>                             
     <li class="list"><a href="allempdetails"><img id="img1" src="Asserts/images/admin.png"> Admin</a></li>
     <li class="list"><a href="SerManAllServlet"><img id="img1" src="Asserts/images/user.png">Service Manager</a></li>
     <li class="list"><a href="FuelManAllServlet"><img id="img1" src="Asserts/images/user.png"> Fuel Manager</a></li>
     <li class="list"><a href="DieselFuelData"><img id="img1" src="Asserts/images/contact.png"> Diesel Info</a></li>
     <li class="list"><a href="petrolAllData"><img id="img1" src="Asserts/images/contact.png"> Petrol Info</a></li>
     <li class="list"><a href="addFuel.jsp"><img id="img1" src="Asserts/images/contact.png"> Add Fuel Data</a></li>
     

</ul>

</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>