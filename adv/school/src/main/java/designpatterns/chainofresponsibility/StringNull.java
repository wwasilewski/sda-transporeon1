package designpatterns.chainofresponsibility;

public class StringNull implements Handler {

    @Override
    public boolean stringFilter(String request) {
        return request == null;
    }
}
