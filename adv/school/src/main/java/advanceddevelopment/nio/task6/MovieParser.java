package advanceddevelopment.nio.task6;

public class MovieParser {

    public String toCSV(Movie movie) {
        return movie.getTitle() +
                "," +
                movie.getGenre() +
                "," +
                movie.getDirector() +
                "," +
                movie.getYearOfRelease() +
                System.lineSeparator();
    }

    public Movie fromCSV(String line) {
        String[] data = line.split(",");
        return new Movie(data[0], data[1], data[2], Integer.parseInt(data[3]));
    }
}
