package com.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Server-side validation
        String rollno = request.getParameter("rollno");
        String name = request.getParameter("studentname");

        int sub1 = Integer.parseInt(request.getParameter("sub1"));
        int sub2 = Integer.parseInt(request.getParameter("sub2"));
        int sub3 = Integer.parseInt(request.getParameter("sub3"));
        int sub4 = Integer.parseInt(request.getParameter("sub4"));
        int sub5 = Integer.parseInt(request.getParameter("sub5"));

        if (rollno == null || name == null ||
            rollno.trim().isEmpty() || name.trim().isEmpty()) {

            response.sendRedirect("index.jsp");
            return;
        }

        // Calculate total & average
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        float avg = total / 5.0f;

        // Pass condition: each subject >= 40
        String result;

        if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40 &&
            sub4 >= 40 && sub5 >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Store in session
        HttpSession session = request.getSession();
        session.setAttribute("rollno", rollno);
        session.setAttribute("name", name);
        session.setAttribute("sub1", sub1);
        session.setAttribute("sub2", sub2);
        session.setAttribute("sub3", sub3);
        session.setAttribute("sub4", sub4);
        session.setAttribute("sub5", sub5);
        session.setAttribute("total", total);
        session.setAttribute("avg", avg);
        session.setAttribute("result", result);

        response.sendRedirect("result.jsp");
    }
}