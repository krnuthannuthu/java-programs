package Lab7c;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/prime")   // 👈 replaces web.xml
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String input = request.getParameter("num");

        out.println("<html><body>");

        try {
            int num = Integer.parseInt(input);

            if (num <= 1) {
                out.println("<h3>Number must be greater than 1</h3>");
            } else {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    out.println("<h2>" + num + " is a Prime Number</h2>");
                } else {
                    out.println("<h2>" + num + " is NOT a Prime Number</h2>");
                }
            }

        } catch (NumberFormatException e) {
            // Error handling
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // 400 error
            out.println("<h3>Error: Invalid number entered!</h3>");
        }

        out.println("<br><a href='index.html'>Try Again</a>");
        out.println("</body></html>");
    }
}
