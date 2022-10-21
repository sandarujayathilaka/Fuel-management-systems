<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">

<tr>
<th>Employer ID</th>
<th>Employer Name</th>
<th>Employer Address</th>
<th>Contact Number</th>
<th>NIC</th>
</tr>

<c:forEach var="emp"  items="${empdetails}">

<c:set var="id" value="${emp.id}" />
<c:set var="name" value="${emp.name}" />
<c:set var="address" value="${emp.address}" />
<c:set var="tel" value="${emp.tel}" />
<c:set var="nic" value="${emp.nic}" />


<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.address}</td>
<td>${emp.tel}</td>
<td>${emp.nic}</td>
</tr>


</c:forEach>
</table>



</body>
</html>