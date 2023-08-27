package com.springlearning.learnspringframework.game;

public class SuperContraGame implements GameConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Down");
    }

    public void left() {
        System.out.println("Left");
    }

    public void right() {
        System.out.println("Run Right");
    }
}
