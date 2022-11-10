<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file = "UI.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>manager All</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
</head>
<body>
<a id="new_recipe_btn" href="addSerManager.jsp">Add Manager</a>
	<table class="admintable">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Branch</th>
				<th>Contact</th>
				<th>email</th>
				<th>Action</th>
			</tr>
		</thead>
		<c:forEach var="sman" items="${serMdetails}">

			<c:set var="id" value="${sman.id}" />
			<c:set var="name" value="${sman.name}" />
			<c:set var="branch" value="${sman.branch}" />
			<c:set var="tel" value="${sman.tel}" />
			<c:set var="email" value="${sman.email}" />
			<c:set var="password" value="${sman.password}" />
			<c:set var="address" value="${sman.address}" />
			<c:set var="startdate" value="${sman.startdate}" />
			

			<tbody>
				<tr>
					<td>${sman.id}</td>
					<td>${sman.name}</td>
					<td>${sman.branch}</td>
					<td>${sman.tel}</td>
					<td>${sman.email}</td>

					<td><c:url value="updateManager.jsp" var="serManagerUpdate">

							<c:param name="id" value="${id}" />
							<c:param name="name" value="${name}" />
							<c:param name="branch" value="${branch}" />
							<c:param name="tel" value="${tel}" />
							<c:param name="email" value="${email}" />
							<c:param name="password" value="${password}" />
							<c:param name="address" value="${address}" />
							<c:param name="startdate" value="${startdate}" />

						</c:url> <a href="${serManagerUpdate}"> <input type="button"
							class="btn btn-warning" name="update" value="update">
					</a> <c:url value="deleteSerManager.jsp" var="serManagerDelete">

							<c:param name="id" value="${id}" />
							<c:param name="name" value="${name}" />
							<c:param name="branch" value="${branch}" />
							<c:param name="tel" value="${tel}" />
							<c:param name="email" value="${email}" />
							<c:param name="password" value="${password}" />
							<c:param name="address" value="${address}" />
							<c:param name="startdate" value="${startdate}" />

						</c:url> <a href="${serManagerDelete}"> <input type="button"
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
