<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String company = (String)session.getAttribute("company");
		String location = (String)session.getAttribute("location");
		
		out.println("Company is  <b> " +company+ "</b><br/>");
		out.println("Location is <b> " +location+ "</b><br/>");
	%>
</body>
</html>