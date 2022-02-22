package designpatterns.singleton;

public class Game {

    public static void main(String[] args) {
        Game instance = Game.getInstance();
        System.out.println(instance);

        Game instance2 = Game.getInstance();
        System.out.println(instance2);
    }

    private static Game instance = null;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
}
