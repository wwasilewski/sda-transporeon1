package designpatterns.game;

public class MainNewGame {

    public static void main(String[] args) {
        Game game = new Game(new ConsoleCommunication(), 200);
        game.newGame();
    }
}
