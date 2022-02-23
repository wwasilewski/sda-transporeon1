package advanceddevelopment.exceptions.task2;

public class Task2Main {

    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        repo.add(new Book(1, "title1", "author1", "2000"));
        repo.add(new Book(2, "title2", "author2", "2001"));
        repo.add(new Book(3, "title3", "author3", "2002"));

        repo.printAll();
        System.out.println();
        try {
            repo.remove(1);
            repo.printAll();
            repo.remove(5);
        } catch (NoBookFoundException e) {
            e.printStackTrace();
        }
    }
}
