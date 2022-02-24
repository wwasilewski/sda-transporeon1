package advanceddevelopment.generics.task1;

public class Pair<T, U> {

    private T type1;
    private U type2;

    public Pair(T type1, U type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public T getType1() {
        return type1;
    }

    public void setType1(T type1) {
        this.type1 = type1;
    }

    public U getType2() {
        return type2;
    }

    public void setType2(U type2) {
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "type1=" + type1 +
                ", type2=" + type2 +
                '}';
    }
}
