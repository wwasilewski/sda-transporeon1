package designpatterns.chainofresponsibility;

public class JavascriptInjection implements Handler {

    @Override
    public boolean stringFilter(String request) {
        return request.contains("javascript");
    }
}
