<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Started</title>
</head>

<body>

<%
    String name = request.getParameter("uname");

    if (name != null) {

        out.print("Welcome! " + name);
        out.print("<br>Session has started... " + name);

        // Store in session
        session.setAttribute("user", name);
        out.print("<br>Your name has been stored in session object");

        // Set session timeout (1 minute)
        session.setMaxInactiveInterval(60);
        out.print("<br>One minute is set for session expiry");

        out.print("<br>Click below link within 1 minute or wait for expiry<br>");
    } else {
        out.print("No name received. Please go back.");
    }
%>

<br>
<a href="second.jsp">Display the value</a>

</body>
</html>