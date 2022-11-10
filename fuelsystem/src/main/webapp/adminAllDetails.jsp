<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file = "UI.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin All Details</title>
 
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
</head>
<body>
	<a id="new_recipe_btn" href="addAdmin.jsp">Add Admin</a>
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
		<c:forEach var="admin" items="${adminDetails}">

			<c:set var="id" value="${admin.id}" />
			<c:set var="name" value="${admin.name}" />
			<c:set var="address" value="${admin.address}" />
			<c:set var="tel" value="${admin.tel}" />
			<c:set var="nic" value="${admin.nic}" />
			<c:set var="uname" value="${admin.uname}" />
			<c:set var="pass" value="${admin.password}" />
			

			<tbody>
				<tr>
					<td>${admin.id}</td>
					<td>${admin.name}</td>
					<td>${admin.address}</td>
					<td>${admin.tel}</td>
					<td>${admin.nic}</td>
					<td><c:url value="Updateadmin.jsp" var="adminUpdate">

							<c:param name="id" value="${id}"></c:param>
							<c:param name="name" value="${name}"></c:param>
							<c:param name="address" value="${address}"></c:param>
							<c:param name="tel" value="${tel}"></c:param>
							<c:param name="nic" value="${nic}"></c:param>
							<c:param name="uname" value="${uname}"></c:param>
							<c:param name="pass" value="${pass}"></c:param>

						</c:url> <a href="${adminUpdate}"> <input type="button"
							class="btn btn-warning" name="update" value="update">
					</a> <c:url value="deleteAdmin.jsp" var="adminDelete">

							<c:param name="id" value="${id}"></c:param>
							<c:param name="name" value="${name}"></c:param>
							<c:param name="address" value="${address}"></c:param>
							<c:param name="tel" value="${tel}"></c:param>
							<c:param name="nic" value="${nic}"></c:param>

						</c:url> <a href="${adminDelete}"> <input type="button"
							class="btn btn-danger" name="delete" value="Delete Account">
					</a></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>