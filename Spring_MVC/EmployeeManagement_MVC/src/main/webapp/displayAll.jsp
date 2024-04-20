<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1px">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items= "${employeeList}" var="employee">
			<tr>
				<td>${employee.getId()}</td>
				<td>${employee.getName()}</td>
				<td>${employee.getDesignation()}</td>
				<td>${employee.getPhone()}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>