package dto;

public class BookDTO {

    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String category;
    private int totalCount;
    private int availableCount;

    public BookDTO() {
}

public int getBookId() {
    return bookId;
}

public void setBookId(int bookId) {
    this.bookId = bookId;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

public String getPublisher() {
    return publisher;
}

public void setPublisher(String publisher) {
    this.publisher = publisher;
}

public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public String getCategory() {
    return category;
}

public void setCategory(String category) {
    this.category = category;
}

public int getTotalCount() {
    return totalCount;
}

public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
}

public int getAvailableCount() {
    return availableCount;
}

public void setAvailableCount(int availableCount) {
    this.availableCount = availableCount;
}

}

