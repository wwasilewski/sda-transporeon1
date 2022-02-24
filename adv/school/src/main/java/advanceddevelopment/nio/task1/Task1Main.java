package advanceddevelopment.nio.task1;

import java.io.File;

public class Task1Main {

    public static void main(String[] args) {
        File file = new File("D://test");
        String[] allFiles = file.list();

        for (String allFile : allFiles) {
            System.out.println(allFile);
        }
    }
}
