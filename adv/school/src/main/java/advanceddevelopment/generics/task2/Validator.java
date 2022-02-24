package advanceddevelopment.generics.task2;

@FunctionalInterface
public interface Validator<T> {

    boolean validate(T value);
}
