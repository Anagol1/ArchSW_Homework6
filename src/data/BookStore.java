package data;

import domain.Book;

import java.util.List;

public interface BookStore {
    List<Book> getAllBooks();
    void removeBook(Book book);
    void addBook(Book book);
    Book getBookById(String id);

}
