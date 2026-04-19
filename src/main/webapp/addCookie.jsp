<%@ page language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
<title>Add Cookie</title>
</head>

<body>

<%

String cname = request.getParameter("cname");
String domain = request.getParameter("domain");
int maxage = Integer.parseInt(
                request.getParameter("maxage"));

// Create cookie
Cookie cookie = new Cookie(cname, cname);

// Set domain
cookie.setDomain(domain);

// Set expiry time
cookie.setMaxAge(maxage);

// Add cookie
response.addCookie(cookie);

%>

<h2>Cookie Added Successfully!</h2>

<p>
Cookie Name: <%= cname %>
</p>

<p>
Domain: <%= domain %>
</p>

<p>
Max Expiry Age: <%= maxage %> seconds
</p>

<br>

<a href="showCookies.jsp">
Go to Active Cookie List
</a>

</body>
</html>