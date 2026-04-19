<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Check</title>
</head>

<body>

<%
    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2 style="color:blue;">Hello <%= user %>!</h2>
        <p>Session is active.</p>
<%
    } else {
%>
        <h2 style="color:red;">Session Expired!</h2>
        <p>Please login again.</p>
<%
    }
%>

</body>
</html>