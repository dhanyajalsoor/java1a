package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/visit")

public class VisitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        boolean found = false;

        Cookie cookies[] = request.getCookies();

        if (cookies != null) {

            for (Cookie c : cookies) {

                if (c.getName().equals("visitCount")) {

                    visitCount =
                      Integer.parseInt(c.getValue());

                    visitCount++;

                    found = true;
                }
            }
        }

        // Create visit count cookie
        Cookie visitCookie =
            new Cookie("visitCount",
                       String.valueOf(visitCount));

        // Expiry time (30 seconds)
        visitCookie.setMaxAge(30);

        response.addCookie(visitCookie);

        // Create name cookie
        Cookie nameCookie =
            new Cookie("username", name);

        nameCookie.setMaxAge(30);

        response.addCookie(nameCookie);

        // Display Output
        out.println("<html><body>");

        out.println("<h2>");

        out.println("Welcome back "
                + name
                + "! You have visited this page "
                + visitCount
                + " times.");

        out.println("</h2>");

        out.println("<h3>List of Cookies:</h3>");

        // Display cookie list
        if (cookies != null) {

            for (Cookie c : cookies) {

                out.println("Cookie Name: "
                        + c.getName()
                        + "<br>");

                out.println("Cookie Value: "
                        + c.getValue()
                        + "<br><br>");
            }
        }

        out.println("<p>");
        out.println("Cookie will expire in 30 seconds.");
        out.println("</p>");

        out.println("</body></html>");
    }
}