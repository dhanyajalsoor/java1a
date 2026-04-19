<%@ page import="java.util.*" %>
<%
    // Set session expiry time = 1 minute (60 seconds)
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("username", name);
    }

    String user = (String) session.getAttribute("username");
%>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    if (user != null) {
%>

    <h2>Hello <%= user %>!</h2>

    <p><b>Session ID:</b> <%= session.getId() %></p>
    <p><b>Session Creation Time:</b> <%= new Date(session.getCreationTime()) %></p>
    <p><b>Last Access Time:</b> <%= new Date(session.getLastAccessedTime()) %></p>

    <hr>
    <p>Session will expire after 1 minute of inactivity.</p>

    <form action="welcome.jsp">
        <input type="submit" value="Refresh Page (Check Session)" />
    </form>

<%
    } else {
%>

    <h2>Session Expired or Not Found</h2>
    <p>Please go back and enter your name again.</p>

    <a href="index.jsp">Go to Login Page</a>

<%
    }
%>

</body>
</html>