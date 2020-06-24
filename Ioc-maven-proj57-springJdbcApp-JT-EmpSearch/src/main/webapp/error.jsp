<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;text-align:center">Error page- Internal Problem</h1>
message is::${errorMsg}
<%-- <% message is::<%=pageContext.findAttribute("errorMsg")%><br> --%> --%>
<br>
<a href="main.html">home</a>
</body>
</html>