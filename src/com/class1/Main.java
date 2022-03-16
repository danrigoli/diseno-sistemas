package com.class1;

public class Main {

    public static void main(String[] args) {
	RockPaperScissor game = new RockPaperScissor();
    Integer choice = game.pick();
    game.play(choice);
    }
}
