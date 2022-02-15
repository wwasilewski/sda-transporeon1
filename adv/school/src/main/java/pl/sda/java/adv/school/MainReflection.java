package pl.sda.java.adv.school;

import pl.sda.java.adv.school.model.Student;
import pl.sda.java.adv.school.util.Loader;

import java.lang.reflect.InvocationTargetException;

public class MainReflection {
    public static void main(String[] args) throws LoaderCreationException{
        Loader<Student> loader = createLoader("pl.sda.java.adv.school.util.CsvStudentsLoader");
        System.out.println(loader);
    }

    public static Loader<Student> createLoader(String classCanonicalName) throws LoaderCreationException {
        Class<?> loaderClass;

        try {
            loaderClass = Class.forName(classCanonicalName);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new LoaderCreationException(classNotFoundException);
        }

        Object loaderInstance;

        try {
            loaderInstance = loaderClass.getDeclaredConstructor().newInstance();
        }
        catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new LoaderCreationException(e);
        }

        return (Loader<Student>) loaderInstance;
    }

    public static class LoaderCreationException extends Exception {
        public LoaderCreationException(Throwable cause) {
            super(cause);
        }
    }
}
