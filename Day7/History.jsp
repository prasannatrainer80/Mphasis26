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
<jsp:include page="Menu.jsp" /> <br/><br/>
<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
<c:set var="user" value="${sessionScope.user}" />
<c:set var="books" value="${libraryDao.history(user)}" />
	<table border="3" align="center">
		<tr>
			<th>TrId</th>
			<th>UserName</th>
			<th>Book Id</th>
			<th>From Date</th>
			<th>ToDate</th>
		</tr>
		<c:forEach var="book" items="${books}">
		<tr>
			<td>${book.trId}</td>
			<td>${book.userName}</td>
			<td>${book.bookId}</td>
			<td>${book.fromDate}</td>
			<td>${book.toDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>