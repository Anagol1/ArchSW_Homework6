package presentation;

import data.BookStore;
import data.BookStoreInList;
import domain.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStoreInList();

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin", 34.99);
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", 29.99);
        Book book3 = new Book("3", "True Detective", "Darya Dontcova", 5.99);
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);
        bookStore.removeBook(book3);

        // Получаем список всех книг в магазине
        List<Book> allBooks = bookStore.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}
