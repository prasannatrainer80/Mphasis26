<%@page import="com.java.jsp.dao.EmployDaoImpl"%>
<%@page import="com.java.jsp.dao.EmployDao"%>
<%@page import="com.java.jsp.model.Employ"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/>
			<input type="submit" value="Search" /> 
		</center>
	</form>
	<%
		if(request.getParameter("empno")!=null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmployDao employDao = new EmployDaoImpl();
			Employ employ = employDao.searchEmploy(empno);
			out.println("Employ No  " +employ.getEmpno() + "<Br/>");
			out.println("Employ Name  " +employ.getName() + "<Br/>");
			out.println("Gender  " +employ.getGender() + "<Br/>");
			out.println("Department  " +employ.getDept() + "<Br/>");
			out.println("Designation  " +employ.getDesig() + "<Br/>");
			out.println("Basic  " +employ.getBasic() + "<Br/>");
			
		}
	%>
</body>
</html>