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
<a id="new_recipe_btn" href="addFuelMan.jsp">Add Data</a>
	<table class="admintable">
		<thead>
			<tr>
				<th>Date</th>
				<th>InitialQun</th>
				<th>remainQun</th>
				<th>DayPrice</th>
				<th>Share</th>
				<th>Action</th>
			</tr>
		</thead>
		<c:forEach var="diesel" items="${dieselData}">
		
			<c:set var="id" value="${diesel.id}" />
			<c:set var="date" value="${diesel.date}" />
			<c:set var="tcost" value="${diesel.transportCost}" />
			<c:set var="tax" value="${diesel.tax}" />
			<c:set var="dispenser" value="${diesel.dispenserMaintainCost}" />
			<c:set var="initqun" value="${diesel.initialQuantity}" />
			<c:set var="dprice" value="${diesel.dayPrice}" />
			<c:set var="rqun" value="${diesel.restQuantity}" />
			<c:set var="share" value="${diesel.profitShare}" />
			
			<tbody>
				<tr>
					<td>${date}</td>
					<td>${initqun}</td>
					<td>${rqun}</td>
					<td>${dprice}</td>
					<td>${share}</td>

					<td><c:url value="UpdateDiesel.jsp" var="dieselData">
					
					
							<c:param name="id" value="${id}" />
							<c:param name="date" value="${date}" />
							<c:param name="tcost" value="${tcost}" />
							<c:param name="tax" value="${tax}" />
							<c:param name="dispenser" value="${dispenser}" />
							<c:param name="initqun" value="${initqun}" />
							<c:param name="dprice" value="${dprice}" />
							<c:param name="rqun" value="${rqun}" />
							<c:param name="share" value="${share}" />

						</c:url> <a href="${dieselData}"> <input type="button"
							class="btn btn-warning" name="update" value="update">
					</a> 
					
					
					<c:url value="deleteDiesel.jsp" var="dataDelete">
					
					
							<c:param name="id" value="${id}" />
							<c:param name="date" value="${date}" />
							<c:param name="tcost" value="${tcost}" />
							<c:param name="tax" value="${tax}" />
							<c:param name="dispenser" value="${dispenser}" />
							<c:param name="initqun" value="${initqun}" />
							<c:param name="dprice" value="${dprice}" />
							<c:param name="rqun" value="${rqun}" />
							<c:param name="share" value="${share}" />

						</c:url> <a href="${dataDelete}"> <input type="button"
							class="btn btn-danger" name="delete" value="Delete">
					</a>
					
					
					 <c:url value="calDiesel" var="calculate">
					
					
							<c:param name="id" value="${id}" />

						</c:url> <a href="${calculate}"> <input type="button"
							class="btn btn-success" name="calculate" value="calculate">
					</a>
					
					</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	
	

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>