package advanceddevelopment.generics.task1;

public class Task1Main {

    public static void main(String[] args) {

        Pair pair1 = new Pair(10, "text");
        Pair<String, Integer> pair2 = new Pair("text", 12);

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
