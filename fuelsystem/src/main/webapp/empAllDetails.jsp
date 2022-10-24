<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file = "UI.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
</head>
<body>
	<a id="new_recipe_btn" href="addemployer.jsp">Add FuelEmployer</a>
	<table class="admintable">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Number</th>
				<th>NIC</th>
				<th>Action</th>
			</tr>
		</thead>
		<c:forEach var="emp" items="${empdetails}">

			<c:set var="id" value="${emp.id}" />
			<c:set var="name" value="${emp.name}" />
			<c:set var="address" value="${emp.address}" />
			<c:set var="tel" value="${emp.tel}" />
			<c:set var="nic" value="${emp.nic}" />

			<tbody>
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.address}</td>
					<td>${emp.tel}</td>
					<td>${emp.nic}</td>
					<td><c:url value="UpdateEmp.jsp" var="empUpdate">

							<c:param name="id" value="${id}"></c:param>
							<c:param name="name" value="${name}"></c:param>
							<c:param name="address" value="${address}"></c:param>
							<c:param name="tel" value="${tel}"></c:param>
							<c:param name="nic" value="${nic}"></c:param>

						</c:url> <a href="${empUpdate}"> <input type="button"
							class="btn btn-warning" name="update" value="update">
					</a> <c:url value="deleteEmp.jsp" var="empDelete">

							<c:param name="id" value="${id}"></c:param>
							<c:param name="name" value="${name}"></c:param>
							<c:param name="address" value="${address}"></c:param>
							<c:param name="tel" value="${tel}"></c:param>
							<c:param name="nic" value="${nic}"></c:param>

						</c:url> <a href="${empDelete}"> <input type="button"
							class="btn btn-danger" name="delete" value="Delete Account">
					</a></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>