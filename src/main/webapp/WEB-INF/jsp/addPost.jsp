<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Post Page</title>
</head>
<body>
<h1>Add Post</h1>
<form:form commandName="post">	
	<table>
		<tr>
			<td>Post title:</td>
			<td><form:input path="title"/></td>
		</tr>
		<tr>
			<td>Post body:</td>
			<td><form:input path="body"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Save"></td>
		</tr>
	</table>
</form:form>
</body>
</html>