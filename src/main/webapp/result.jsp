<%@ page import="java.util.*" %>

<%
    String username = (String) session.getAttribute("username");
    String email = (String) session.getAttribute("email");
    String designation = (String) session.getAttribute("designation");
%>

<html>
<head>
    <title>Result Page</title>
</head>
<body>

<h2>User Details</h2>

<%
    if (username != null) {
%>

    <p><b>Username:</b> <%= username %></p>
    <p><b>Email:</b> <%= email %></p>
    <p><b>Designation:</b> <%= designation %></p>

<%
    } else {
%>

    <p>No data found (session expired or invalid access).</p>

<%
    }
%>

<br>

<!-- Link to go back -->
<a href="index.jsp">Go Back to Form</a>

</body>
</html>