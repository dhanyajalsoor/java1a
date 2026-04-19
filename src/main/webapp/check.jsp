<%@ page import="java.util.*" %>

<%
    String user = (String) session.getAttribute("username");
%>

<html>
<body>

<%
    if (user != null) {
%>

    <h2>Session is ACTIVE</h2>
    <p>Hello <%= user %>, your session is still valid.</p>

    <p><b>Session ID:</b> <%= session.getId() %></p>
    <p><b>Last Access Time:</b> <%= new Date(session.getLastAccessedTime()) %></p>

    <a href="check.jsp">Refresh Check</a>

<%
    } else {
%>

    <h2>SESSION EXPIRED</h2>
    <p>Your session has expired due to inactivity.</p>

    <a href="index.jsp">Login Again</a>

<%
    }
%>

</body>
</html>