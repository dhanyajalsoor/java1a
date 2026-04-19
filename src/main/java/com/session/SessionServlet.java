package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get session (create if not exists)
        HttpSession session = request.getSession();

        // Set session timeout = 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);

        // Visit count logic
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        // Session details
        String sessionId = session.getId();
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        // Output
        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");

        out.println("<b>Session ID:</b> " + sessionId + "<br><br>");
        out.println("<b>Session Creation Time:</b> " + creationTime + "<br><br>");
        out.println("<b>Last Access Time:</b> " + lastAccessTime + "<br><br>");
        out.println("<b>Visit Count:</b> " + visitCount + "<br><br>");

        out.println("<hr>");
        out.println("<p>Session will expire after 1 minute of inactivity.</p>");

        out.println("</body></html>");
    }
}