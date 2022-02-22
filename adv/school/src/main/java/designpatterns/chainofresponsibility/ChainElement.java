package designpatterns.chainofresponsibility;

public class ChainElement {

    private Handler handler;
    private ChainElement next;

    public ChainElement(Handler chainOfResp, ChainElement next) {
        this.handler = chainOfResp;
        this.next = next;
    }

    public ChainElement(Handler chainOfResp) {
        this.handler = chainOfResp;
    }

    public boolean shouldBeFiltered(String request) {
        boolean result = handler.stringFilter(request);

        if (result) {
            return true;
        }
        if (next == null) {
            return false;
        }
        return next.shouldBeFiltered(request);
    }
}
