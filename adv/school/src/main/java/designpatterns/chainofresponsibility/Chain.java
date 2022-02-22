package designpatterns.chainofresponsibility;

public class Chain {

    public static ChainElement getChainElement() {

        final ChainElement javascriptElement = new ChainElement(new JavascriptInjection());
        final ChainElement dashdashElement = new ChainElement(new SqlInjection(), javascriptElement);
        final ChainElement lastElement = new ChainElement(new StringLongerThan20(), dashdashElement);
        final ChainElement middleElement = new ChainElement(new StringEmpty(), lastElement);
        final ChainElement firstElement = new ChainElement(new StringNull(), middleElement);

        return firstElement;
    }
}
