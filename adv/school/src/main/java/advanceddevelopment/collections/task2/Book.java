package advanceddevelopment.collections.task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Book {

    private String title;
    private float price;
    private LocalDate yearOfRel;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, float price, LocalDate yearOfRelease,
                List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRel = yearOfRelease;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getYearOfRel() {
        return yearOfRel;
    }

    public void setYearOfRel(LocalDate yearOfRel) {
        this.yearOfRel = yearOfRel;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Float.compare(book.getPrice(), getPrice()) == 0 && Objects.equals(getTitle(),
                book.getTitle()) && Objects.equals(getYearOfRel(), book.getYearOfRel())
                && Objects.equals(getAuthors(), book.getAuthors()) && getGenre() == book.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice(), getYearOfRel(), getAuthors(), getGenre());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfRel='" + yearOfRel + '\'' +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }
}
