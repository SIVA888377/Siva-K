<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="edit" modelAttribute="employee">
	
		<form:label path="id">Enter ID:</form:label>
		<form:input path="id"/><br><br>
		<form:label path="name">Name:</form:label>
		<form:input path="name"/><br><br>
		<form:label path="designation">Designation:</form:label>
		<form:input path="designation"/><br><br>
		<form:label path="phone">Phone Number:</form:label>
		<form:input path="phone"/><br><br>
		
		<input type="submit" value="UPDATE">
	</form:form>	

</body>
</html>