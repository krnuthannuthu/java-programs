package com.cookieservlet;
/*8b. Build a servlet program to create a cookie to get your name through text box and
press submit button( through HTML) to display the message by greeting Welcome back
your name ! , you have visited this page n times ( n = number of your visit ) along with the
list of cookies and its setvalues and demonstrate the expiry of cookie also.*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    int visitCount = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("userName");

        // Create name cookie
        if (name != null && !name.isEmpty()) {
            Cookie nameCookie = new Cookie("username", name);

            // Cookie expiry (30 seconds for demo)
            nameCookie.setMaxAge(30);

            response.addCookie(nameCookie);

            // Visit counter cookie
            Cookie visitCookie = new Cookie("visit", "1");
            visitCookie.setMaxAge(30);
            response.addCookie(visitCookie);
        }

        // Read cookies
        Cookie[] cookies = request.getCookies();

        String user = null;
        int visits = 0;

        out.println("<html><body>");

        out.println("<h2>Cookie Details</h2>");

        if (cookies != null) {

            out.println("<h3>All Cookies:</h3>");

            for (Cookie c : cookies) {
                out.println("<p>" + c.getName() + " = " + c.getValue() + "</p>");

                if (c.getName().equals("username")) {
                    user = c.getValue();
                }

                if (c.getName().equals("visit")) {
                    visits = Integer.parseInt(c.getValue());
                }
            }
        }

        // If user exists
        if (user != null) {

            visits++;
            Cookie updateVisit = new Cookie("visit", String.valueOf(visits));
            updateVisit.setMaxAge(30);
            response.addCookie(updateVisit);

            out.println("<h2 style='color:blue;'>Welcome back " + user + "!</h2>");
            out.println("<h3>You have visited this page " + visits + " times</h3>");

            out.println("<p><b>Cookie will expire in 30 seconds (demo)</b></p>");

        } else {
            out.println("<h2 style='color:red;'>No cookie found. Please enter name.</h2>");
        }

        out.println("</body></html>");
    }
}