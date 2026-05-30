package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rental")
public class RentalController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public RentalController() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if(action == null) {

            response.sendRedirect("index.jsp");

        } else if(action.equals("list")) {

            response.sendRedirect("rentalList.jsp");

        } else if(action.equals("rent")) {

            response.sendRedirect("rentalForm.jsp");

        } else if(action.equals("return")) {

            response.sendRedirect("rentalList.jsp");
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}
