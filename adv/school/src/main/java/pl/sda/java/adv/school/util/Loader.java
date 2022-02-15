package pl.sda.java.adv.school.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface Loader<T> {
    List<T> loadData(InputStream inputStream) throws IOException;
}
