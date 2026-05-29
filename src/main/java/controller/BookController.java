package controller;

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
        }
    }

  protected void doPost(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

      request.setCharacterEncoding("UTF-8");

      String title = request.getParameter("title");
      String author = request.getParameter("author");

      System.out.println(title);
      System.out.println(author);

      response.sendRedirect("bookList.jsp");
  }
