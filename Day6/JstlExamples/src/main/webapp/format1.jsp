<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="today" value="<%=new java.util.Date() %>" />
	<fmt:formatDate value="${today}" pattern="dd-MM-yyyy"/>
	<hr/>
	<fmt:formatDate value="${today}" type="both"
    dateStyle="medium" timeStyle="short"/> <br/><hr/>
    <fmt:formatDate value="${today}" 
    	pattern="EEEE, dd MMM yyyy HH:mm:ss"/>
    <c:set var="leaveStartDate" value="2026-10-21" />
    <fmt:parseDate value="${leaveStartDate}" 
    	pattern="yyyy-MM-dd" />
    <c:set var="no" value="1234.56789532" />
    <hr/>
    <fmt:formatNumber value="${no}" maxFractionDigits="2" />
  	<br/>
  	<fmt:formatNumber value="${no}" pattern="#,##0.00" />
  	<hr/>
  	Currency : 
  	<fmt:formatNumber value="${no}" type="currency" />
  	<hr/>
  	<fmt:parseNumber value="${no}" integerOnly="true" />
</body>
</html>