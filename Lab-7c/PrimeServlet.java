package com.prime;
/*7c. Build a servlet program to check the given number is prime number or not , using
HTML with Error Code when an invalid number is entered step by step procedure.*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            // Error handling
            if (number <= 0) {
                throw new IllegalArgumentException("Number must be greater than 0");
            }

            boolean isPrime = true;

            if (number == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Output
            out.println("<html><body>");
            out.println("<h2>Prime Number Result</h2>");
            out.println("<p>Number: " + number + "</p>");

            if (isPrime) {
                out.println("<h3 style='color:green;'>It is a Prime Number</h3>");
            } else {
                out.println("<h3 style='color:red;'>It is NOT a Prime Number</h3>");
            }

            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            showError(out, "Invalid input: Please enter a valid number");
        } catch (IllegalArgumentException e) {
            showError(out, e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }

    private void showError(PrintWriter out, String message) {
        out.println("<html><body>");
        out.println("<h2 style='color:red;'>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}