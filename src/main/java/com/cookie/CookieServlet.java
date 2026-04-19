//. Build a servlet program to create a cookie to get your name through text box and press submit button
//( through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
//n times ( n = number of your visit ) and demonstrate the expiry of cookie also.



package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookieServlet")

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        // Get existing cookies
        Cookie cookies[] = request.getCookies();

        boolean found = false;

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

        // Create/Update visit count cookie
        Cookie visitCookie =
            new Cookie("visitCount",
                       String.valueOf(visitCount));

        // Cookie expiry time (30 seconds)
        visitCookie.setMaxAge(30);

        response.addCookie(visitCookie);

        // Create name cookie
        Cookie nameCookie =
            new Cookie("username", name);

        // Expiry (30 seconds)
        nameCookie.setMaxAge(30);

        response.addCookie(nameCookie);

        // Display message
        out.println("<html><body>");

        out.println("<h2>");

        out.println("Welcome back "
                + name
                + "! You have visited this page "
                + visitCount
                + " times.");

        out.println("</h2>");

        out.println("<p>Cookie will expire in 30 seconds.</p>");

        out.println("</body></html>");
    }
}