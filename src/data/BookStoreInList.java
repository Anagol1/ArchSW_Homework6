package data;


import domain.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс BookStoreInList представляет реализацию интерфейса BookStore,
 * использующую список для хранения книг.
 */
public class BookStoreInList implements BookStore{
    private List<Book> books;

    /**
     * Создает новый экземпляр класса BookStoreInList.
     */
    public BookStoreInList() {
        books = new ArrayList<>();
    }

    /**
     * Добавляет новую книгу в файл.
     *
     * @param book книга для добавления.
     */
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Получает книгу по его id из списка.
     *
     * @param id идентификатор товара.
     * @return книгу с указанным идентификатором или null, если книга не найдена.
     */
    @Override
    public Book getBookById(String id) {
        List<Book> books = getAllBooks();
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Удаляет все книги из списка.
     *
     * @param book книга для удаления.
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Получает все книги из списка.
     *
     * @return список всех книг.
     */
    public List<Book> getAllBooks() {
        return books;
    }
}


