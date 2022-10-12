<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	<div align="center">
		<h1>Add a word</h1>
		<form action="<%= request.getContextPath() %>/WordServlet" method="post">
			<div>
		        Letters:
		        <input name="letters" type="text" />
			</div>
			<div>
		        Size:
		        <input name="size" type="number" />
			</div>
			
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>