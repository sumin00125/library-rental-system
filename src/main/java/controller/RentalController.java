package controller;

import dao.RentalDAO;
import dto.RentalDTO;

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

            String id = request.getParameter("id");

            if(id != null && !id.trim().isEmpty()) {

                int rentalId =
                    Integer.parseInt(id);

                RentalDAO dao =
                    new RentalDAO();

                dao.returnBook(rentalId);
            }

            response.sendRedirect(
                "rentalList.jsp");
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String bookTitle =
            request.getParameter("bookTitle");

        String borrower =
            request.getParameter("borrower");

        String rentalDate =
            request.getParameter("rentalDate");

        if(bookTitle != null) {
            bookTitle = bookTitle.trim();
        }

        if(borrower != null) {
            borrower = borrower.trim();
        }

        if(rentalDate != null) {
            rentalDate = rentalDate.trim();
        }

        if(bookTitle == null || bookTitle.isEmpty()
                || borrower == null || borrower.isEmpty()
                || rentalDate == null || rentalDate.isEmpty()) {

            response.sendRedirect(
                "rentalForm.jsp");
            return;
        }

        RentalDAO dao =
            new RentalDAO();

        if(dao.isRented(bookTitle)) {


            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");

            response.getWriter().println(
                "<script>"
                + "alert('Book already rented.');"
                + "location.href='rentalForm.jsp';"
                + "</script>");

            return;
        }

        RentalDTO rental =
            new RentalDTO();

        rental.setBookTitle(bookTitle);
        rental.setBorrower(borrower);
        rental.setRentalDate(rentalDate);
        rental.setReturnDate(null);

        dao.addRental(rental);

        response.sendRedirect(
            "rental?action=list");
    }
}