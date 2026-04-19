package com.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Server-side validation
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        if (username == null || username.trim().isEmpty() ||
            email == null || email.trim().isEmpty() ||
            designation == null || designation.trim().isEmpty()) {

            response.sendRedirect("index.jsp");
            return;
        }

        if (!email.contains("@") || !email.contains(".")) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Store in session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("email", email);
        session.setAttribute("designation", designation);

        // Redirect to result page
        response.sendRedirect("result.jsp");
    }
}