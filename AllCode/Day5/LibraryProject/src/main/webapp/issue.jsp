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
<jsp:include page="Menu.jsp" />
<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
<c:set var="user" value="${sessionScope.user}" />
<c:forEach var="id" items="${paramValues.bookid}">
	<c:out value="${libraryDao.issueBook(id,user)}" />
	<br/>
</c:forEach>
</body>
</html>