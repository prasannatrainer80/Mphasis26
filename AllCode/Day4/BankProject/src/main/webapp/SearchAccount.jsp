<%@page import="com.java.bank.model.Accounts"%>
<%@page import="com.java.bank.dao.AccountsDaoImpl"%>
<%@page import="com.java.bank.dao.AccountsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="SearchAccount.jsp">
		<center>
			Account No : 
		<input type='number' name="accountNo" /> <br/><br/>
		<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null) {
			int accno = Integer.parseInt(request.getParameter("accountNo"));
			AccountsDao accountsDao = new AccountsDaoImpl();
			Accounts account = accountsDao.searchAccount(accno);
			out.println("Account No " +account.getAccountNo() +"<br/>");
			out.println("FirstName " +account.getFirstName() +"<br/>");
			out.println("LastName " +account.getLastName() +"<br/>");
			out.println("City " +account.getCity() +"<br/>");
			out.println("State " +account.getState() +"<br/>");
			out.println("Amount " +account.getAmount() +"<br/>");
			out.println("CheqFacil " +account.getCheqFacil() +"<br/>");
			out.println("Account Type " +account.getAccountType() +"<br/>");
			
		}
	%>
</body>
</html>