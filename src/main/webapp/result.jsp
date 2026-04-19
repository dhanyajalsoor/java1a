<%@ page import="java.util.*" %>

<%
    String rollno = (String) session.getAttribute("rollno");
    String name = (String) session.getAttribute("name");

    Integer sub1 = (Integer) session.getAttribute("sub1");
    Integer sub2 = (Integer) session.getAttribute("sub2");
    Integer sub3 = (Integer) session.getAttribute("sub3");
    Integer sub4 = (Integer) session.getAttribute("sub4");
    Integer sub5 = (Integer) session.getAttribute("sub5");

    Integer total = (Integer) session.getAttribute("total");
    Float avg = (Float) session.getAttribute("avg");
    String result = (String) session.getAttribute("result");
%>

<html>
<head>
    <title>Result Page</title>
</head>
<body>

<h2>Student Result</h2>

<%
    if (rollno != null) {
%>

Roll No: <%= rollno %><br><br>
Name: <%= name %><br><br>

Sub1: <%= sub1 %><br>
Sub2: <%= sub2 %><br>
Sub3: <%= sub3 %><br>
Sub4: <%= sub4 %><br>
Sub5: <%= sub5 %><br><br>

Total Marks: <%= total %><br>
Average: <%= avg %><br>
Result: <b><%= result %></b><br><br>

<%
    } else {
%>

<h3>No Data Found / Session Expired</h3>

<%
    }
%>

<!-- Link to go back -->
<a href="index.jsp">Back to Student Form</a>

</body>
</html>