package com.usertracker.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/userVisit")

public class UserVisitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name =
                request.getParameter("username");

        int visitCount = 1;

        Cookie cookies[] = request.getCookies();

        if (cookies != null) {

            for (Cookie c : cookies) {

                if (c.getName().equals("visitCount")) {

                    visitCount =
                        Integer.parseInt(c.getValue());

                    visitCount++;
                }
            }
        }

        // Create visit cookie
        Cookie visitCookie =
                new Cookie("visitCount",
                        String.valueOf(visitCount));

        // Cookie expiry (45 seconds)
        visitCookie.setMaxAge(45);

        response.addCookie(visitCookie);

        // Create username cookie
        Cookie nameCookie =
                new Cookie("username", name);

        nameCookie.setMaxAge(45);

        response.addCookie(nameCookie);

        out.println("<html><body>");

        // Greeting Message
        out.println("<h2>");
        out.println("Welcome back "
                + name
                + "! You have visited this page "
                + visitCount
                + " times.");
        out.println("</h2>");

        // Cookie List Display
        out.println("<h3>List of Cookies:</h3>");

        Cookie cookieList[] =
                request.getCookies();

        if (cookieList != null) {

            for (Cookie c : cookieList) {

                out.println("<b>Cookie Name:</b> "
                        + c.getName()
                        + "<br>");

                out.println("<b>Cookie Value:</b> "
                        + c.getValue()
                        + "<br>");

                out.println("<b>Max Age:</b> "
                        + c.getMaxAge()
                        + "<br><br>");
            }
        }

        out.println("<p>");
        out.println("Cookie expiry time set to 45 seconds.");
        out.println("</p>");

        out.println("</body></html>");
    }
}