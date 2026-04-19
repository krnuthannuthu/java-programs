<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("uname");
    String timeStr = request.getParameter("time");

    int time = 60; // default 60 seconds

    if (timeStr != null) {
        time = Integer.parseInt(timeStr);
    }

    // Set session expiry time
    session.setMaxInactiveInterval(time);

    if (name != null) {
        session.setAttribute("user", name);
    }
%>

<h2 style="color:blue;">Hello <%= name %>!</h2>

<p>Session started successfully.</p>
<p>Session expiry time set to: <%= time %> seconds</p>

<br>

<a href="check.jsp">Click here to check session</a>

</body>
</html>