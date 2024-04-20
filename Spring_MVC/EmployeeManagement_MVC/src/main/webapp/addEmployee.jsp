<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	body {
		display: flex;
		justify-content: center;
		align-items: center;
		height: 100vh;
		margin: 0;
	}

	form {
		width: 300px;
		background-color: #f2f2f2;
		padding: 20px;
		border-radius: 10px;
		box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
	}

	label, input[type="text"] {
		display: block;
	}

	label {
		text-align: left;
		color: #333;
		margin-bottom: 5px;
	}

	input[type="text"] {
		width: calc(100% - 20px);
		padding: 10px;
		margin-bottom: 10px;
		border: 1px solid #ccc;
		border-radius: 5px;
		box-sizing: border-box;
	}

	input[type="submit"] {
		width: 100%;
		padding: 10px;
		background-color: #4CAF50;
		color: white;
		border: none;
		border-radius: 5px;
		cursor: pointer;
	}

	input[type="submit"]:hover {
		background-color: #45a049;
	}
		
</style>

</head>
<body>

	<form:form action="create" modelAttribute="employee">
	
		<form:label path="name">Name: </form:label>
		<form:input path="name"/>
		<form:label path="designation">Designation: </form:label>
		<form:input path="designation"/>
		<form:label path="phone">Phone Number: </form:label>
		<form:input path="phone"/>
		
		<input type="submit" value="Save">
	
	</form:form>

</body>
</html>