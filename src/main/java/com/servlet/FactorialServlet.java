// Build a servlet program to find the factorial of a number using HTML with step by step procedure.


package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")

public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Get number from HTML
        int num = Integer.parseInt(
                request.getParameter("num"));

        // Factorial calculation
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        // Display output
        out.println("<html><body>");

        out.println("<h2>Factorial Result</h2>");

        out.println("Factorial of "
                + num + " is: " + fact);

        out.println("</body></html>");
    }
}