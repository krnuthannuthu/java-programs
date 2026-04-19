<!DOCTYPE html>
<html>
<head>
<title>Result Page</title>
</head>

<body>

<h2>User Details</h2>

<%
    String error = (String) request.getAttribute("error");

    if (error != null) {
%>

<h3 style="color:red;"><%= error %></h3>

<%
    } else {
%>

<p>Username: <%= request.getAttribute("username") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Designation: <%= request.getAttribute("designation") %></p>

<h3 style="color:green;">User data processed successfully</h3>

<%
    }
%>

<br>
<a href="index.jsp">Back to Form</a>

</body>
</html>