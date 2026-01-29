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
	<form method="get" action="CaseEx.jsp">
		<center>
			Choice : 
			<input type="number" name="choice" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.choice !=null}">
		<c:set var="choice" value="${param.choice}" />
		<c:choose>
			<c:when test="${choice==1}">
				<c:out value="Hi I am Srinivas" />
			</c:when>
			<c:when test="${choice==2}">
				<c:out value="Hi I am Srividya" />
			</c:when>
			<c:when test="${choice==3}">
				<c:out value="Hi I am Sashank" />
			</c:when>
			<c:when test="${choice==4}">
				<c:out value="Hi I am Mythri" />
			</c:when>
			<c:when test="${choice==5}">
				<c:out value="Hi I am Likthita" />
			</c:when>
			<c:otherwise>
				<c:out value="Invalid Choice..." />
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>