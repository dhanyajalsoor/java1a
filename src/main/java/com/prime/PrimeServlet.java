// Build a servlet program to check the given number is prime number or not using HTML with 
//step by step procedure.



package com.prime;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")

public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Get number from HTML
        int num = Integer.parseInt(
                request.getParameter("num"));

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }
        else {

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {

                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        out.println("<html><body>");

        if (isPrime) {

            out.println("<h2>"
                    + num
                    + " is a Prime Number"
                    + "</h2>");
        }
        else {

            out.println("<h2>"
                    + num
                    + " is NOT a Prime Number"
                    + "</h2>");
        }

        out.println("</body></html>");
    }
}