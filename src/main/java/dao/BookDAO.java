package dao;

import java.util.ArrayList;
import dto.BookDTO;

public class BookDAO {

    private ArrayList<BookDTO> bookList = new ArrayList<>();

    public void insertBook(BookDTO book) {
        bookList.add(book);
    }

    public ArrayList<BookDTO> getBookList() {
        return bookList;
    }

}
