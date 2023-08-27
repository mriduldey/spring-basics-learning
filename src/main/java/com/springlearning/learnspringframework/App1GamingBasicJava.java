package com.springlearning.learnspringframework;

import com.springlearning.learnspringframework.game.GameRunner;
import com.springlearning.learnspringframework.game.MarioGame;
import com.springlearning.learnspringframework.game.SuperContraGame;

public class App1GamingBasicJava {
    public static  void main(String[] args) {
        var marioGame = new MarioGame();
        var superContra = new SuperContraGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

        gameRunner = new GameRunner(superContra);
        gameRunner.run();
    }
}
