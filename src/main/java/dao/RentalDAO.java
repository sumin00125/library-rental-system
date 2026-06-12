package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.RentalDTO;
import util.DBConnection;

public class RentalDAO {

    public void addRental(RentalDTO rental) {

        String sql =
            "INSERT INTO rental(book_title, borrower, rental_date, return_date) VALUES (?, ?, ?, ?)";

        try {

            Connection conn =
                DBConnection.getConnection();

            PreparedStatement pstmt =
                conn.prepareStatement(sql);

            pstmt.setString(1, rental.getBookTitle());
            pstmt.setString(2, rental.getBorrower());
            pstmt.setString(3, rental.getRentalDate());
            pstmt.setString(4, rental.getReturnDate());

            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public List<RentalDTO> getAllRentals() {

        List<RentalDTO> list =
            new ArrayList<>();

        String sql =
            "SELECT * FROM rental";

        try {

            Connection conn =
                DBConnection.getConnection();

            PreparedStatement pstmt =
                conn.prepareStatement(sql);

            ResultSet rs =
                pstmt.executeQuery();

            while(rs.next()) {

                RentalDTO rental =
                    new RentalDTO();

                rental.setRentalId(
                    rs.getInt("rental_id"));

                rental.setBookTitle(
                    rs.getString("book_title"));

                rental.setBorrower(
                    rs.getString("borrower"));

                rental.setRentalDate(
                    rs.getString("rental_date"));

                rental.setReturnDate(
                    rs.getString("return_date"));

                list.add(rental);
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void returnBook(int rentalId) {

        String sql =
            "UPDATE rental SET return_date = CURDATE() WHERE rental_id=?";

        try {

            Connection conn =
                DBConnection.getConnection();

            PreparedStatement pstmt =
                conn.prepareStatement(sql);

            pstmt.setInt(1, rentalId);

            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}