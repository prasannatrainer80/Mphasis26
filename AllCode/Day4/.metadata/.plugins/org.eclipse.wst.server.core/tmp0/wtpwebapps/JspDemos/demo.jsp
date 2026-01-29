<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="demo.jsp">
		<center>
			Student Name :
			<input type="text" name="sname" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form> <hr/>
	<%
		if (request.getParameter("sname")!=null) {
			String sname = request.getParameter("sname");
			out.println("Student name is " +sname);
		}
	%>
</body>
</html>