<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Session Check</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");
%>

<h2>Session Status</h2>

<%
    if (user != null) {
%>
        <h3 style="color:green;">Hello <%= user %>!</h3>
        <p>Session is ACTIVE</p>
        <p>You can access this page within session time.</p>
<%
    } else {
%>
        <h3 style="color:red;">Session Expired!</h3>
        <p>Please start session again.</p>
<%
    }
%>

</body>
</html>l>