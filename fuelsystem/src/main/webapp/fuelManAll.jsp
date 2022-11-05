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
<a id="new_recipe_btn" href="addFuelMan.jsp">Add Manager</a>
	<table class="admintable">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Contact</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
		</thead>
		<c:forEach var="sman" items="${fuelMdetails}">

			<c:set var="id" value="${sman.id}" />
			<c:set var="name" value="${sman.name}" />
			<c:set var="tel" value="${sman.tel}" />
			<c:set var="password" value="${sman.password}" />
			<c:set var="address" value="${sman.address}" />
			<c:set var="nic" value="${sman.nic}" />
			<c:set var="marit" value="${sman.maritStataus}" />
			
			<tbody>
				<tr>
					<td>${sman.id}</td>
					<td>${sman.name}</td>
					<td>${sman.tel}</td>
					<td>${sman.address}</td>

					<td><c:url value="updateFuelMan.jsp" var="FuelManagerUpdate">

							<c:param name="id" value="${id}" />
							<c:param name="name" value="${name}" />
							<c:param name="tel" value="${tel}" />
							<c:param name="nic" value="${nic}" />
							<c:param name="password" value="${password}" />
							<c:param name="address" value="${address}" />
							<c:param name="marit" value="${marit}" />

						</c:url> <a href="${FuelManagerUpdate}"> <input type="button"
							class="btn btn-warning" name="update" value="update/view">
					</a> <c:url value="deleteFman.jsp" var="FManagerDelete">

							<c:param name="id" value="${id}" />
							<c:param name="name" value="${name}" />
							<c:param name="tel" value="${tel}" />
							<c:param name="nic" value="${nic}" />
							<c:param name="password" value="${password}" />
							<c:param name="address" value="${address}" />
							<c:param name="marit" value="${marit}" />

						</c:url> <a href="${FManagerDelete}"> <input type="button"
							class="btn btn-danger" name="delete" value="Delete Account">
					</a></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>
