package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.BookDTO;
import util.DBConnection;

public class BookDAO {

public void insertBook(BookDTO book) {

    String sql =
        "INSERT INTO book(title, author, publisher, isbn, category, quantity) VALUES (?, ?, ?, ?, ?, ?)";

    try {

        Connection conn =
            DBConnection.getConnection();

        PreparedStatement pstmt =
            conn.prepareStatement(sql);

        pstmt.setString(1, book.getTitle());
        pstmt.setString(2, book.getAuthor());
        pstmt.setString(3, book.getPublisher());
        pstmt.setString(4, book.getIsbn());
        pstmt.setString(5, book.getCategory());
        pstmt.setInt(6, book.getQuantity());

        pstmt.executeUpdate();

        pstmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public List<BookDTO> getBookList() {

    List<BookDTO> list = new ArrayList<>();

    String sql = "SELECT * FROM book";

    try {

        Connection conn =
            DBConnection.getConnection();

        PreparedStatement pstmt =
            conn.prepareStatement(sql);

        ResultSet rs =
            pstmt.executeQuery();

        while(rs.next()) {

            BookDTO book =
                new BookDTO();

            book.setBookId(
                rs.getInt("book_id"));

            book.setTitle(
                rs.getString("title"));

            book.setAuthor(
                rs.getString("author"));

            book.setPublisher(
                rs.getString("publisher"));

            book.setIsbn(
                rs.getString("isbn"));

            book.setCategory(
                rs.getString("category"));

            book.setQuantity(
                rs.getInt("quantity"));

            list.add(book);
        }

        rs.close();
        pstmt.close();
        conn.close();

    } catch(Exception e) {
        e.printStackTrace();
    }

    return list;
}

public BookDTO getBook(int bookId) {

    BookDTO book = null;

    String sql =
        "SELECT * FROM book WHERE book_id=?";

    try {

        Connection conn =
            DBConnection.getConnection();

        PreparedStatement pstmt =
            conn.prepareStatement(sql);

        pstmt.setInt(1, bookId);

        ResultSet rs =
            pstmt.executeQuery();

        if(rs.next()) {

            book = new BookDTO();

            book.setBookId(rs.getInt("book_id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setPublisher(rs.getString("publisher"));
            book.setIsbn(rs.getString("isbn"));
            book.setCategory(rs.getString("category"));
            book.setQuantity(rs.getInt("quantity"));
        }

        rs.close();
        pstmt.close();
        conn.close();

    } catch(Exception e) {
        e.printStackTrace();
    }

    return book;
}

public void updateBook(BookDTO book) {

    String sql =
        "UPDATE book SET title=?, author=?, publisher=?, isbn=?, category=?, quantity=? WHERE book_id=?";

    try {

        Connection conn =
            DBConnection.getConnection();

        PreparedStatement pstmt =
            conn.prepareStatement(sql);

        pstmt.setString(1, book.getTitle());
        pstmt.setString(2, book.getAuthor());
        pstmt.setString(3, book.getPublisher());
        pstmt.setString(4, book.getIsbn());
        pstmt.setString(5, book.getCategory());
        pstmt.setInt(6, book.getQuantity());
        pstmt.setInt(7, book.getBookId());

        pstmt.executeUpdate();

        pstmt.close();
        conn.close();

    } catch(Exception e) {
        e.printStackTrace();
    }
}

public void deleteBook(int bookId) {

    String sql =
        "DELETE FROM book WHERE book_id=?";

    try {

        Connection conn =
            DBConnection.getConnection();

        PreparedStatement pstmt =
            conn.prepareStatement(sql);

        pstmt.setInt(1, bookId);

        pstmt.executeUpdate();

        pstmt.close();
        conn.close();

    } catch(Exception e) {
        e.printStackTrace();
    }
}

}
