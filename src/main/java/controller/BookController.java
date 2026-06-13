package controller;

import dao.BookDAO;
import dto.BookDTO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class BookController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public BookController() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if(action == null) {

            response.sendRedirect("index.jsp");

        } else if(action.equals("list")) {

            response.sendRedirect("bookList.jsp");

        } else if(action.equals("form")) {

            response.sendRedirect("bookForm.jsp");

        } else if(action.equals("detail")) {

            int bookId =
                Integer.parseInt(
                    request.getParameter("id"));

            BookDAO dao =
                new BookDAO();

            BookDTO book =
                dao.getBook(bookId);

            request.setAttribute(
                "book", book);

            request.getRequestDispatcher(
                "bookDetail.jsp")
                .forward(request, response);

        } else if(action.equals("update")) {

            int bookId =
                Integer.parseInt(
                    request.getParameter("id"));

            BookDAO dao =
                new BookDAO();

            BookDTO book =
                dao.getBook(bookId);

            request.setAttribute(
                "book", book);

            request.getRequestDispatcher(
                "bookForm.jsp")
                .forward(request, response);

        } else if(action.equals("delete")) {

            int bookId =
                Integer.parseInt(
                    request.getParameter("id"));

            BookDAO dao =
                new BookDAO();

            dao.deleteBook(bookId);

            response.sendRedirect(
                "bookList.jsp");
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String bookId =
            request.getParameter("bookId");

        String title =
            request.getParameter("title");

        String author =
            request.getParameter("author");

        String publisher =
            request.getParameter("publisher");

        String isbn =
            request.getParameter("isbn");

        String category =
            request.getParameter("category");

        int quantity =
            Integer.parseInt(
                request.getParameter("quantity"));

        BookDTO book =
            new BookDTO();

        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setIsbn(isbn);
        book.setCategory(category);
        book.setQuantity(quantity);

        BookDAO dao =
            new BookDAO();

        if(bookId == null ||
                bookId.isEmpty()) {

            dao.insertBook(book);

        } else {

            book.setBookId(
                Integer.parseInt(bookId));

            dao.updateBook(book);
        }

        response.sendRedirect(
            "book?action=list");
    }
}
