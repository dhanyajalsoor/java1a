<%@ page language="java" %>

<html>
<head>
<title>Welcome Page</title>
</head>

<body>

<%

// Get username
String name = request.getParameter("username");

// Create session
session.setAttribute("user", name);

// Set session expiry time (1 minute = 60 seconds)
session.setMaxInactiveInterval(60);

// Get session value
String uname = (String)session.getAttribute("user");

if(uname != null)
{
%>

<h2>
Hello <%= uname %> !
</h2>

<p>
Session will expire after 1 minute.
</p>

<%
}
else
{
%>

<h2>
Session Expired!
</h2>

<%
}
%>

</body>
</html>