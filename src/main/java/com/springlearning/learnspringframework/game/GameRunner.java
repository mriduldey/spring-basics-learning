package com.springlearning.learnspringframework.game;

public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.right();
        game.left();
        game.up();
        game.right();
    }
}
