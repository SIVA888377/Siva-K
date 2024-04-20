<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1px" style="border-collapse: collapse;">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${employee.getId()}</td>
				<td>${employee.getName()}</td>
				<td>${employee.getDesignation()}</td>
				<td>${employee.getPhone()}</td>
			</tr>
		</tbody>
	</table><br><br>
	<button><a href="index.jsp">Home</a></button>
	

</body>
</html>