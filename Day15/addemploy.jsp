<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="addemploy.jsp">
		<center>
			Employ No : 
	<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
	<input type="text" name="name" /> <br/><br/>
			Gender : 
	<select name="gender">
		<option value="MALE">Male</option>
		<option value="FEMALE">Female</option>
	</select> <br/><br/>
	Department : 
	<select name="dept">
		<option value="DOTNET">Dotnet</option>
		<option value="JAVA">Java</option>
		<option value="SQL">Sql</option>
	</select> <br/><br/>
	Designation : 
	<select name="desig">
		<option value="Developer">Developer</option>
		<option value="TeamLead">TeamLead</option>
		<option value="Manager">Manager</option>
	</select> <br/><br/>
	Basic : 
	<input type="number" name="basic" /> <br/><br/>
	<input type="submit" value="Add Employ" />
		</center>
	</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
		<jsp:useBean id="beanHelper" class="com.java.hib.ContextHelper" />
	<c:set var="dao" value="${beanHelper.getSession()}" />
<jsp:useBean id="employ" class="com.java.hib.Employ" />
	<jsp:setProperty property="*" name="employ"/>
	<c:out value="${dao.saveEmploy(employ)}" />
	<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>