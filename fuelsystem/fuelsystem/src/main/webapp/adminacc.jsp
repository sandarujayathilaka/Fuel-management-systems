<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Acc</title>
</head>
<body>

	<table border="1">
		<c:forEach var="admin" items="${adminDetails}">

			<c:set var="id" value="${admin.id}" />
			<c:set var="name" value="${admin.name}" />
			<c:set var="address" value="${admin.address}" />
			<c:set var="tel" value="${admin.tel}" />
			<c:set var="nic" value="${admin.nic}" />
			<c:set var="uname" value="${admin.uname}" />
			<c:set var="pass" value="${admin.pass}" />

			<tr>
				<td>Employer ID</td>
				<td>${admin.id}</td>
			</tr>
			<tr>
				<td>Employer Name</td>
				<td>${admin.name}</td>
			</tr>

			<tr>
				<td>Employer Address</td>
				<td>${admin.address}</td>
			</tr>

			<tr>
				<td>Contact Number</td>
				<td>${admin.tel}</td>
			</tr>

			<tr>
				<td>Nic</td>
				<td>${admin.nic}</td>
			</tr>


		</c:forEach>
	</table>

	<c:url value="Updateadmin.jsp" var="adminUpdate">

		<c:param name="id" value="${id}"></c:param>
		<c:param name="name" value="${name}"></c:param>
		<c:param name="address" value="${address}"></c:param>
		<c:param name="tel" value="${tel}"></c:param>
		<c:param name="nic" value="${nic}"></c:param>
		<c:param name="uname" value="${uname}"></c:param>
		<c:param name="pass" value="${pass}"></c:param>

	</c:url>

	<a href="${adminUpdate}"> <input type="button" name="update"
		value="update">
	</a>

	<c:url value="deleteAdmin.jsp" var="adminDelete">

		<c:param name="id" value="${id}"></c:param>
		<c:param name="name" value="${name}"></c:param>
		<c:param name="address" value="${address}"></c:param>
		<c:param name="tel" value="${tel}"></c:param>
		<c:param name="nic" value="${nic}"></c:param>
		<c:param name="uname" value="${uname}"></c:param>
		<c:param name="pass" value="${pass}"></c:param>

	</c:url>

	<a href="${adminDelete}"> <input type="button" name="delete"
		value="Delete Account">
	</a>
</body>
</html>