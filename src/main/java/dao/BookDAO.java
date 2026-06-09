package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}