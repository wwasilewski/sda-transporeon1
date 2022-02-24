package advanceddevelopment.nio.task3;

import java.io.IOException;
import java.nio.file.*;

public class Task3Main {

    public static void main(String[] args) {
        writeToFile("hoho");
    }

    public static void writeToFile(String message) {
        Path path = Paths.get("D://test/dzialaj.txt");
        byte[] strToBytes = (System.lineSeparator() + message).getBytes();

        try {
            Files.write(path, strToBytes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
