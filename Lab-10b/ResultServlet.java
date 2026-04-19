package com.HTTP_REQ_RES;
/*10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5
through JSP called index.jsp with client sided validation and submit to the servlet called
ResultServlet and process all the fields with server sided validation and display all the data
along with result ( Pass if all subjects greater than 40%) and Average marks through
result.jsp with a link to move to the client side*/
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/UserDataServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        String error = "";

        // Server-side validation
        if (username == null || username.trim().isEmpty()) {
            error = "Username is required";
        } else if (email == null || !email.contains("@")) {
            error = "Valid email is required";
        } else if (designation == null || designation.trim().isEmpty()) {
            error = "Designation is required";
        }

        if (!error.isEmpty()) {
            request.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
            return;
        }

        // Set attributes
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("designation", designation);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.jsp");
    }
}