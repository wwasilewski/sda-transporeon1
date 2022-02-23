package advanceddevelopment.exceptions;

public class Task1 {

    public float divide(int n1, int n2) throws MyException {
        if (n2 == 0) {
            throw new MyException();
        }
        return n1 / n2;
    }
}
