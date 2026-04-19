<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Result Page</title>
</head>

<body>

<div style="width:300px;margin:auto;border:1px solid #ccc;padding:20px;">

<h2>Processing Result</h2>

<p style="color:green;">
    <%= request.getAttribute("message") %>
</p>

<%
    if (request.getAttribute("username") != null) {
%>

<h3>Submitted Data:</h3>

<p>Username: <%= request.getAttribute("username") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Designation: <%= request.getAttribute("designation") %></p>

<%
    }
%>

<br>
<a href="index.jsp">Back to Form</a>

</div>

</body>
</html>