<%@ page import="java.util.*" %>

<%
    // Set session expiry time (example: 2 minutes = 120 seconds)
    int expiryTime = 120;
    session.setMaxInactiveInterval(expiryTime);

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
    <p><b>Session Expiry Time:</b> <%= expiryTime %> seconds</p>

    <hr>

    <!-- Link to check session -->
    <a href="check.jsp">Click here to check session status</a>

    <br><br>

    <p>Wait for <b>2 minutes</b> without activity to see session expiry.</p>

<%
    } else {
%>

    <h2>Session not found</h2>
    <a href="index.jsp">Go back</a>

<%
    }
%>

</body>
</html>