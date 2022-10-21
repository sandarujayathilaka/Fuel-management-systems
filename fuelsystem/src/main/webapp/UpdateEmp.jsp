<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	String id =request.getParameter("id");
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String tel=request.getParameter("tel");
	String nic=request.getParameter("nic");

%>

<form method = "post" action="updatedetails">
ID : <input type="text" name="id" value="<%=id%>" readonly><br><br>
Name : <input type="text" name="name" value="<%=name%>"><br><br>
Tel  : <input type="text" name="tel" value="<%=tel%>"><br><br>
Address : <input type="text" name="address" value="<%=address%>"><br><br>
NIC  :<input type="text" name="nic" value="<%=nic%>"><br><br>

<input type ="submit" name="sub" value="update">


</body>
</html>