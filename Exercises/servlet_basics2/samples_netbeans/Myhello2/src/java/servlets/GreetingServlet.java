/*
 * Copyright (c) 2006 Sun Microsystems, Inc.  All rights reserved.  U.S.
 * Government Rights - Commercial software.  Government users are subject
 * to the Sun Microsystems, Inc. standard license agreement and
 * applicable provisions of the FAR and its supplements.  Use is subject
 * to license terms.
 *
 * This distribution may include materials developed by third parties.
 * Sun, Sun Microsystems, the Sun logo, Java and J2EE are trademarks
 * or registered trademarks of Sun Microsystems, Inc. in the U.S. and
 * other countries.
 *
 * Copyright (c) 2006 Sun Microsystems, Inc. Tous droits reserves.
 *
 * Droits du gouvernement americain, utilisateurs gouvernementaux - logiciel
 * commercial. Les utilisateurs gouvernementaux sont soumis au contrat de
 * licence standard de Sun Microsystems, Inc., ainsi qu'aux dispositions
 * en vigueur de la FAR (Federal Acquisition Regulations) et des
 * supplements a celles-ci.  Distribue par des licences qui en
 * restreignent l'utilisation.
 *
 * Cette distribution peut comprendre des composants developpes par des
 * tierces parties. Sun, Sun Microsystems, le logo Sun, Java et J2EE
 * sont des marques de fabrique ou des marques deposees de Sun
 * Microsystems, Inc. aux Etats-Unis et dans d'autres pays.
 */


package servlets;

import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 * This is a simple example of an HTTP Servlet.  It responds to the GET
 * method of the HTTP protocol.
 */
public class GreetingServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        response.setBufferSize(8192);

        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession();
        String user = (String)request.getAttribute("user");
        
        request.setAttribute("foo", "bar");

        // then write the data of the response
        out.println("<html>" + "<head><title>Hello</title></head>");

        // then write the data of the response
        out.println("<body  bgcolor=\"#ffffff\">" +
            "<img src=\"duke.waving.gif\" alt=\"Duke waving\">");
        if(user != null && user.length() > 0) {
            out.println("<h1>Welcome back, "+user+"!</h1>");
        }
        out.println("<h2>" + getInitParameter("greeting") + "</h2>" +
            "<form method=\"get\">" +
            "<input type=\"text\" name=\"username\" size=\"25\" placeholder=\"Name\">" + "<p></p>" +
            "<input type=\"text\" name=\"hobby\" size=\"25\" placeholder=\"Hobby\">" + "<p></p>" +
            "<input type=\"text\" name=\"birthplace\" size=\"25\" placeholder=\"Birth place\">" + "<p></p>" +
            "<input type=\"submit\" value=\"Submit\">" +
            "<input type=\"reset\" value=\"Reset\">" + "</form>");

        String username = request.getParameter("username");

        if ((username != null) && (username.length() > 0)) {
            RequestDispatcher dispatcher =
                getServletContext()
                    .getRequestDispatcher("/response");

            if (dispatcher != null) {
                dispatcher.include(request, response);
            }
        }

        out.println("</body></html>");
        out.close();
    }

    public String getServletInfo() {
        return "The Hello servlet says hello.";
    }
}
