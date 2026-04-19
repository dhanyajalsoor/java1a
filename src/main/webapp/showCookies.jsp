<%@ page language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
<title>Active Cookies</title>
</head>

<body>

<h2>Active Cookie List</h2>

<%

Cookie cookies[] = request.getCookies();

if(cookies != null)
{
    for(int i=0; i<cookies.length; i++)
    {
%>

<p>
Cookie Name:
<%= cookies[i].getName() %>

<br>

Cookie Value:
<%= cookies[i].getValue() %>

<br>

Max Age:
<%= cookies[i].getMaxAge() %>

</p>

<hr>

<%
    }
}
else
{
%>

<p>No Active Cookies Found</p>

<%
}
%>

</body>
</html>