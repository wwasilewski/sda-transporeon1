package advanceddevelopment.exceptions.task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public Book findByName(String name) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                return book;
            }
        }
        throw new NoBookFoundException("no book with such name");
    }

    public Book findById(int id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getBookId() == id) {
                return book;
            }
        }
        throw new NoBookFoundException("no book with such id ");
    }

    public void remove(int id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getBookId() == id) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("no book with such id - can't delete");
    }

    public void printAll() {
        books.forEach(System.out::println);
    }
}
