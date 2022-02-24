package advanceddevelopment.collections.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookService {

    private List<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getBooksByGenre(Genre genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getBooksBeforeYear(LocalDate date) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfRel().isBefore(date)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book getMostExpensiveBook() {
        return books.stream()
                .min(Comparator.comparing(Book::getPrice))
                .orElse(null);
    }

    public Book getCheapestBook() {
        return (Book) books.stream()
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .limit(1);
    }
}
