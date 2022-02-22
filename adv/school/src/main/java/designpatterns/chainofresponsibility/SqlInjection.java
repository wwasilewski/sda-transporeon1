package designpatterns.chainofresponsibility;

public class SqlInjection implements Handler {

    @Override
    public boolean stringFilter(String request) {
        return request.startsWith("--");
    }
}
