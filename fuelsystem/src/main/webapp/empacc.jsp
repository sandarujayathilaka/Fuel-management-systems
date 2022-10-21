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
<c:forEach var="emp"  items="${empdetails}">

<c:set var="id" value="${emp.id}" />
<c:set var="name" value="${emp.name}" />
<c:set var="address" value="${emp.address}" />
<c:set var="tel" value="${emp.tel}" />
<c:set var="nic" value="${emp.nic}" />

<tr>
<td>Employer ID</td>
<td>${emp.id}</td>
</tr>
<tr>
<td>Employer Name</td>
<td>${emp.name}</td>
</tr>

<tr>
<td>Employer Address</td>
<td>${emp.address}</td>
</tr>

<tr>
<td>Contact Number</td>
<td>${emp.tel}</td>
</tr>

<tr>
<td>Nic</td>
<td>${emp.nic}</td>
</tr>


</c:forEach>
</table>

<c:url value="UpdateEmp.jsp" var="empUpdate">
	
	<c:param name="id" value="${id}"></c:param>
	<c:param name="name" value="${name}"></c:param>
	<c:param name="address" value="${address}"></c:param>
	<c:param name="tel" value="${tel}"></c:param>
	<c:param name="nic" value="${nic}"></c:param>

</c:url>

<a href="${empUpdate}">
<input type ="button" name ="update" value="update">
</a>

<c:url value="deleteEmp.jsp" var="empDelete">
	
	<c:param name="id" value="${id}"></c:param>
	<c:param name="name" value="${name}"></c:param>
	<c:param name="address" value="${address}"></c:param>
	<c:param name="tel" value="${tel}"></c:param>
	<c:param name="nic" value="${nic}"></c:param>

</c:url>

<a href="${empDelete}">
<input type ="button" name="delete" value ="Delete Account">
</a>
</body>
</html>