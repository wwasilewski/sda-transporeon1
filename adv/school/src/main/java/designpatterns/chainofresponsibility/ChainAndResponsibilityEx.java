/*
Write a logic that will be filtering out requests (String):
null and empty requests
requests bigger than 20 chars
Write two versions of the logic, with and without chain of responsibility. Which version is better?
*/

package designpatterns.chainofresponsibility;

public class ChainAndResponsibilityEx {

    static final int MAX_REQUEST_SIZE = 20;

    public boolean stringFilter(String filter) {
        return filter == null || filter.isEmpty() || filter.length() > MAX_REQUEST_SIZE
                || filter.startsWith("--") || filter.contains("javascript");
    }
}
