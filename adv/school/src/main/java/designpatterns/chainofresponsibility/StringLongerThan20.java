package designpatterns.chainofresponsibility;

public class StringLongerThan20 implements Handler {

    @Override
    public boolean stringFilter(String request) {
        return request.length() > 20;
    }
}
